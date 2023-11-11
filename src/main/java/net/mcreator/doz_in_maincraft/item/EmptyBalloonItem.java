
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyBalloonItem extends Item {
	public EmptyBalloonItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
