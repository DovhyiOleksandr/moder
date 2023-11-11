
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import net.mcreator.doz_in_maincraft.fluid.types.MoltenSteelFluidType;
import net.mcreator.doz_in_maincraft.fluid.types.FLUEDGLASSFluidType;
import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

public class DozInMaincraftModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, DozInMaincraftMod.MODID);
	public static final RegistryObject<FluidType> FLUEDGLASS_TYPE = REGISTRY.register("fluedglass", () -> new FLUEDGLASSFluidType());
	public static final RegistryObject<FluidType> MOLTEN_STEEL_TYPE = REGISTRY.register("molten_steel", () -> new MoltenSteelFluidType());
}
