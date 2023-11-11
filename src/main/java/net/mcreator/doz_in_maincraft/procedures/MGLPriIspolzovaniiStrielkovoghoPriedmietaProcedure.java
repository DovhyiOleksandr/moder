package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class MGLPriIspolzovaniiStrielkovoghoPriedmietaProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("MGL") < 1)) {
			itemstack.getOrCreateTag().putDouble("MGL", (itemstack.getOrCreateTag().getDouble("MGL") - 1));
		}
	}
}
