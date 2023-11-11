
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.doz_in_maincraft.entity.BeastForest4Entity;
import net.mcreator.doz_in_maincraft.client.model.Modelfak;

public class BeastForest4Renderer extends MobRenderer<BeastForest4Entity, Modelfak<BeastForest4Entity>> {
	public BeastForest4Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelfak(context.bakeLayer(Modelfak.LAYER_LOCATION)), 0.6f);
		this.addLayer(new EyesLayer<BeastForest4Entity, Modelfak<BeastForest4Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("doz_in_maincraft:textures/entities/zvery_lesa.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BeastForest4Entity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/zvery_lesa.png");
	}
}
