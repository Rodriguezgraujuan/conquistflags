package net.juan.conquestflags.client;

import net.juan.conquestflags.menu.ConquestFlagMenu;
import net.juan.conquestflags.client.screen.ConquestFlagScreen;
import net.juan.conquestflags.menu.ModMenus;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterClientTooltipComponentFactoriesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(modid = "conquestflags", bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModEventSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(ModMenus.CONQUEST_FLAG_MENU.get(), ConquestFlagScreen::new);
        });
    }
}
