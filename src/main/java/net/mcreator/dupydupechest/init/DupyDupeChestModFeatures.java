
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.dupydupechest.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.dupydupechest.world.features.plants.MagesaplingFeature;
import net.mcreator.dupydupechest.DupyDupeChestMod;

@Mod.EventBusSubscriber
public class DupyDupeChestModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DupyDupeChestMod.MODID);
	public static final RegistryObject<Feature<?>> MAGESAPLING = REGISTRY.register("magesapling", MagesaplingFeature::feature);
}
