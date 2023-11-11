
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

public class DozInMaincraftModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, DozInMaincraftMod.MODID);
	public static final RegistryObject<SoundEvent> DURA = REGISTRY.register("dura", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("doz_in_maincraft", "dura")));
}
