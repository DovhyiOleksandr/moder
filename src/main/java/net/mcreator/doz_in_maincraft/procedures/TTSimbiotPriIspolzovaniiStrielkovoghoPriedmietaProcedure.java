package net.mcreator.doz_in_maincraft.procedures;

import net.minecraft.world.item.ItemStack;

public class TTSimbiotPriIspolzovaniiStrielkovoghoPriedmietaProcedure {
	public static void execute(ItemStack itemstack) {
		if (!(itemstack.getOrCreateTag().getDouble("TTS") < 1)) {
			itemstack.getOrCreateTag().putDouble("TTS", (itemstack.getOrCreateTag().getDouble("TTS") - 1));
		}
	}
}
