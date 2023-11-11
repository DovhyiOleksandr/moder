package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class PP19BizonMozhnoIspolzovatDalnoboinyiPriedmietProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("PP19") > 0;
	}
}
