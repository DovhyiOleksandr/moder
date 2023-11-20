package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class DarkZoneCrystalDopolnitielnoieUsloviieDobavlieniiarostaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("doz_in_maincraft:crystal_desert")) || world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("doz_in_maincraft:crystal_forest"));
	}
}
