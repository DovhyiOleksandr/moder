package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class TTPriIspolzovaniiStrielkovoghoPriedmietaProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("TT") < 1)) {
			itemstack.getOrCreateTag().putDouble("TT", (itemstack.getOrCreateTag().getDouble("TT") - 1));
		}
	}
}
