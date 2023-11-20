
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.doz_in_maincraft.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.doz_in_maincraft.entity.TTSimbiotEntity;
import net.mcreator.doz_in_maincraft.entity.TTEntity;
import net.mcreator.doz_in_maincraft.entity.SPAS12Entity;
import net.mcreator.doz_in_maincraft.entity.RisingExecutionerEntity;
import net.mcreator.doz_in_maincraft.entity.PP19BizonEntity;
import net.mcreator.doz_in_maincraft.entity.ObjectStokerEntity;
import net.mcreator.doz_in_maincraft.entity.ObjectDiodeEntity;
import net.mcreator.doz_in_maincraft.entity.MagnumEntity;
import net.mcreator.doz_in_maincraft.entity.MGLEntity;
import net.mcreator.doz_in_maincraft.entity.L96A1Entity;
import net.mcreator.doz_in_maincraft.entity.GhoulRaiderEntity;
import net.mcreator.doz_in_maincraft.entity.GhoulBullEntity;
import net.mcreator.doz_in_maincraft.entity.GhoulBanditEntity;
import net.mcreator.doz_in_maincraft.entity.GhoulArrowsEntity;
import net.mcreator.doz_in_maincraft.entity.ForrsterHunter2Entity;
import net.mcreator.doz_in_maincraft.entity.ForresterHunter3Entity;
import net.mcreator.doz_in_maincraft.entity.ForesterHunterEntity;
import net.mcreator.doz_in_maincraft.entity.ForesterHunter5Entity;
import net.mcreator.doz_in_maincraft.entity.ForesterHunter4Entity;
import net.mcreator.doz_in_maincraft.entity.FirstExecutionerEntity;
import net.mcreator.doz_in_maincraft.entity.FirstExecutioner2Entity;
import net.mcreator.doz_in_maincraft.entity.FirstExecutioner1Entity;
import net.mcreator.doz_in_maincraft.entity.FdgdEntity;
import net.mcreator.doz_in_maincraft.entity.BrigadierGhulEntity;
import net.mcreator.doz_in_maincraft.entity.BowForestersEntity;
import net.mcreator.doz_in_maincraft.entity.BloodyClawEntity;
import net.mcreator.doz_in_maincraft.entity.BloodyCarcassEntity;
import net.mcreator.doz_in_maincraft.entity.BeastForestEntity;
import net.mcreator.doz_in_maincraft.entity.BeastForest4Entity;
import net.mcreator.doz_in_maincraft.entity.BeastForest3Entity;
import net.mcreator.doz_in_maincraft.entity.BeastForest2Entity;
import net.mcreator.doz_in_maincraft.entity.BeastForest1Entity;
import net.mcreator.doz_in_maincraft.DozInMaincraftMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DozInMaincraftModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, DozInMaincraftMod.MODID);
	public static final RegistryObject<EntityType<ForesterHunterEntity>> FORESTER_HUNTER = register("forester_hunter",
			EntityType.Builder.<ForesterHunterEntity>of(ForesterHunterEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ForesterHunterEntity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<ForrsterHunter2Entity>> FORRSTER_HUNTER_2 = register("forrster_hunter_2",
			EntityType.Builder.<ForrsterHunter2Entity>of(ForrsterHunter2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ForrsterHunter2Entity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<BowForestersEntity>> BOW_FORESTERS = register("projectile_bow_foresters",
			EntityType.Builder.<BowForestersEntity>of(BowForestersEntity::new, MobCategory.MISC).setCustomClientFactory(BowForestersEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<ForresterHunter3Entity>> FORRESTER_HUNTER_3 = register("forrester_hunter_3",
			EntityType.Builder.<ForresterHunter3Entity>of(ForresterHunter3Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ForresterHunter3Entity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<ForesterHunter4Entity>> FORESTER_HUNTER_4 = register("forester_hunter_4",
			EntityType.Builder.<ForesterHunter4Entity>of(ForesterHunter4Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ForesterHunter4Entity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<ForesterHunter5Entity>> FORESTER_HUNTER_5 = register("forester_hunter_5",
			EntityType.Builder.<ForesterHunter5Entity>of(ForesterHunter5Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ForesterHunter5Entity::new)

					.sized(1f, 2f));
	public static final RegistryObject<EntityType<MGLEntity>> MGL = register("projectile_mgl",
			EntityType.Builder.<MGLEntity>of(MGLEntity::new, MobCategory.MISC).setCustomClientFactory(MGLEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<L96A1Entity>> L_96_A_1 = register("projectile_l_96_a_1",
			EntityType.Builder.<L96A1Entity>of(L96A1Entity::new, MobCategory.MISC).setCustomClientFactory(L96A1Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<MagnumEntity>> MAGNUM = register("projectile_magnum",
			EntityType.Builder.<MagnumEntity>of(MagnumEntity::new, MobCategory.MISC).setCustomClientFactory(MagnumEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<PP19BizonEntity>> PP_19_BIZON = register("projectile_pp_19_bizon",
			EntityType.Builder.<PP19BizonEntity>of(PP19BizonEntity::new, MobCategory.MISC).setCustomClientFactory(PP19BizonEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<BeastForestEntity>> BEAST_FOREST = register("beast_forest",
			EntityType.Builder.<BeastForestEntity>of(BeastForestEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeastForestEntity::new)

					.sized(0.8f, 2.2f));
	public static final RegistryObject<EntityType<BeastForest4Entity>> BEAST_FOREST_4 = register("beast_forest_4",
			EntityType.Builder.<BeastForest4Entity>of(BeastForest4Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeastForest4Entity::new)

					.sized(0.8f, 2.2f));
	public static final RegistryObject<EntityType<BeastForest3Entity>> BEAST_FOREST_3 = register("beast_forest_3",
			EntityType.Builder.<BeastForest3Entity>of(BeastForest3Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeastForest3Entity::new)

					.sized(0.8f, 2.2f));
	public static final RegistryObject<EntityType<BeastForest2Entity>> BEAST_FOREST_2 = register("beast_forest_2",
			EntityType.Builder.<BeastForest2Entity>of(BeastForest2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeastForest2Entity::new)

					.sized(0.8f, 2.2f));
	public static final RegistryObject<EntityType<BeastForest1Entity>> BEAST_FOREST_1 = register("beast_forest_1",
			EntityType.Builder.<BeastForest1Entity>of(BeastForest1Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeastForest1Entity::new)

					.sized(0.8f, 2.2f));
	public static final RegistryObject<EntityType<TTEntity>> TT = register("projectile_tt",
			EntityType.Builder.<TTEntity>of(TTEntity::new, MobCategory.MISC).setCustomClientFactory(TTEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<TTSimbiotEntity>> TT_SIMBIOT = register("projectile_tt_simbiot",
			EntityType.Builder.<TTSimbiotEntity>of(TTSimbiotEntity::new, MobCategory.MISC).setCustomClientFactory(TTSimbiotEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SPAS12Entity>> SPAS_12 = register("projectile_spas_12",
			EntityType.Builder.<SPAS12Entity>of(SPAS12Entity::new, MobCategory.MISC).setCustomClientFactory(SPAS12Entity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<GhoulBanditEntity>> GHOUL_BANDIT = register("ghoul_bandit",
			EntityType.Builder.<GhoulBanditEntity>of(GhoulBanditEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhoulBanditEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GhoulBullEntity>> GHOUL_BULL = register("ghoul_bull",
			EntityType.Builder.<GhoulBullEntity>of(GhoulBullEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhoulBullEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BrigadierGhulEntity>> BRIGADIER_GHUL = register("brigadier_ghul",
			EntityType.Builder.<BrigadierGhulEntity>of(BrigadierGhulEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BrigadierGhulEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GhoulArrowsEntity>> GHOUL_ARROWS = register("ghoul_arrows",
			EntityType.Builder.<GhoulArrowsEntity>of(GhoulArrowsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhoulArrowsEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<GhoulRaiderEntity>> GHOUL_RAIDER = register("ghoul_raider",
			EntityType.Builder.<GhoulRaiderEntity>of(GhoulRaiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GhoulRaiderEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FirstExecutionerEntity>> FIRST_EXECUTIONER = register("first_executioner",
			EntityType.Builder.<FirstExecutionerEntity>of(FirstExecutionerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FirstExecutionerEntity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<FirstExecutioner2Entity>> FIRST_EXECUTIONER_2 = register("first_executioner_2",
			EntityType.Builder.<FirstExecutioner2Entity>of(FirstExecutioner2Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FirstExecutioner2Entity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<FirstExecutioner1Entity>> FIRST_EXECUTIONER_1 = register("first_executioner_1",
			EntityType.Builder.<FirstExecutioner1Entity>of(FirstExecutioner1Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FirstExecutioner1Entity::new)

					.sized(0.6f, 2f));
	public static final RegistryObject<EntityType<RisingExecutionerEntity>> RISING_EXECUTIONER = register("rising_executioner",
			EntityType.Builder.<RisingExecutionerEntity>of(RisingExecutionerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RisingExecutionerEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BloodyClawEntity>> BLOODY_CLAW = register("bloody_claw",
			EntityType.Builder.<BloodyClawEntity>of(BloodyClawEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BloodyClawEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BloodyCarcassEntity>> BLOODY_CARCASS = register("bloody_carcass",
			EntityType.Builder.<BloodyCarcassEntity>of(BloodyCarcassEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BloodyCarcassEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<ObjectStokerEntity>> OBJECT_STOKER = register("object_stoker",
			EntityType.Builder.<ObjectStokerEntity>of(ObjectStokerEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ObjectStokerEntity::new)

					.sized(0.8f, 2f));
	public static final RegistryObject<EntityType<FdgdEntity>> DRON = register("dron",
			EntityType.Builder.<FdgdEntity>of(FdgdEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FdgdEntity::new).fireImmune().sized(0.6f, 1f));
	public static final RegistryObject<EntityType<ObjectDiodeEntity>> OBJECT_DIODE = register("object_diode",
			EntityType.Builder.<ObjectDiodeEntity>of(ObjectDiodeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ObjectDiodeEntity::new)

					.sized(0.8f, 2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			ForesterHunterEntity.init();
			ForrsterHunter2Entity.init();
			ForresterHunter3Entity.init();
			ForesterHunter4Entity.init();
			ForesterHunter5Entity.init();
			BeastForestEntity.init();
			BeastForest4Entity.init();
			BeastForest3Entity.init();
			BeastForest2Entity.init();
			BeastForest1Entity.init();
			GhoulBanditEntity.init();
			GhoulBullEntity.init();
			BrigadierGhulEntity.init();
			GhoulArrowsEntity.init();
			GhoulRaiderEntity.init();
			FirstExecutionerEntity.init();
			FirstExecutioner2Entity.init();
			FirstExecutioner1Entity.init();
			RisingExecutionerEntity.init();
			BloodyClawEntity.init();
			BloodyCarcassEntity.init();
			ObjectStokerEntity.init();
			FdgdEntity.init();
			ObjectDiodeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(FORESTER_HUNTER.get(), ForesterHunterEntity.createAttributes().build());
		event.put(FORRSTER_HUNTER_2.get(), ForrsterHunter2Entity.createAttributes().build());
		event.put(FORRESTER_HUNTER_3.get(), ForresterHunter3Entity.createAttributes().build());
		event.put(FORESTER_HUNTER_4.get(), ForesterHunter4Entity.createAttributes().build());
		event.put(FORESTER_HUNTER_5.get(), ForesterHunter5Entity.createAttributes().build());
		event.put(BEAST_FOREST.get(), BeastForestEntity.createAttributes().build());
		event.put(BEAST_FOREST_4.get(), BeastForest4Entity.createAttributes().build());
		event.put(BEAST_FOREST_3.get(), BeastForest3Entity.createAttributes().build());
		event.put(BEAST_FOREST_2.get(), BeastForest2Entity.createAttributes().build());
		event.put(BEAST_FOREST_1.get(), BeastForest1Entity.createAttributes().build());
		event.put(GHOUL_BANDIT.get(), GhoulBanditEntity.createAttributes().build());
		event.put(GHOUL_BULL.get(), GhoulBullEntity.createAttributes().build());
		event.put(BRIGADIER_GHUL.get(), BrigadierGhulEntity.createAttributes().build());
		event.put(GHOUL_ARROWS.get(), GhoulArrowsEntity.createAttributes().build());
		event.put(GHOUL_RAIDER.get(), GhoulRaiderEntity.createAttributes().build());
		event.put(FIRST_EXECUTIONER.get(), FirstExecutionerEntity.createAttributes().build());
		event.put(FIRST_EXECUTIONER_2.get(), FirstExecutioner2Entity.createAttributes().build());
		event.put(FIRST_EXECUTIONER_1.get(), FirstExecutioner1Entity.createAttributes().build());
		event.put(RISING_EXECUTIONER.get(), RisingExecutionerEntity.createAttributes().build());
		event.put(BLOODY_CLAW.get(), BloodyClawEntity.createAttributes().build());
		event.put(BLOODY_CARCASS.get(), BloodyCarcassEntity.createAttributes().build());
		event.put(OBJECT_STOKER.get(), ObjectStokerEntity.createAttributes().build());
		event.put(DRON.get(), FdgdEntity.createAttributes().build());
		event.put(OBJECT_DIODE.get(), ObjectDiodeEntity.createAttributes().build());
	}
}
