package net.mcreator.more_vanilla.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.more_vanilla.init.MoreVanillaModEntities;

public class BossofenderiteQuandLentiteEstBlesseeProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double a = 0;
		a = Math.ceil(Math.random() * 20);
		if (a == 4) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = MoreVanillaModEntities.SBIREBOSSENDERITE.get().spawn(_level, BlockPos.containing(x + 1, y + 1, z + 1), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (a == 8) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = MoreVanillaModEntities.SBIREBOSSENDERITE.get().spawn(_level, BlockPos.containing(x + 1, y + 1, z - 1), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (a == 12) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = MoreVanillaModEntities.SBIREBOSSENDERITE.get().spawn(_level, BlockPos.containing(x - 1, y + 1, z + 1), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		} else if (a == 16) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = MoreVanillaModEntities.SBIREBOSSENDERITE.get().spawn(_level, BlockPos.containing(x - 1, y + 1, z - 1), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
