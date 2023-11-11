
package net.mcreator.doz_in_maincraft.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModItems;
import net.mcreator.doz_in_maincraft.init.DozInMaincraftModFluids;
import net.mcreator.doz_in_maincraft.init.DozInMaincraftModFluidTypes;
import net.mcreator.doz_in_maincraft.init.DozInMaincraftModBlocks;

public abstract class MoltenSteelFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DozInMaincraftModFluidTypes.MOLTEN_STEEL_TYPE.get(), () -> DozInMaincraftModFluids.MOLTEN_STEEL.get(),
			() -> DozInMaincraftModFluids.FLOWING_MOLTEN_STEEL.get()).explosionResistance(100f).bucket(() -> DozInMaincraftModItems.MOLTEN_STEEL_BUCKET.get()).block(() -> (LiquidBlock) DozInMaincraftModBlocks.MOLTEN_STEEL.get());

	private MoltenSteelFluid() {
		super(PROPERTIES);
	}

	public static class Source extends MoltenSteelFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends MoltenSteelFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
