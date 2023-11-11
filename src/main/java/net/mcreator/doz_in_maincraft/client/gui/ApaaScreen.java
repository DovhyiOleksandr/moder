package net.mcreator.doz_in_maincraft.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;

import net.mcreator.doz_in_maincraft.world.inventory.ApaaMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class ApaaScreen extends AbstractContainerScreen<ApaaMenu> {
	private final static HashMap<String, Object> guistate = ApaaMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public ApaaScreen(ApaaMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 336;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("doz_in_maincraft:textures/screens/apaa.png");

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.setShaderTexture(0, texture);
		this.blit(ms, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.doz_in_maincraft.apaa.label_stop_increased_danger"), 110, 14, -13434880);
		this.font.draw(poseStack, Component.translatable("gui.doz_in_maincraft.apaa.label_stop_increased_danger1"), 109, 102, -13434880);
		this.font.draw(poseStack, Component.translatable("gui.doz_in_maincraft.apaa.label_warning"), 138, 27, -16777165);
		this.font.draw(poseStack, Component.translatable("gui.doz_in_maincraft.apaa.label_warning1"), 137, 68, -16777165);
		this.font.draw(poseStack, Component.translatable("gui.doz_in_maincraft.apaa.label_the_institute_is_not_responsible"), 11, 43, -13434880);
		this.font.draw(poseStack, Component.translatable("gui.doz_in_maincraft.apaa.label_the_institute_is_not_responsible1"), 11, 82, -13434880);
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
