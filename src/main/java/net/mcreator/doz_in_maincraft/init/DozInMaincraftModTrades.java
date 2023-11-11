
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class DozInMaincraftModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(3)
					.add(new BasicItemListing(new ItemStack(DozInMaincraftModItems.BLOODY_TEAR.get(), 8), new ItemStack(DozInMaincraftModItems.BLOODY_TEAR.get(), 6), new ItemStack(DozInMaincraftModItems.AVERAGE_HOUSEHOLD_BOX.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(DozInMaincraftModItems.DOUBLE_BLOODY_TEAR.get(), 6), new ItemStack(DozInMaincraftModItems.DOUBLE_BLOODY_TEAR.get(), 4),
					new ItemStack(DozInMaincraftModItems.LARGE_BOX_FROM_HOZMAG.get()), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(DozInMaincraftModItems.TRIPLE_TEAR_BLOOD.get(), 3), new ItemStack(DozInMaincraftModItems.TRIPLE_TEAR_BLOOD.get()),
					new ItemStack(DozInMaincraftModItems.HUGE_BOX_FROM_HOZMAG.get()), 10, 5, 0.05f));
		}
	}
}
