
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DozInMaincraftModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.BUILDING_BLOCKS) {
			tabData.accept(DozInMaincraftModBlocks.MAGIC_PINE_WOOD.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(DozInMaincraftModItems.BOW_FORESTERS.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(DozInMaincraftModItems.FIRST_EXECUTIONER_1_SPAWN_EGG.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("doz_in_maincraft", "sad"),
				builder -> builder.title(Component.translatable("item_group.doz_in_maincraft.sad")).icon(() -> new ItemStack(DozInMaincraftModItems.FWW.get())).displayItems((parameters, tabData) -> {
					tabData.accept(DozInMaincraftModItems.STIMULATOR.get());
					tabData.accept(DozInMaincraftModItems.CASTING_MOLD.get());
					tabData.accept(DozInMaincraftModItems.FLUEDGLASS_BUCKET.get());
					tabData.accept(DozInMaincraftModItems.CYLINDER_WITH_COMPRESSED_AIR.get());
					tabData.accept(DozInMaincraftModBlocks.MAGIC_PINE_LOG.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.MAGIC_PINE_PLANKS.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.MAGIC_PINE_LEAVES.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.MAGIC_PINE_STAIRS.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.MAGIC_PINE_SLAB.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.MAGIC_PINE_FENCE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.MAGIC_PINE_FENCE_GATE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.MAGIC_PINE_PRESSURE_PLATE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.MAGIC_PINE_BUTTON.get().asItem());
					tabData.accept(DozInMaincraftModItems.UNFINISHED_STIMULANT.get());
					tabData.accept(DozInMaincraftModItems.EMPTY_STIMULANT.get());
					tabData.accept(DozInMaincraftModItems.HEALING_MIXTURE.get());
					tabData.accept(DozInMaincraftModItems.FILLER.get());
					tabData.accept(DozInMaincraftModItems.SEEDLING_MAGIC_PINE.get());
					tabData.accept(DozInMaincraftModBlocks.SDDD.get().asItem());
					tabData.accept(DozInMaincraftModItems.PATRON_10MM.get());
					tabData.accept(DozInMaincraftModItems.FORESTER_HUNTER_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModBlocks.BOX_FORESTERS.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.FOREST_ROOTS.get().asItem());
					tabData.accept(DozInMaincraftModItems.COPPER_ARMOR_HELMET.get());
					tabData.accept(DozInMaincraftModItems.COPPER_ARMOR_CHESTPLATE.get());
					tabData.accept(DozInMaincraftModItems.COPPER_ARMOR_LEGGINGS.get());
					tabData.accept(DozInMaincraftModItems.COPPER_ARMOR_BOOTS.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_ARMOR_HELMET.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_ARMOR_CHESTPLATE.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_ARMOR_LEGGINGS.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_ARMOR_BOOTS.get());
					tabData.accept(DozInMaincraftModBlocks.COPPER_ORE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.COPPER_BLOCK.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.ALUMINUM_ORE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.ALUMINUM_BLOCK.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.LEAD_ORE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.LEAD_BLOCK.get().asItem());
					tabData.accept(DozInMaincraftModItems.COPPER_INGOT.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_INGOT.get());
					tabData.accept(DozInMaincraftModItems.LEAD_INGOT.get());
					tabData.accept(DozInMaincraftModItems.COPPER_PICKAXE.get());
					tabData.accept(DozInMaincraftModItems.COPPER_AXE.get());
					tabData.accept(DozInMaincraftModItems.COPPER_SWORD.get());
					tabData.accept(DozInMaincraftModItems.COPPER_SHOVEL.get());
					tabData.accept(DozInMaincraftModItems.COPPER_HOE.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_PICKAXE.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_AXE.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_SWORD.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_SHOVEL.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_HOE.get());
					tabData.accept(DozInMaincraftModBlocks.BOX_FORESTERS_OPEN.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.TIN_ORE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.TIN_BLOCK.get().asItem());
					tabData.accept(DozInMaincraftModItems.TIN_INGOT.get());
					tabData.accept(DozInMaincraftModItems.PICKLOCK.get());
					tabData.accept(DozInMaincraftModItems.PIECE_TIN.get());
					tabData.accept(DozInMaincraftModItems.ELECTRICAL_TAPE.get());
					tabData.accept(DozInMaincraftModItems.ADDED_AROMATIC_SPICES.get());
					tabData.accept(DozInMaincraftModItems.LOAD_FORESTERS.get());
					tabData.accept(DozInMaincraftModItems.COOLING_MECHANISM.get());
					tabData.accept(DozInMaincraftModItems.STEAL_ARMOR_HELMET.get());
					tabData.accept(DozInMaincraftModItems.STEAL_ARMOR_CHESTPLATE.get());
					tabData.accept(DozInMaincraftModItems.STEAL_ARMOR_LEGGINGS.get());
					tabData.accept(DozInMaincraftModItems.STEAL_ARMOR_BOOTS.get());
					tabData.accept(DozInMaincraftModBlocks.STEAL_BLOCK.get().asItem());
					tabData.accept(DozInMaincraftModItems.STEAL_INGOT.get());
					tabData.accept(DozInMaincraftModItems.STEAL_PICKAXE.get());
					tabData.accept(DozInMaincraftModItems.STEAL_AXE.get());
					tabData.accept(DozInMaincraftModItems.STEAL_SWORD.get());
					tabData.accept(DozInMaincraftModItems.STEAL_SHOVEL.get());
					tabData.accept(DozInMaincraftModItems.STEAL_HOE.get());
					tabData.accept(DozInMaincraftModItems.REVOLVER_DRUM.get());
					tabData.accept(DozInMaincraftModItems.STEEL_BARREL.get());
					tabData.accept(DozInMaincraftModItems.MOLTEN_STEEL_BUCKET.get());
					tabData.accept(DozInMaincraftModItems.DRUM_SHAPE.get());
					tabData.accept(DozInMaincraftModItems.PRESSURE_REGULATOR.get());
					tabData.accept(DozInMaincraftModBlocks.ARC_FURNACE.get().asItem());
					tabData.accept(DozInMaincraftModItems.GAS.get());
					tabData.accept(DozInMaincraftModItems.FORRSTER_HUNTER_2_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.FORRESTER_HUNTER_3_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.FORESTER_HUNTER_4_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.FORESTERS_SPEAR.get());
					tabData.accept(DozInMaincraftModItems.FORESTER_HUNTER_5_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.EMPTY_BALLOON.get());
					tabData.accept(DozInMaincraftModItems.ALUMINUM_PLATE.get());
					tabData.accept(DozInMaincraftModBlocks.NEZERITE_ORE.get().asItem());
					tabData.accept(DozInMaincraftModItems.NEZERITE_DUST.get());
					tabData.accept(DozInMaincraftModBlocks.METAL_FORMING_MACHINE.get().asItem());
					tabData.accept(DozInMaincraftModItems.REVOLVER_CLIP.get());
					tabData.accept(DozInMaincraftModItems.EXECUTIONER_HEART.get());
					tabData.accept(DozInMaincraftModItems.GAS_MASK_HELMET.get());
					tabData.accept(DozInMaincraftModItems.GAS_MASK_CRAHET_HELMET.get());
					tabData.accept(DozInMaincraftModItems.GAS_FILTER.get());
					tabData.accept(DozInMaincraftModItems.TOLKACH.get());
					tabData.accept(DozInMaincraftModItems.CLIP_BISON.get());
					tabData.accept(DozInMaincraftModItems.GRENADE_40_MM.get());
					tabData.accept(DozInMaincraftModItems.MGL.get());
					tabData.accept(DozInMaincraftModItems.L_96_A_1.get());
					tabData.accept(DozInMaincraftModItems.MAGNUM.get());
					tabData.accept(DozInMaincraftModItems.PP_19_BIZON.get());
					tabData.accept(DozInMaincraftModItems.BEAST_FOREST_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModBlocks.BEAST_SUMMON_BLOCK.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.HOZMAG_BRICK.get().asItem());
					tabData.accept(DozInMaincraftModItems.TT.get());
					tabData.accept(DozInMaincraftModItems.CLIP_TT.get());
					tabData.accept(DozInMaincraftModItems.CLIP_SWD.get());
					tabData.accept(DozInMaincraftModItems.TT_SIMBIOT.get());
					tabData.accept(DozInMaincraftModItems.SPAS_12.get());
					tabData.accept(DozInMaincraftModItems.CALIBER_12.get());
					tabData.accept(DozInMaincraftModItems.GHOUL_BANDIT_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.GHOUL_BULL_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.BRIGADIER_GHUL_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.GHOUL_ARROWS_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.GHOUL_RAIDER_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModBlocks.BURNT_BLOOD_HOLE_BLOCK.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.BLOOD_HOLE_BLOCK.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.BURNT_BLOODY_HOLE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.BLOODY_HOLE.get().asItem());
					tabData.accept(DozInMaincraftModItems.FIRST_EXECUTIONER_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.FIRST_EXECUTIONER_2_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.RISING_EXECUTIONER_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModBlocks.PALACH_PR.get().asItem());
					tabData.accept(DozInMaincraftModItems.BLOODY_CLAW_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.BLOODY_CARCASS_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModItems.DOUBLE_BLOODY_TEAR.get());
					tabData.accept(DozInMaincraftModItems.TRIPLE_TEAR_BLOOD.get());
					tabData.accept(DozInMaincraftModItems.BLOODY_TEAR.get());
					tabData.accept(DozInMaincraftModItems.SYMBIOTIC_PIECES.get());
					tabData.accept(DozInMaincraftModItems.SYMBIOTIC_ULCER.get());
					tabData.accept(DozInMaincraftModBlocks.BOX_LEVEL_2.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.BOX_LEVEL_3.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.BOX_LEVEL_4.get().asItem());
					tabData.accept(DozInMaincraftModItems.CASE_SHOOTING_RANGE_1.get());
					tabData.accept(DozInMaincraftModItems.CASE_SHOOTING_RANGE_2.get());
					tabData.accept(DozInMaincraftModItems.CASE_SHOOTING_RANGE_3.get());
					tabData.accept(DozInMaincraftModItems.CASE_SHOOTING_RANGE_4.get());
					tabData.accept(DozInMaincraftModItems.BOLTS.get());
					tabData.accept(DozInMaincraftModItems.BOX_DETAIL.get());
					tabData.accept(DozInMaincraftModItems.IRON_PLATES.get());
					tabData.accept(DozInMaincraftModItems.STEEL_PLATE.get());
					tabData.accept(DozInMaincraftModItems.PLATE_SHAPE.get());
					tabData.accept(DozInMaincraftModBlocks.POLKA_1.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.POLKA_2.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.POLKA_3.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.POLKA_4.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.BLOODY_MOSS.get().asItem());
					tabData.accept(DozInMaincraftModItems.DETAIL_PM.get());
					tabData.accept(DozInMaincraftModItems.DETAIL_SWD.get());
					tabData.accept(DozInMaincraftModItems.DETAIL_AKM.get());
					tabData.accept(DozInMaincraftModItems.DETAIL_PP_19.get());
					tabData.accept(DozInMaincraftModBlocks.ENGINEERING_WORKBENCH.get().asItem());
					tabData.accept(DozInMaincraftModItems.DETAIL_GAUS.get());
					tabData.accept(DozInMaincraftModItems.KARBON.get());
					tabData.accept(DozInMaincraftModItems.DETAIL_SPECIAL_AKM.get());
					tabData.accept(DozInMaincraftModItems.BATTERY.get());
					tabData.accept(DozInMaincraftModItems.PLASMA_CABLE.get());
					tabData.accept(DozInMaincraftModItems.PRECISION_TOOL.get());
					tabData.accept(DozInMaincraftModItems.DETAIL_PPH.get());
					tabData.accept(DozInMaincraftModItems.DETAIL_SPAS_12.get());
					tabData.accept(DozInMaincraftModItems.DETAIL_SKAR_H.get());
					tabData.accept(DozInMaincraftModItems.AVERAGE_HOUSEHOLD_BOX.get());
					tabData.accept(DozInMaincraftModItems.LARGE_BOX_FROM_HOZMAG.get());
					tabData.accept(DozInMaincraftModItems.HUGE_BOX_FROM_HOZMAG.get());
					tabData.accept(DozInMaincraftModBlocks.WEAPON_WORKBENCH.get().asItem());
					tabData.accept(DozInMaincraftModItems.CHUGUN.get());
					tabData.accept(DozInMaincraftModBlocks.CRYSTALLINE_WOOD.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTALLINE_LOG.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTALLINE_PLANKS.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTALLINE_LEAVES.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTALLINE_SLAB.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTALLINE_FENCE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTALLINE_FENCE_GATE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTALLINE_PRESSURE_PLATE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTALLINE_BUTTON.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTAL_GROUND.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTAL_STONE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTAL_COBBLESTONE.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.WILL_DISTORT_THE_CRYSTALS.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CRYSTAL_EARTH.get().asItem());
					tabData.accept(DozInMaincraftModItems.DARK_ZONE.get());
					tabData.accept(DozInMaincraftModBlocks.ENERGY_FRAMEWORK.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CREATIVE_CELL.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.AMMUNITION_PRESS.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.PILE_CAST_IRON.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.CHUGUNN_BLOCK.get().asItem());
					tabData.accept(DozInMaincraftModItems.STABILIZER_STOKER.get());
					tabData.accept(DozInMaincraftModItems.STABILIZER_GEMINI.get());
					tabData.accept(DozInMaincraftModItems.STABILIZER_DIODE.get());
					tabData.accept(DozInMaincraftModItems.SLEEVE_10_MM.get());
					tabData.accept(DozInMaincraftModItems.SLEEVE_762.get());
					tabData.accept(DozInMaincraftModItems.REVOLVER_CLIP_1.get());
					tabData.accept(DozInMaincraftModItems.P_762ATRON.get());
					tabData.accept(DozInMaincraftModItems.CLIP_1.get());
					tabData.accept(DozInMaincraftModItems.CLIP_2.get());
					tabData.accept(DozInMaincraftModItems.CLIP_3.get());
					tabData.accept(DozInMaincraftModItems.ARMOR_FORTRESS_HELMET.get());
					tabData.accept(DozInMaincraftModItems.ARMOR_FORTRESS_CHESTPLATE.get());
					tabData.accept(DozInMaincraftModItems.ARMOR_FORTRESS_LEGGINGS.get());
					tabData.accept(DozInMaincraftModItems.ARMOR_FORTRESS_BOOTS.get());
					tabData.accept(DozInMaincraftModItems.FORTRESS_ARMOR_SET.get());
					tabData.accept(DozInMaincraftModBlocks.ARMORERS_WORKBENCH.get().asItem());
					tabData.accept(DozInMaincraftModItems.SURVIVORS_ARMOR_HELMET.get());
					tabData.accept(DozInMaincraftModItems.SURVIVORS_ARMOR_CHESTPLATE.get());
					tabData.accept(DozInMaincraftModItems.SURVIVORS_ARMOR_LEGGINGS.get());
					tabData.accept(DozInMaincraftModItems.SURVIVORS_ARMOR_BOOTS.get());
					tabData.accept(DozInMaincraftModItems.SURVIVOR_ARMOR_SET.get());
					tabData.accept(DozInMaincraftModItems.OBJECT_STOKER_SPAWN_EGG.get());
					tabData.accept(DozInMaincraftModBlocks.STOCER.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.AUTO_MINER.get().asItem());
					tabData.accept(DozInMaincraftModBlocks.BET.get().asItem());
				}).withSearchBar());
	}
}
