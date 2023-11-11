package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class MagnumPriIspolzovaniiStrielkovoghoPriedmietaProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("magnum") < 1)) {
			itemstack.getOrCreateTag().putDouble("magnum", (itemstack.getOrCreateTag().getDouble("magnum") - 1));
		}
	}
}
