
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.doz_in_maincraft.entity.BeastForest2Entity;
import net.mcreator.doz_in_maincraft.client.model.Modelfak;

public class BeastForest2Renderer extends MobRenderer<BeastForest2Entity, Modelfak<BeastForest2Entity>> {
	public BeastForest2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelfak(context.bakeLayer(Modelfak.LAYER_LOCATION)), 0.6f);
		this.addLayer(new EyesLayer<BeastForest2Entity, Modelfak<BeastForest2Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("doz_in_maincraft:textures/entities/zvery_lesa.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BeastForest2Entity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/zvery_lesa.png");
	}
}
