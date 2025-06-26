package net.juan.conquestflags.menu;

import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.item.ItemStack;

public class ConquestFlagMenu extends AbstractContainerMenu {
    private final ContainerLevelAccess access;

    public ConquestFlagMenu(int id, Inventory playerInventory, ContainerLevelAccess access) {
        super(ModMenus.CONQUEST_FLAG_MENU.get(), id);
        this.access = access;
    }

    @Override
    public ItemStack quickMoveStack(Player player, int i) {
        return ItemStack.EMPTY;
    }

    @Override
    public boolean stillValid(Player player) {
        return true; // Puedes usar access.evaluate(...) para validarlo según la posición
    }
}

