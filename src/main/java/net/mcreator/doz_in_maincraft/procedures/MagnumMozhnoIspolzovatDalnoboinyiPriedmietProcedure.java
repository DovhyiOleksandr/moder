package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class MagnumMozhnoIspolzovatDalnoboinyiPriedmietProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("magnum") > 0;
	}
}
