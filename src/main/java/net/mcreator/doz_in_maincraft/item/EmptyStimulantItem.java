
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class EmptyStimulantItem extends Item {
	public EmptyStimulantItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
