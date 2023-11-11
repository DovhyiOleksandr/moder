
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

public abstract class FLUEDGLASSFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> DozInMaincraftModFluidTypes.FLUEDGLASS_TYPE.get(), () -> DozInMaincraftModFluids.FLUEDGLASS.get(),
			() -> DozInMaincraftModFluids.FLOWING_FLUEDGLASS.get()).explosionResistance(100f).bucket(() -> DozInMaincraftModItems.FLUEDGLASS_BUCKET.get()).block(() -> (LiquidBlock) DozInMaincraftModBlocks.FLUEDGLASS.get());

	private FLUEDGLASSFluid() {
		super(PROPERTIES);
	}

	public static class Source extends FLUEDGLASSFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends FLUEDGLASSFluid {
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
