
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.more_vanilla.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;

import net.minecraft.world.inventory.MenuType;
import net.minecraft.core.registries.Registries;

import net.mcreator.more_vanilla.world.inventory.BarrelguiMenu;
import net.mcreator.more_vanilla.world.inventory.BackpackguiMenu;
import net.mcreator.more_vanilla.MoreVanillaMod;

public class MoreVanillaModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(Registries.MENU, MoreVanillaMod.MODID);
	public static final DeferredHolder<MenuType<?>, MenuType<BarrelguiMenu>> BARRELGUI = REGISTRY.register("barrelgui", () -> IMenuTypeExtension.create(BarrelguiMenu::new));
	public static final DeferredHolder<MenuType<?>, MenuType<BackpackguiMenu>> BACKPACKGUI = REGISTRY.register("backpackgui", () -> IMenuTypeExtension.create(BackpackguiMenu::new));
}
