package net.mcreator.doz_in_maincraft.procedures;

import net.minecraftforge.items.ItemHandlerHelper;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModItems;

public class Tier11Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ELECTRICAL_TAPE.get());
				_setstack.setCount(4);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (Math.random() < 0.25) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ELECTRICAL_TAPE.get());
					_setstack.setCount(3);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (Math.random() < 0.25) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ELECTRICAL_TAPE.get());
						_setstack.setCount(2);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(DozInMaincraftModItems.ELECTRICAL_TAPE.get());
						_setstack.setCount(1);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				}
			}
		}
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.HEALING_MIXTURE.get());
				_setstack.setCount(2);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.HEALING_MIXTURE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.CASTING_MOLD.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
				_setstack.setCount(6);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		} else {
			if (Math.random() < 0.25) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
					_setstack.setCount(5);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else {
				if (Math.random() < 0.25) {
					if (entity instanceof Player _player) {
						ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
						_setstack.setCount(4);
						ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
					}
				} else {
					if (Math.random() < 0.25) {
						if (entity instanceof Player _player) {
							ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
							_setstack.setCount(3);
							ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
						}
					} else {
						if (Math.random() < 0.25) {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
								_setstack.setCount(2);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						} else {
							if (entity instanceof Player _player) {
								ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP);
								_setstack.setCount(1);
								ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
							}
						}
					}
				}
			}
		}
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.PLATE_SHAPE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (Math.random() < 0.25) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DRUM_SHAPE.get());
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
		}
		if (Math.random() < 0.2) {
			if (Math.random() < 0.1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_PP_19.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.15) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_PP_19.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (Math.random() < 0.1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_SKAR_H.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.15) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_SKAR_H.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (Math.random() < 0.1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_SPAS_12.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.15) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_SPAS_12.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (Math.random() < 0.1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_PPH.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.15) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_PPH.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (Math.random() < 0.1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_AKM.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.15) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_AKM.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (Math.random() < 0.1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_SWD.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.15) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_SWD.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (Math.random() < 0.2) {
			if (Math.random() < 0.1) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_PM.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.15) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.DETAIL_PM.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (Math.random() < 0.8) {
			if (Math.random() < 0.15) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.BOLTS.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.145) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.BOLTS.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.13) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.BOLTS.get());
					_setstack.setCount(3);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (Math.random() < 0.8) {
			if (Math.random() < 0.15) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.PRECISION_TOOL.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.145) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.PRECISION_TOOL.get());
					_setstack.setCount(2);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			} else if (Math.random() < 0.13) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.PRECISION_TOOL.get());
					_setstack.setCount(3);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (Math.random() < 0.7) {
			if (Math.random() < 0.3) {
				if (entity instanceof Player _player) {
					ItemStack _setstack = new ItemStack(DozInMaincraftModItems.PLASMA_CABLE.get());
					_setstack.setCount(1);
					ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
				}
			}
		}
		if (entity instanceof Player _player) {
			ItemStack _stktoremove = new ItemStack(DozInMaincraftModItems.LARGE_BOX_FROM_HOZMAG.get());
			_player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
		}
	}
}
