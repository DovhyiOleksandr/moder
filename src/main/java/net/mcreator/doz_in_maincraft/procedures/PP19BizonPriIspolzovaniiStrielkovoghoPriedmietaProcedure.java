package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class PP19BizonPriIspolzovaniiStrielkovoghoPriedmietaProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("PP19") < 1)) {
			itemstack.getOrCreateTag().putDouble("PP19", (itemstack.getOrCreateTag().getDouble("PP19") - 1));
		}
	}
}
