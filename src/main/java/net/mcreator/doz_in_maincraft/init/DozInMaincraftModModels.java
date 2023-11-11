
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.doz_in_maincraft.client.model.Modelы4;
import net.mcreator.doz_in_maincraft.client.model.Modelы3;
import net.mcreator.doz_in_maincraft.client.model.Modelы2;
import net.mcreator.doz_in_maincraft.client.model.Modelы1;
import net.mcreator.doz_in_maincraft.client.model.Modeltuha;
import net.mcreator.doz_in_maincraft.client.model.Modelstrilok;
import net.mcreator.doz_in_maincraft.client.model.Modelprotgas1;
import net.mcreator.doz_in_maincraft.client.model.Modelprotgas;
import net.mcreator.doz_in_maincraft.client.model.Modelpalach;
import net.mcreator.doz_in_maincraft.client.model.Modeloplot_tulovish;
import net.mcreator.doz_in_maincraft.client.model.Modeloplot_noogi;
import net.mcreator.doz_in_maincraft.client.model.Modeloplot_head;
import net.mcreator.doz_in_maincraft.client.model.Modeloplot_boots;
import net.mcreator.doz_in_maincraft.client.model.Modelnachalka_1;
import net.mcreator.doz_in_maincraft.client.model.Modelnachalka4;
import net.mcreator.doz_in_maincraft.client.model.Modelnachalka3;
import net.mcreator.doz_in_maincraft.client.model.Modelnachalka2;
import net.mcreator.doz_in_maincraft.client.model.Modellesovikф;
import net.mcreator.doz_in_maincraft.client.model.ModellesovikIzbrany;
import net.mcreator.doz_in_maincraft.client.model.Modellesovik4;
import net.mcreator.doz_in_maincraft.client.model.Modellesovik3;
import net.mcreator.doz_in_maincraft.client.model.Modellesovik2;
import net.mcreator.doz_in_maincraft.client.model.Modellesovik1;
import net.mcreator.doz_in_maincraft.client.model.Modellesovik;
import net.mcreator.doz_in_maincraft.client.model.Modelkogot;
import net.mcreator.doz_in_maincraft.client.model.Modelgul3;
import net.mcreator.doz_in_maincraft.client.model.Modelgul2;
import net.mcreator.doz_in_maincraft.client.model.Modelgul1;
import net.mcreator.doz_in_maincraft.client.model.Modelgul0;
import net.mcreator.doz_in_maincraft.client.model.Modelfak;
import net.mcreator.doz_in_maincraft.client.model.ModelZveryLysa;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class DozInMaincraftModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modeloplot_noogi.LAYER_LOCATION, Modeloplot_noogi::createBodyLayer);
		event.registerLayerDefinition(Modelfak.LAYER_LOCATION, Modelfak::createBodyLayer);
		event.registerLayerDefinition(Modellesovik2.LAYER_LOCATION, Modellesovik2::createBodyLayer);
		event.registerLayerDefinition(Modelы4.LAYER_LOCATION, Modelы4::createBodyLayer);
		event.registerLayerDefinition(Modeloplot_boots.LAYER_LOCATION, Modeloplot_boots::createBodyLayer);
		event.registerLayerDefinition(Modelkogot.LAYER_LOCATION, Modelkogot::createBodyLayer);
		event.registerLayerDefinition(Modellesovik1.LAYER_LOCATION, Modellesovik1::createBodyLayer);
		event.registerLayerDefinition(Modelы3.LAYER_LOCATION, Modelы3::createBodyLayer);
		event.registerLayerDefinition(Modellesovik4.LAYER_LOCATION, Modellesovik4::createBodyLayer);
		event.registerLayerDefinition(Modelы2.LAYER_LOCATION, Modelы2::createBodyLayer);
		event.registerLayerDefinition(Modellesovik.LAYER_LOCATION, Modellesovik::createBodyLayer);
		event.registerLayerDefinition(Modelprotgas1.LAYER_LOCATION, Modelprotgas1::createBodyLayer);
		event.registerLayerDefinition(Modellesovik3.LAYER_LOCATION, Modellesovik3::createBodyLayer);
		event.registerLayerDefinition(Modeltuha.LAYER_LOCATION, Modeltuha::createBodyLayer);
		event.registerLayerDefinition(Modelы1.LAYER_LOCATION, Modelы1::createBodyLayer);
		event.registerLayerDefinition(Modeloplot_tulovish.LAYER_LOCATION, Modeloplot_tulovish::createBodyLayer);
		event.registerLayerDefinition(Modelgul2.LAYER_LOCATION, Modelgul2::createBodyLayer);
		event.registerLayerDefinition(Modelnachalka4.LAYER_LOCATION, Modelnachalka4::createBodyLayer);
		event.registerLayerDefinition(ModelZveryLysa.LAYER_LOCATION, ModelZveryLysa::createBodyLayer);
		event.registerLayerDefinition(Modelgul3.LAYER_LOCATION, Modelgul3::createBodyLayer);
		event.registerLayerDefinition(Modelgul1.LAYER_LOCATION, Modelgul1::createBodyLayer);
		event.registerLayerDefinition(ModellesovikIzbrany.LAYER_LOCATION, ModellesovikIzbrany::createBodyLayer);
		event.registerLayerDefinition(Modellesovikф.LAYER_LOCATION, Modellesovikф::createBodyLayer);
		event.registerLayerDefinition(Modelnachalka3.LAYER_LOCATION, Modelnachalka3::createBodyLayer);
		event.registerLayerDefinition(Modelprotgas.LAYER_LOCATION, Modelprotgas::createBodyLayer);
		event.registerLayerDefinition(Modelstrilok.LAYER_LOCATION, Modelstrilok::createBodyLayer);
		event.registerLayerDefinition(Modelgul0.LAYER_LOCATION, Modelgul0::createBodyLayer);
		event.registerLayerDefinition(Modelnachalka2.LAYER_LOCATION, Modelnachalka2::createBodyLayer);
		event.registerLayerDefinition(Modeloplot_head.LAYER_LOCATION, Modeloplot_head::createBodyLayer);
		event.registerLayerDefinition(Modelnachalka_1.LAYER_LOCATION, Modelnachalka_1::createBodyLayer);
		event.registerLayerDefinition(Modelpalach.LAYER_LOCATION, Modelpalach::createBodyLayer);
	}
}
