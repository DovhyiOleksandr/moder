package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;

import net.mcreator.doz_in_maincraft.network.DozInMaincraftModVariables;
import net.mcreator.doz_in_maincraft.init.DozInMaincraftModMobEffects;
import net.mcreator.doz_in_maincraft.init.DozInMaincraftModEntities;
import net.mcreator.doz_in_maincraft.entity.FdgdEntity;

public class GggPriNazhatiiKlavishiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DozInMaincraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DozInMaincraftModVariables.PlayerVariables())).ulta == 0 && entity instanceof LivingEntity _livEnt0
				&& _livEnt0.hasEffect(DozInMaincraftModMobEffects.TY.get())) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new FdgdEntity(DozInMaincraftModEntities.DRON.get(), _level);
				entityToSpawn.moveTo(x, y, z, 0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
			{
				double _setval = 1;
				entity.getCapability(DozInMaincraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ulta = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
