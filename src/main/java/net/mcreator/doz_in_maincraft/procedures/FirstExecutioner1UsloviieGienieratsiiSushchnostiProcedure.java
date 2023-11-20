package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.LevelAccessor;

public class FirstExecutioner1UsloviieGienieratsiiSushchnostiProcedure {
	public static boolean execute(LevelAccessor world) {
		return world.players().size() == Math.PI;
	}
}
