
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.more_vanilla.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.more_vanilla.fluid.EauregeneranteFluid;
import net.mcreator.more_vanilla.MoreVanillaMod;

public class MoreVanillaModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, MoreVanillaMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> EAUREGENERANTE = REGISTRY.register("eauregenerante", () -> new EauregeneranteFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_EAUREGENERANTE = REGISTRY.register("flowing_eauregenerante", () -> new EauregeneranteFluid.Flowing());

	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(EAUREGENERANTE.get(), RenderType.translucent());
			ItemBlockRenderTypes.setRenderLayer(FLOWING_EAUREGENERANTE.get(), RenderType.translucent());
		}
	}
}
