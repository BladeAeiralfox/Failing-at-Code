
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dupydupechest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.dupydupechest.block.StrippedPureDarkSkyrootBlock;
import net.mcreator.dupydupechest.block.StrippedEightsidedDarkSkyrootBlock;
import net.mcreator.dupydupechest.block.PureDarkSkyrootwallBlock;
import net.mcreator.dupydupechest.block.PureDarkSkyrootplanksBlock;
import net.mcreator.dupydupechest.block.PureDarkSkyrootleavesBlock;
import net.mcreator.dupydupechest.block.PureDarkSkyrootBlock;
import net.mcreator.dupydupechest.block.OldensablingBlock;
import net.mcreator.dupydupechest.block.OldenchestBlock;
import net.mcreator.dupydupechest.block.MagesaplingBlock;
import net.mcreator.dupydupechest.block.EightsidedPureDarkSkyrootBlock;
import net.mcreator.dupydupechest.DupyDupeChestMod;

public class DupyDupeChestModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, DupyDupeChestMod.MODID);
	public static final RegistryObject<Block> PURE_DARK_SKYROOT = REGISTRY.register("pure_dark_skyroot", () -> new PureDarkSkyrootBlock());
	public static final RegistryObject<Block> STRIPPED_PURE_DARK_SKYROOT = REGISTRY.register("stripped_pure_dark_skyroot",
			() -> new StrippedPureDarkSkyrootBlock());
	public static final RegistryObject<Block> PURE_DARK_SKYROOTLEAVES = REGISTRY.register("pure_dark_skyrootleaves",
			() -> new PureDarkSkyrootleavesBlock());
	public static final RegistryObject<Block> EIGHTSIDED_PURE_DARK_SKYROOT = REGISTRY.register("eightsided_pure_dark_skyroot",
			() -> new EightsidedPureDarkSkyrootBlock());
	public static final RegistryObject<Block> STRIPPED_EIGHTSIDED_DARK_SKYROOT = REGISTRY.register("stripped_eightsided_dark_skyroot",
			() -> new StrippedEightsidedDarkSkyrootBlock());
	public static final RegistryObject<Block> PURE_DARK_SKYROOTPLANKS = REGISTRY.register("pure_dark_skyrootplanks",
			() -> new PureDarkSkyrootplanksBlock());
	public static final RegistryObject<Block> OLDENCHEST = REGISTRY.register("oldenchest", () -> new OldenchestBlock());
	public static final RegistryObject<Block> OLDENSABLING = REGISTRY.register("oldensabling", () -> new OldensablingBlock());
	public static final RegistryObject<Block> PURE_DARK_SKYROOTWALL = REGISTRY.register("pure_dark_skyrootwall",
			() -> new PureDarkSkyrootwallBlock());
	public static final RegistryObject<Block> MAGESAPLING = REGISTRY.register("magesapling", () -> new MagesaplingBlock());
}
