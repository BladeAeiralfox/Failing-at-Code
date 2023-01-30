
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dupydupechest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.dupydupechest.DupyDupeChestMod;

public class DupyDupeChestModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, DupyDupeChestMod.MODID);
	public static final RegistryObject<Item> PURE_DARK_SKYROOT = block(DupyDupeChestModBlocks.PURE_DARK_SKYROOT,
			DupyDupeChestModTabs.TAB_OLDEN_TABLE);
	public static final RegistryObject<Item> STRIPPED_PURE_DARK_SKYROOT = block(DupyDupeChestModBlocks.STRIPPED_PURE_DARK_SKYROOT,
			DupyDupeChestModTabs.TAB_OLDEN_TABLE);
	public static final RegistryObject<Item> PURE_DARK_SKYROOTLEAVES = block(DupyDupeChestModBlocks.PURE_DARK_SKYROOTLEAVES,
			DupyDupeChestModTabs.TAB_OLDEN_TABLE);
	public static final RegistryObject<Item> EIGHTSIDED_PURE_DARK_SKYROOT = block(DupyDupeChestModBlocks.EIGHTSIDED_PURE_DARK_SKYROOT,
			DupyDupeChestModTabs.TAB_OLDEN_TABLE);
	public static final RegistryObject<Item> STRIPPED_EIGHTSIDED_DARK_SKYROOT = block(DupyDupeChestModBlocks.STRIPPED_EIGHTSIDED_DARK_SKYROOT,
			DupyDupeChestModTabs.TAB_OLDEN_TABLE);
	public static final RegistryObject<Item> PURE_DARK_SKYROOTPLANKS = block(DupyDupeChestModBlocks.PURE_DARK_SKYROOTPLANKS,
			DupyDupeChestModTabs.TAB_OLDEN_TABLE);
	public static final RegistryObject<Item> OLDENCHEST = block(DupyDupeChestModBlocks.OLDENCHEST, DupyDupeChestModTabs.TAB_OLDEN_TABLE);
	public static final RegistryObject<Item> OLDENSABLING = block(DupyDupeChestModBlocks.OLDENSABLING, DupyDupeChestModTabs.TAB_OLDEN_TABLE);
	public static final RegistryObject<Item> PURE_DARK_SKYROOTWALL = block(DupyDupeChestModBlocks.PURE_DARK_SKYROOTWALL,
			DupyDupeChestModTabs.TAB_OLDEN_TABLE);
	public static final RegistryObject<Item> MAGESAPLING = block(DupyDupeChestModBlocks.MAGESAPLING, DupyDupeChestModTabs.TAB_OLDEN_TABLE);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
