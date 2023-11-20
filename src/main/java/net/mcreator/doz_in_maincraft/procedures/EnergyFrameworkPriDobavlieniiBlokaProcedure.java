package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class EnergyFrameworkPriDobavlieniiBlokaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("doz_in_maincraft:crystal_desert")) && world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("doz_in_maincraft:crystal_forest"))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		}
	}
}
