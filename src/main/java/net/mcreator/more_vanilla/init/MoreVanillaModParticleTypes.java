
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.more_vanilla.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.core.registries.Registries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

import net.mcreator.more_vanilla.MoreVanillaMod;

public class MoreVanillaModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(Registries.PARTICLE_TYPE, MoreVanillaMod.MODID);
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> EAUREGENPARTICULE = REGISTRY.register("eauregenparticule", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> CAVEBLOCKPARTICULE = REGISTRY.register("caveblockparticule", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> PARTICULEENDBIOME = REGISTRY.register("particuleendbiome", () -> new SimpleParticleType(false));
	public static final DeferredHolder<ParticleType<?>, SimpleParticleType> FIREBALLPOWER = REGISTRY.register("fireballpower", () -> new SimpleParticleType(false));
}
