package net.mcreator.doz_in_maincraft.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModEntities;
import net.mcreator.doz_in_maincraft.entity.RisingExecutionerEntity;
import net.mcreator.doz_in_maincraft.entity.GhoulRaiderEntity;
import net.mcreator.doz_in_maincraft.entity.GhoulBullEntity;
import net.mcreator.doz_in_maincraft.entity.GhoulBanditEntity;
import net.mcreator.doz_in_maincraft.entity.GhoulArrowsEntity;
import net.mcreator.doz_in_maincraft.entity.BrigadierGhulEntity;
import net.mcreator.doz_in_maincraft.entity.BloodyClawEntity;
import net.mcreator.doz_in_maincraft.entity.BloodyCarcassEntity;

public class BloodyHoleObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < 0.7) {
			if ((world.getBlockState(BlockPos.containing(x + 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).getBlock() == Blocks.AIR) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
						entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RisingExecutionerEntity(DozInMaincraftModEntities.RISING_EXECUTIONER.get(), _level);
						entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BloodyClawEntity(DozInMaincraftModEntities.BLOODY_CLAW.get(), _level);
						entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulRaiderEntity(DozInMaincraftModEntities.GHOUL_RAIDER.get(), _level);
						entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulBullEntity(DozInMaincraftModEntities.GHOUL_BULL.get(), _level);
						entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BloodyCarcassEntity(DozInMaincraftModEntities.BLOODY_CARCASS.get(), _level);
						entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulArrowsEntity(DozInMaincraftModEntities.GHOUL_ARROWS.get(), _level);
						entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BrigadierGhulEntity(DozInMaincraftModEntities.BRIGADIER_GHUL.get(), _level);
						entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulBanditEntity(DozInMaincraftModEntities.GHOUL_BANDIT.get(), _level);
						entityToSpawn.moveTo((x + 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x - 1, y, z))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).getBlock() == Blocks.AIR) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
						entityToSpawn.moveTo((x - 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RisingExecutionerEntity(DozInMaincraftModEntities.RISING_EXECUTIONER.get(), _level);
						entityToSpawn.moveTo((x - 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BloodyClawEntity(DozInMaincraftModEntities.BLOODY_CLAW.get(), _level);
						entityToSpawn.moveTo((x - 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BloodyCarcassEntity(DozInMaincraftModEntities.BLOODY_CARCASS.get(), _level);
						entityToSpawn.moveTo((x - 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BrigadierGhulEntity(DozInMaincraftModEntities.BRIGADIER_GHUL.get(), _level);
						entityToSpawn.moveTo((x - 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulArrowsEntity(DozInMaincraftModEntities.GHOUL_ARROWS.get(), _level);
						entityToSpawn.moveTo((x - 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulBanditEntity(DozInMaincraftModEntities.GHOUL_BANDIT.get(), _level);
						entityToSpawn.moveTo((x - 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulBullEntity(DozInMaincraftModEntities.GHOUL_BULL.get(), _level);
						entityToSpawn.moveTo((x - 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulRaiderEntity(DozInMaincraftModEntities.GHOUL_RAIDER.get(), _level);
						entityToSpawn.moveTo((x - 1), y, z, world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z + 1))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).getBlock() == Blocks.AIR) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
						entityToSpawn.moveTo(x, y, (z - 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RisingExecutionerEntity(DozInMaincraftModEntities.RISING_EXECUTIONER.get(), _level);
						entityToSpawn.moveTo(x, y, (z - 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BloodyClawEntity(DozInMaincraftModEntities.BLOODY_CLAW.get(), _level);
						entityToSpawn.moveTo(x, y, (z - 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BloodyCarcassEntity(DozInMaincraftModEntities.BLOODY_CARCASS.get(), _level);
						entityToSpawn.moveTo(x, y, (z - 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BrigadierGhulEntity(DozInMaincraftModEntities.BRIGADIER_GHUL.get(), _level);
						entityToSpawn.moveTo(x, y, (z - 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulArrowsEntity(DozInMaincraftModEntities.GHOUL_ARROWS.get(), _level);
						entityToSpawn.moveTo(x, y, (z - 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulBanditEntity(DozInMaincraftModEntities.GHOUL_BANDIT.get(), _level);
						entityToSpawn.moveTo(x, y, (z - 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulBullEntity(DozInMaincraftModEntities.GHOUL_BULL.get(), _level);
						entityToSpawn.moveTo(x, y, (z - 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulRaiderEntity(DozInMaincraftModEntities.GHOUL_RAIDER.get(), _level);
						entityToSpawn.moveTo(x, y, (z - 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			} else if ((world.getBlockState(BlockPos.containing(x, y, z - 1))).getBlock() == Blocks.AIR && (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).getBlock() == Blocks.AIR) {
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("doz_in_maincraft:dura")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new Zombie(EntityType.ZOMBIE, _level);
						entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new RisingExecutionerEntity(DozInMaincraftModEntities.RISING_EXECUTIONER.get(), _level);
						entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BloodyClawEntity(DozInMaincraftModEntities.BLOODY_CLAW.get(), _level);
						entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BloodyCarcassEntity(DozInMaincraftModEntities.BLOODY_CARCASS.get(), _level);
						entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
				if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new BrigadierGhulEntity(DozInMaincraftModEntities.BRIGADIER_GHUL.get(), _level);
						entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulArrowsEntity(DozInMaincraftModEntities.GHOUL_ARROWS.get(), _level);
						entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulBanditEntity(DozInMaincraftModEntities.GHOUL_BANDIT.get(), _level);
						entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulBullEntity(DozInMaincraftModEntities.GHOUL_BULL.get(), _level);
						entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				} else if (Math.random() < 0.25) {
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = new GhoulRaiderEntity(DozInMaincraftModEntities.GHOUL_RAIDER.get(), _level);
						entityToSpawn.moveTo(x, y, (z + 1), world.getRandom().nextFloat() * 360F, 0);
						if (entityToSpawn instanceof Mob _mobToSpawn)
							_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
