package net.mcreator.doz_in_maincraft.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.doz_in_maincraft.network.DozInMaincraftModVariables;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class UltaProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(DozInMaincraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DozInMaincraftModVariables.PlayerVariables())).ulta != 0) {
			{
				double _setval = (entity.getCapability(DozInMaincraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new DozInMaincraftModVariables.PlayerVariables())).ulta + 1;
				entity.getCapability(DozInMaincraftModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.ulta = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		}
	}
}
