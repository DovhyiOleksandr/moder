package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class MGLMozhnoIspolzovatDalnoboinyiPriedmietProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("MGL") > 0;
	}
}
