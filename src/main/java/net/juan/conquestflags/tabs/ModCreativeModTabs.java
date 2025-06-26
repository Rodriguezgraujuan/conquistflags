package net.juan.conquestflags.tabs;

import net.juan.conquestflags.Conquestflags;
import net.juan.conquestflags.blocks.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.juan.conquestflags.item.ModItems;


public class ModCreativeModTabs {
    public static final CreativeModeTab FLAG_TAB = new CreativeModeTab(Conquestflags.MOD_ID + ".conquestflags_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.FLAG_BLOCK.get());
        }
    };
}
