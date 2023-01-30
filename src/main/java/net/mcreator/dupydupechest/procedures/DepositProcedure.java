package net.mcreator.dupydupechest.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.Entity;

import java.util.concurrent.atomic.AtomicReference;

public class DepositProcedure {
	public static ItemStack execute(Entity entity) {
		if (entity == null)
			return ItemStack.EMPTY;
		return new Object() {
			public ItemStack getItemStack(int sltid, Entity entity) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				entity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					_retval.set(capability.getStackInSlot(sltid).copy());
				});
				return _retval.get();
			}
		}.getItemStack(16, entity);
	}
}
