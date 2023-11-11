
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import net.mcreator.doz_in_maincraft.procedures.Tier22Procedure;

public class HugeBoxFromHozmagItem extends Item {
	public HugeBoxFromHozmagItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		Tier22Procedure.execute(context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
