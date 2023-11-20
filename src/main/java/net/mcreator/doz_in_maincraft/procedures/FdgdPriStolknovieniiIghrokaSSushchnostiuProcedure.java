package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

public class FdgdPriStolknovieniiIghrokaSSushchnostiuProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity.getPersistentData().getDouble("dron") != 1) {
			if (entity instanceof TamableAnimal _toTame && sourceentity instanceof Player _owner)
				_toTame.tame(_owner);
			entity.getPersistentData().putDouble("dron", 1);
		}
	}
}
