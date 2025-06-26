package net.juan.conquestflags.menu;

import net.juan.conquestflags.Conquestflags;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModMenus {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, Conquestflags.MOD_ID);

    public static final RegistryObject<MenuType<ConquestFlagMenu>> CONQUEST_FLAG_MENU =
            MENUS.register("conquest_flag_menu",
                    () -> IForgeMenuType.create((id, inv, data) ->
                            new ConquestFlagMenu(id, inv, null))); // Puedes manejar ContainerLevelAccess si lo deseas

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
