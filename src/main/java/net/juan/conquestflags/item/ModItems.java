package net.juan.conquestflags.item;

import net.juan.conquestflags.Conquistflags;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.juan.conquestflags.tabs.ModCreativeModTabs;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Conquistflags.MOD_ID);

    public static final RegistryObject<Item> FLAG = ITEMS.register("conquistFlag",
            ()->new Item(new Item.Properties().tab(ModCreativeModTabs.FLAG_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
