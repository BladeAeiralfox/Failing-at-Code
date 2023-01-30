
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dupydupechest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.dupydupechest.world.inventory.TheoldenchestMenu;
import net.mcreator.dupydupechest.DupyDupeChestMod;

public class DupyDupeChestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, DupyDupeChestMod.MODID);
	public static final RegistryObject<MenuType<TheoldenchestMenu>> THEOLDENCHEST = REGISTRY.register("theoldenchest",
			() -> IForgeMenuType.create(TheoldenchestMenu::new));
}
