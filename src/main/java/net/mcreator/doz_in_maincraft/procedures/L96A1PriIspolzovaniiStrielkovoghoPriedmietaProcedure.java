package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class L96A1PriIspolzovaniiStrielkovoghoPriedmietaProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("L96A1") < 1)) {
			itemstack.getOrCreateTag().putDouble("L96A1", (itemstack.getOrCreateTag().getDouble("L96A1") - 1));
		}
	}
}
