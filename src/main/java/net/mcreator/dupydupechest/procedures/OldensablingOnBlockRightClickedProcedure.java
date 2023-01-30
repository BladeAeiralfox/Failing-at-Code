package net.mcreator.dupydupechest.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class OldensablingOnBlockRightClickedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.BONE_MEAL) {
			if (entity instanceof Player _plr ? _plr.getAbilities().instabuild : false) {
				if (Math.random() == 0.3) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("dupy_dupe_chest", "magetree2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (Math.random() < 0.04) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("dupy_dupe_chest", "magetree1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (Math.random() < 0.9) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("dupy_dupe_chest", "magetree3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (Math.random() < 0.12) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("dupy_dupe_chest", "magetree4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			} else {
				((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)).shrink(1);
				if (Math.random() == 0.3) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("dupy_dupe_chest", "magetree2"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (Math.random() < 0.04) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("dupy_dupe_chest", "magetree1"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (Math.random() < 0.9) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("dupy_dupe_chest", "magetree3"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
				if (Math.random() < 0.12) {
					world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					if (world instanceof ServerLevel _serverworld) {
						StructureTemplate template = _serverworld.getStructureManager()
								.getOrCreate(new ResourceLocation("dupy_dupe_chest", "magetree4"));
						if (template != null) {
							template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z),
									new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false),
									_serverworld.random, 3);
						}
					}
				}
			}
		}
	}
}
