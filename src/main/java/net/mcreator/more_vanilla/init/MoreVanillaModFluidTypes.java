
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.more_vanilla.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.more_vanilla.fluid.types.EauregeneranteFluidType;
import net.mcreator.more_vanilla.MoreVanillaMod;

public class MoreVanillaModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, MoreVanillaMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> EAUREGENERANTE_TYPE = REGISTRY.register("eauregenerante", () -> new EauregeneranteFluidType());
}
