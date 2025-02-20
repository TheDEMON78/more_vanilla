
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.more_vanilla.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.more_vanilla.client.gui.BarrelguiScreen;
import net.mcreator.more_vanilla.client.gui.BackpackguiScreen;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MoreVanillaModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(MoreVanillaModMenus.BARRELGUI.get(), BarrelguiScreen::new);
		event.register(MoreVanillaModMenus.BACKPACKGUI.get(), BackpackguiScreen::new);
	}
}
