
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

public class DozInMaincraftModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, DozInMaincraftMod.MODID);
	public static final RegistryObject<Potion> HGFGG = REGISTRY.register("hgfgg", () -> new Potion(new MobEffectInstance(DozInMaincraftModMobEffects.TY.get(), 3600, 0, false, true)));
}
