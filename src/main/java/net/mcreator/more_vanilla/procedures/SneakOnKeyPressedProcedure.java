package net.mcreator.more_vanilla.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.more_vanilla.init.MoreVanillaModBlocks;

public class SneakOnKeyPressedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double niveau = 0;
		if ((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == MoreVanillaModBlocks.ELEVATOR.get()) {
			niveau = y - 2;
			while (!((world.getBlockState(BlockPos.containing(x, niveau, z))).getBlock() == MoreVanillaModBlocks.ELEVATOR.get())) {
				niveau = niveau - 1;
				if (niveau <= 1) {
					niveau = y;
					break;
				}
			}
			if (niveau < y && niveau > 1) {
				{
					Entity _ent = entity;
					_ent.teleportTo(x, (niveau + 1), z);
					if (_ent instanceof ServerPlayer _serverPlayer)
						_serverPlayer.connection.teleport(x, (niveau + 1), z, _ent.getYRot(), _ent.getXRot());
				}
				if (world instanceof Level _level) {
					if (!_level.isClientSide()) {
						_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.teleport")), SoundSource.NEUTRAL, 1, 1);
					} else {
						_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.player.teleport")), SoundSource.NEUTRAL, 1, 1, false);
					}
				}
			}
		}
	}
}
