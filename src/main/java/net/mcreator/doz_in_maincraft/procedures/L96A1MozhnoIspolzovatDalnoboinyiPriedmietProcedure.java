package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class L96A1MozhnoIspolzovatDalnoboinyiPriedmietProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("L96A1") > 0;
	}
}
