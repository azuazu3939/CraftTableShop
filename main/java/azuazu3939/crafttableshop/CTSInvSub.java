package azuazu3939.crafttableshop;

import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

import static azuazu3939.crafttableshop.CTSCancelEvent.CLICK_PLAYER;

public class CTSInvSub implements InventoryHolder {

    HumanEntity player;

    public CTSInvSub(HumanEntity player) {
        this.player = player;
    }

    @Override
    public @NotNull Inventory getInventory() {
        return null;
    }

}