
package net.mcreator.doz_in_maincraft.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;

import net.mcreator.doz_in_maincraft.entity.BeastForest3Entity;
import net.mcreator.doz_in_maincraft.client.model.Modelstrilok;

public class BeastForest3Renderer extends MobRenderer<BeastForest3Entity, Modelstrilok<BeastForest3Entity>> {
	public BeastForest3Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelstrilok(context.bakeLayer(Modelstrilok.LAYER_LOCATION)), 0.6f);
		this.addLayer(new EyesLayer<BeastForest3Entity, Modelstrilok<BeastForest3Entity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("doz_in_maincraft:textures/entities/zvery_lesa.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BeastForest3Entity entity) {
		return new ResourceLocation("doz_in_maincraft:textures/entities/zvery_lesa.png");
	}
}
