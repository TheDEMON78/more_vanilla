package net.mcreator.more_vanilla.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.particles.SimpleParticleType;

import net.mcreator.more_vanilla.init.MoreVanillaModParticleTypes;

public class GreenfireballpowerLorsqueProjectileVolantTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.addParticle((SimpleParticleType) (MoreVanillaModParticleTypes.FIREBALLPOWER.get()), x, y, z, 0, 0, 0);
	}
}
