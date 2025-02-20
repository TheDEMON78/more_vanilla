
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.more_vanilla.init;

import net.neoforged.neoforge.client.event.RegisterParticleProvidersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.more_vanilla.client.particle.ParticuleendbiomeParticle;
import net.mcreator.more_vanilla.client.particle.FireballpowerParticle;
import net.mcreator.more_vanilla.client.particle.EauregenparticuleParticle;
import net.mcreator.more_vanilla.client.particle.CaveblockparticuleParticle;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreVanillaModParticles {
	@SubscribeEvent
	public static void registerParticles(RegisterParticleProvidersEvent event) {
		event.registerSpriteSet(MoreVanillaModParticleTypes.EAUREGENPARTICULE.get(), EauregenparticuleParticle::provider);
		event.registerSpriteSet(MoreVanillaModParticleTypes.CAVEBLOCKPARTICULE.get(), CaveblockparticuleParticle::provider);
		event.registerSpriteSet(MoreVanillaModParticleTypes.PARTICULEENDBIOME.get(), ParticuleendbiomeParticle::provider);
		event.registerSpriteSet(MoreVanillaModParticleTypes.FIREBALLPOWER.get(), FireballpowerParticle::provider);
	}
}
