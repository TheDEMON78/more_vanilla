
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.more_vanilla.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.RegisterSpawnPlacementsEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.more_vanilla.entity.UpgradeironbossEntity;
import net.mcreator.more_vanilla.entity.UpgradegoldbossEntity;
import net.mcreator.more_vanilla.entity.UpgradeemeraldbossEntity;
import net.mcreator.more_vanilla.entity.UpgradediamondbossEntity;
import net.mcreator.more_vanilla.entity.SbirebossenderiteEntity;
import net.mcreator.more_vanilla.entity.GreenfireballpowerProjectileEntity;
import net.mcreator.more_vanilla.entity.EndsilverEntity;
import net.mcreator.more_vanilla.entity.DynamitemProjectileEntity;
import net.mcreator.more_vanilla.entity.Bossofenderitephase2Entity;
import net.mcreator.more_vanilla.entity.BossofenderiteEntity;
import net.mcreator.more_vanilla.MoreVanillaMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MoreVanillaModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, MoreVanillaMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<BossofenderiteEntity>> BOSSOFENDERITEPHASE1 = register("bossofenderitephase1",
			EntityType.Builder.<BossofenderiteEntity>of(BossofenderiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<SbirebossenderiteEntity>> SBIREBOSSENDERITE = register("sbirebossenderite",
			EntityType.Builder.<SbirebossenderiteEntity>of(SbirebossenderiteEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<UpgradeironbossEntity>> UPGRADEIRONBOSS = register("upgradeironboss",
			EntityType.Builder.<UpgradeironbossEntity>of(UpgradeironbossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<UpgradegoldbossEntity>> UPGRADEGOLDBOSS = register("upgradegoldboss",
			EntityType.Builder.<UpgradegoldbossEntity>of(UpgradegoldbossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<UpgradeemeraldbossEntity>> UPGRADEEMERALDBOSS = register("upgradeemeraldboss",
			EntityType.Builder.<UpgradeemeraldbossEntity>of(UpgradeemeraldbossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<UpgradediamondbossEntity>> UPGRADEDIAMONDBOSS = register("upgradediamondboss",
			EntityType.Builder.<UpgradediamondbossEntity>of(UpgradediamondbossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<GreenfireballpowerProjectileEntity>> GREENFIREBALLPOWER_PROJECTILE = register("greenfireballpower_projectile",
			EntityType.Builder.<GreenfireballpowerProjectileEntity>of(GreenfireballpowerProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<DynamitemProjectileEntity>> DYNAMITEM_PROJECTILE = register("dynamitem_projectile",
			EntityType.Builder.<DynamitemProjectileEntity>of(DynamitemProjectileEntity::new, MobCategory.MISC).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final DeferredHolder<EntityType<?>, EntityType<Bossofenderitephase2Entity>> BOSSOFENDERITEPHASE_2 = register("bossofenderitephase_2",
			EntityType.Builder.<Bossofenderitephase2Entity>of(Bossofenderitephase2Entity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<EndsilverEntity>> ENDSILVER = register("endsilver",
			EntityType.Builder.<EndsilverEntity>of(EndsilverEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.4f, 0.3f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(RegisterSpawnPlacementsEvent event) {
		BossofenderiteEntity.init(event);
		SbirebossenderiteEntity.init(event);
		UpgradeironbossEntity.init(event);
		UpgradegoldbossEntity.init(event);
		UpgradeemeraldbossEntity.init(event);
		UpgradediamondbossEntity.init(event);
		Bossofenderitephase2Entity.init(event);
		EndsilverEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(BOSSOFENDERITEPHASE1.get(), BossofenderiteEntity.createAttributes().build());
		event.put(SBIREBOSSENDERITE.get(), SbirebossenderiteEntity.createAttributes().build());
		event.put(UPGRADEIRONBOSS.get(), UpgradeironbossEntity.createAttributes().build());
		event.put(UPGRADEGOLDBOSS.get(), UpgradegoldbossEntity.createAttributes().build());
		event.put(UPGRADEEMERALDBOSS.get(), UpgradeemeraldbossEntity.createAttributes().build());
		event.put(UPGRADEDIAMONDBOSS.get(), UpgradediamondbossEntity.createAttributes().build());
		event.put(BOSSOFENDERITEPHASE_2.get(), Bossofenderitephase2Entity.createAttributes().build());
		event.put(ENDSILVER.get(), EndsilverEntity.createAttributes().build());
	}
}
