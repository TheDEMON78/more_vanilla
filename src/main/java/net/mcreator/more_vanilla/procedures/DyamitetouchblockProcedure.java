package net.mcreator.more_vanilla.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;

import net.mcreator.more_vanilla.MoreVanillaMod;

public class DyamitetouchblockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		MoreVanillaMod.queueServerWork(25, () -> {
			if (world instanceof Level _level && !_level.isClientSide())
				_level.explode(null, x, y, z, 2, Level.ExplosionInteraction.TNT);
		});
	}
}
