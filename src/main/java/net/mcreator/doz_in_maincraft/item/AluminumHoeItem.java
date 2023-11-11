
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

import net.mcreator.doz_in_maincraft.init.DozInMaincraftModItems;

public class AluminumHoeItem extends HoeItem {
	public AluminumHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 441;
			}

			public float getSpeed() {
				return 8f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 21;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(DozInMaincraftModItems.ALUMINUM_INGOT.get()));
			}
		}, 0, -3f, new Item.Properties());
	}
}
