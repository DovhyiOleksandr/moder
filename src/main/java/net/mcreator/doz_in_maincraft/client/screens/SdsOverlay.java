
package net.mcreator.doz_in_maincraft.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.Minecraft;

import net.mcreator.doz_in_maincraft.procedures.SdsUsloviiePokazaNalozhieniiaProcedure;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class SdsOverlay {
	@SubscribeEvent(priority = EventPriority.NORMAL)
	public static void eventHandler(RenderGuiEvent.Pre event) {
		int w = event.getWindow().getGuiScaledWidth();
		int h = event.getWindow().getGuiScaledHeight();
		int posX = w / 2;
		int posY = h / 2;
		Level world = null;
		double x = 0;
		double y = 0;
		double z = 0;
		Player entity = Minecraft.getInstance().player;
		if (entity != null) {
			world = entity.level;
			x = entity.getX();
			y = entity.getY();
			z = entity.getZ();
		}
		if (SdsUsloviiePokazaNalozhieniiaProcedure.execute()) {
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.doz_in_maincraft.sds.label_stop_increased_danger"), posX + -46, posY + -73, -13434880);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.doz_in_maincraft.sds.label_warning"), posX + -19, posY + -62, -16777165);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.doz_in_maincraft.sds.label_the_institute_is_not_responsible"), posX + -145, posY + -49, -13434880);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.doz_in_maincraft.sds.label_warning1"), posX + -19, posY + -38, -16777165);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.doz_in_maincraft.sds.label_the_institute_is_not_responsible1"), posX + -145, posY + -19, -13434880);
			Minecraft.getInstance().font.draw(event.getPoseStack(), Component.translatable("gui.doz_in_maincraft.sds.label_stop_increased_danger1"), posX + -45, posY + -5, -13434880);
		}
	}
}
