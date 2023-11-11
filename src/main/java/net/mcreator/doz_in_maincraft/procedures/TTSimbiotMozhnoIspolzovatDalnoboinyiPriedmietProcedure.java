package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class TTSimbiotMozhnoIspolzovatDalnoboinyiPriedmietProcedure {
	public static boolean execute(ItemStack itemstack) {
		return itemstack.getOrCreateTag().getDouble("TTS") > 0;
	}
}
