
package net.mcreator.more_vanilla.block;

import org.checkerframework.checker.units.qual.s;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class EnderiteblockBlock extends Block {
	public EnderiteblockBlock() {
		super(BlockBehaviour.Properties.of()
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.netherite_block.break")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.netherite_block.step")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.netherite_block.place")), () -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.netherite_block.hit")),
						() -> BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("block.netherite_block.fall"))))
				.strength(1f, 10f).lightLevel(s -> 1).requiresCorrectToolForDrops().hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true));
	}

	@Override
	public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
		return 15;
	}
}
