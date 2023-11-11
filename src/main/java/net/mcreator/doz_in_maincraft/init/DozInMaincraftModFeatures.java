
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.doz_in_maincraft.world.features.ores.TinOreFeature;
import net.mcreator.doz_in_maincraft.world.features.ores.NezeriteOreFeature;
import net.mcreator.doz_in_maincraft.world.features.ores.LeadOreFeature;
import net.mcreator.doz_in_maincraft.world.features.ores.CopperOreFeature;
import net.mcreator.doz_in_maincraft.world.features.ores.AluminumOreFeature;
import net.mcreator.doz_in_maincraft.world.features.Stocer1Feature;
import net.mcreator.doz_in_maincraft.world.features.HozmagFeature;
import net.mcreator.doz_in_maincraft.world.features.FdsFeature;
import net.mcreator.doz_in_maincraft.world.features.DfssFeature;
import net.mcreator.doz_in_maincraft.world.features.DFFFSFeature;
import net.mcreator.doz_in_maincraft.world.features.Chugun3Feature;
import net.mcreator.doz_in_maincraft.world.features.Chugun2Feature;
import net.mcreator.doz_in_maincraft.world.features.Chugun1Feature;
import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

@Mod.EventBusSubscriber
public class DozInMaincraftModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, DozInMaincraftMod.MODID);
	public static final RegistryObject<Feature<?>> COPPER_ORE = REGISTRY.register("copper_ore", CopperOreFeature::new);
	public static final RegistryObject<Feature<?>> ALUMINUM_ORE = REGISTRY.register("aluminum_ore", AluminumOreFeature::new);
	public static final RegistryObject<Feature<?>> LEAD_ORE = REGISTRY.register("lead_ore", LeadOreFeature::new);
	public static final RegistryObject<Feature<?>> TIN_ORE = REGISTRY.register("tin_ore", TinOreFeature::new);
	public static final RegistryObject<Feature<?>> FDS = REGISTRY.register("fds", FdsFeature::new);
	public static final RegistryObject<Feature<?>> NEZERITE_ORE = REGISTRY.register("nezerite_ore", NezeriteOreFeature::new);
	public static final RegistryObject<Feature<?>> DFFFS = REGISTRY.register("dfffs", DFFFSFeature::new);
	public static final RegistryObject<Feature<?>> DFSS = REGISTRY.register("dfss", DfssFeature::new);
	public static final RegistryObject<Feature<?>> HOZMAG = REGISTRY.register("hozmag", HozmagFeature::new);
	public static final RegistryObject<Feature<?>> CHUGUN_1 = REGISTRY.register("chugun_1", Chugun1Feature::new);
	public static final RegistryObject<Feature<?>> CHUGUN_2 = REGISTRY.register("chugun_2", Chugun2Feature::new);
	public static final RegistryObject<Feature<?>> CHUGUN_3 = REGISTRY.register("chugun_3", Chugun3Feature::new);
	public static final RegistryObject<Feature<?>> STOCER_1 = REGISTRY.register("stocer_1", Stocer1Feature::new);
}
