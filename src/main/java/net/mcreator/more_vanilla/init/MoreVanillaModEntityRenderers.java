
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.more_vanilla.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import net.mcreator.more_vanilla.client.renderer.UpgradeironbossRenderer;
import net.mcreator.more_vanilla.client.renderer.UpgradegoldbossRenderer;
import net.mcreator.more_vanilla.client.renderer.UpgradeemeraldbossRenderer;
import net.mcreator.more_vanilla.client.renderer.UpgradediamondbossRenderer;
import net.mcreator.more_vanilla.client.renderer.SbirebossenderiteRenderer;
import net.mcreator.more_vanilla.client.renderer.EndsilverRenderer;
import net.mcreator.more_vanilla.client.renderer.Bossofenderitephase2Renderer;
import net.mcreator.more_vanilla.client.renderer.BossofenderiteRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreVanillaModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MoreVanillaModEntities.BOSSOFENDERITEPHASE1.get(), BossofenderiteRenderer::new);
		event.registerEntityRenderer(MoreVanillaModEntities.SBIREBOSSENDERITE.get(), SbirebossenderiteRenderer::new);
		event.registerEntityRenderer(MoreVanillaModEntities.UPGRADEIRONBOSS.get(), UpgradeironbossRenderer::new);
		event.registerEntityRenderer(MoreVanillaModEntities.UPGRADEGOLDBOSS.get(), UpgradegoldbossRenderer::new);
		event.registerEntityRenderer(MoreVanillaModEntities.UPGRADEEMERALDBOSS.get(), UpgradeemeraldbossRenderer::new);
		event.registerEntityRenderer(MoreVanillaModEntities.UPGRADEDIAMONDBOSS.get(), UpgradediamondbossRenderer::new);
		event.registerEntityRenderer(MoreVanillaModEntities.GREENFIREBALLPOWER_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MoreVanillaModEntities.DYNAMITEM_PROJECTILE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MoreVanillaModEntities.BOSSOFENDERITEPHASE_2.get(), Bossofenderitephase2Renderer::new);
		event.registerEntityRenderer(MoreVanillaModEntities.ENDSILVER.get(), EndsilverRenderer::new);
	}
}
