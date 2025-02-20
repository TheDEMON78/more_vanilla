
package net.mcreator.more_vanilla.fluid;

import net.neoforged.neoforge.fluids.BaseFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.more_vanilla.init.MoreVanillaModParticleTypes;
import net.mcreator.more_vanilla.init.MoreVanillaModItems;
import net.mcreator.more_vanilla.init.MoreVanillaModFluids;
import net.mcreator.more_vanilla.init.MoreVanillaModFluidTypes;
import net.mcreator.more_vanilla.init.MoreVanillaModBlocks;

public abstract class EauregeneranteFluid extends BaseFlowingFluid {
	public static final BaseFlowingFluid.Properties PROPERTIES = new BaseFlowingFluid.Properties(() -> MoreVanillaModFluidTypes.EAUREGENERANTE_TYPE.get(), () -> MoreVanillaModFluids.EAUREGENERANTE.get(),
			() -> MoreVanillaModFluids.FLOWING_EAUREGENERANTE.get()).explosionResistance(100f).bucket(() -> MoreVanillaModItems.EAUREGENERANTE_BUCKET.get()).block(() -> (LiquidBlock) MoreVanillaModBlocks.EAUREGENERANTE.get());

	private EauregeneranteFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return (SimpleParticleType) (MoreVanillaModParticleTypes.EAUREGENPARTICULE.get());
	}

	public static class Source extends EauregeneranteFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends EauregeneranteFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
