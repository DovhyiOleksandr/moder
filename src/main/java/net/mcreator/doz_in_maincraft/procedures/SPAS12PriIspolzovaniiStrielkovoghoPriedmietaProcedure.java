package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class SPAS12PriIspolzovaniiStrielkovoghoPriedmietaProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("SPAS12") < 1)) {
			itemstack.getOrCreateTag().putDouble("SPAS12", (itemstack.getOrCreateTag().getDouble("SPAS12") - 1));
		}
	}
}
