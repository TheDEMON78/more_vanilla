
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.more_vanilla.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.more_vanilla.MoreVanillaMod;

public class MoreVanillaModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, MoreVanillaMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> LOKI = REGISTRY.register("loki", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("more_vanilla", "loki")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BATTLE = REGISTRY.register("battle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("more_vanilla", "battle")));
}
