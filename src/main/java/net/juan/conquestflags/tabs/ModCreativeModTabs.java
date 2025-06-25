package net.juan.conquestflags.tabs;

import net.juan.conquestflags.Conquistflags;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.juan.conquestflags.item.ModItems;


public class ModCreativeModTabs {
    public static final CreativeModeTab FLAG_TAB = new CreativeModeTab(Conquistflags.MOD_ID + ".conquistflags_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FLAG.get());
        }
    };
}
