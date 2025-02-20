package net.mcreator.more_vanilla.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class HealCommandExecutedProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		for (int index0 = 0; index0 < 5; index0++) {
			if (entity instanceof LivingEntity _entity)
				_entity.setHealth(20);
			if (entity instanceof Player _player)
				_player.getFoodData().setFoodLevel(20);
			if (entity instanceof Player _player)
				_player.getFoodData().setSaturation(20);
			entity.setAirSupply(10);
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("healed"), true);
		}
	}
}
