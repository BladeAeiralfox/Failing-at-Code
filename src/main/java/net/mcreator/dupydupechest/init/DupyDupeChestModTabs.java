
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dupydupechest.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class DupyDupeChestModTabs {
	public static CreativeModeTab TAB_OLDEN_TABLE;

	public static void load() {
		TAB_OLDEN_TABLE = new CreativeModeTab("tabolden_table") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(DupyDupeChestModBlocks.OLDENCHEST.get());
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
