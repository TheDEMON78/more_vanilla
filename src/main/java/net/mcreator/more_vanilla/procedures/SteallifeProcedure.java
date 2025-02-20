package net.mcreator.more_vanilla.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.ParticleTypes;

import net.mcreator.more_vanilla.init.MoreVanillaModItems;
import net.mcreator.more_vanilla.MoreVanillaMod;

import javax.annotation.Nullable;

@EventBusSubscriber
public class SteallifeProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		execute(null, world, entity, sourceentity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY)
				.getEnchantmentLevel(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("more_vanilla:voldevie")))) != 0) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.WOODEN_SWORD) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 1));
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.STONE_SWORD) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 2));
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.IRON_SWORD) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 3));
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GOLDEN_SWORD) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 4));
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.DIAMOND_SWORD
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MoreVanillaModItems.EMERALDSWORD.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MoreVanillaModItems.RUBYSWORD.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MoreVanillaModItems.SAPPHIRESWORD.get()) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 5));
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.NETHERITE_SWORD
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MoreVanillaModItems.UPGRADENETHERITEIRON_SWORD.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MoreVanillaModItems.UPGRADENETHERITEGOLDSWORD.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MoreVanillaModItems.UPGRADENETHERITEEMERAULDSWORD.get()
					|| (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MoreVanillaModItems.UPGRADENETHERITEDIAMONDSWORD.get()) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 6));
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MoreVanillaModItems.ENDERITE_SWORD.get()) {
				if (sourceentity instanceof LivingEntity _entity)
					_entity.setHealth((float) ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) + 7));
			}
			if (world instanceof ServerLevel _level)
				_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, ((entity.getX() * 2 + sourceentity.getX() * 0) / 2), ((entity.getY() * 2 + sourceentity.getY() * 0) / 2 + 1), ((entity.getZ() * 2 + sourceentity.getZ() * 0) / 2), 2, 0.1, 0.1, 0.1,
						1);
			MoreVanillaMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, ((entity.getX() * 1.75 + sourceentity.getX() * 0.25) / 2), ((entity.getY() * 1.75 + sourceentity.getY() * 0.25) / 2 + 1),
							((entity.getZ() * 1.75 + sourceentity.getZ() * 0.25) / 2), 2, 0.1, 0.1, 0.1, 1);
			});
			MoreVanillaMod.queueServerWork(2, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, ((entity.getX() * 1.5 + sourceentity.getX() * 0.5) / 2), ((entity.getY() * 1.5 + sourceentity.getY() * 0.5) / 2 + 1), ((entity.getZ() * 1.5 + sourceentity.getZ() * 0.5) / 2), 2,
							0.1, 0.1, 0.1, 1);
			});
			MoreVanillaMod.queueServerWork(3, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, ((entity.getX() * 1.25 + sourceentity.getX() * 0.75) / 2), ((entity.getY() * 1.25 + sourceentity.getY() * 0.75) / 2 + 1),
							((entity.getZ() * 1.25 + sourceentity.getZ() * 0.75) / 2), 2, 0.1, 0.1, 0.1, 1);
			});
			MoreVanillaMod.queueServerWork(4, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, ((entity.getX() * 1 + sourceentity.getX() * 1) / 2), ((entity.getY() * 1 + sourceentity.getY() * 1) / 2 + 1), ((entity.getZ() * 1 + sourceentity.getZ() * 1) / 2), 2, 0.1, 0.1,
							0.1, 1);
			});
			MoreVanillaMod.queueServerWork(5, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, ((entity.getX() * 0.75 + sourceentity.getX() * 1.25) / 2), ((entity.getY() * 0.75 + sourceentity.getY() * 1.25) / 2 + 1),
							((entity.getZ() * 0.75 + sourceentity.getZ() * 1.25) / 2), 2, 0.1, 0.1, 0.1, 1);
			});
			MoreVanillaMod.queueServerWork(6, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, ((entity.getX() * 0.5 + sourceentity.getX() * 1.5) / 2), ((entity.getY() * 0.5 + sourceentity.getY() * 1.5) / 2 + 1), ((entity.getZ() * 0.5 + sourceentity.getZ() * 1.5) / 2), 2,
							0.1, 0.1, 0.1, 1);
			});
			MoreVanillaMod.queueServerWork(7, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, ((entity.getX() * 0.25 + sourceentity.getX() * 1.75) / 2), ((entity.getY() * 0.25 + sourceentity.getY() * 1.75) / 2 + 1),
							((entity.getZ() * 0.25 + sourceentity.getZ() * 1.75) / 2), 2, 0.1, 0.1, 0.1, 1);
			});
			MoreVanillaMod.queueServerWork(8, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles(ParticleTypes.HAPPY_VILLAGER, ((entity.getX() * 0 + sourceentity.getX() * 2) / 2), ((entity.getY() * 0 + sourceentity.getY() * 2) / 2 + 1), ((entity.getZ() * 0 + sourceentity.getZ() * 2) / 2), 2, 0.1, 0.1,
							0.1, 1);
			});
		}
	}
}
