package net.mcreator.dupydupechest.block.entity;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.network.protocol.game.ClientboundBlockEntityDataPacket;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.core.BlockPos;

import net.mcreator.dupydupechest.init.DupyDupeChestModBlockEntities;

public class MagesaplingBlockEntity extends BlockEntity {
	public MagesaplingBlockEntity(BlockPos pos, BlockState state) {
		super(DupyDupeChestModBlockEntities.MAGESAPLING.get(), pos, state);
	}

	@Override
	public ClientboundBlockEntityDataPacket getUpdatePacket() {
		return ClientboundBlockEntityDataPacket.create(this);
	}

	@Override
	public CompoundTag getUpdateTag() {
		return this.saveWithFullMetadata();
	}
}
