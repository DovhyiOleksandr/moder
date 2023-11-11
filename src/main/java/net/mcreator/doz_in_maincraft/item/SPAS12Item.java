
package net.mcreator.doz_in_maincraft.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;
import net.minecraft.server.level.ServerPlayer;

import net.mcreator.doz_in_maincraft.procedures.SPAS12PriIspolzovaniiStrielkovoghoPriedmietaProcedure;
import net.mcreator.doz_in_maincraft.procedures.SPAS12MozhnoIspolzovatDalnoboinyiPriedmietProcedure;
import net.mcreator.doz_in_maincraft.entity.SPAS12Entity;

public class SPAS12Item extends Item {
	public SPAS12Item() {
		super(new Item.Properties().durability(500));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		entity.startUsingItem(hand);
		return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 72000;
	}

	@Override
	public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
		if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
			double x = entity.getX();
			double y = entity.getY();
			double z = entity.getZ();
			if (SPAS12MozhnoIspolzovatDalnoboinyiPriedmietProcedure.execute(entity)) {
				SPAS12Entity entityarrow = SPAS12Entity.shoot(world, entity, world.getRandom(), 1.5f, 5, 5);
				itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
				entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
				SPAS12PriIspolzovaniiStrielkovoghoPriedmietaProcedure.execute(itemstack);
			}
		}
	}
}
