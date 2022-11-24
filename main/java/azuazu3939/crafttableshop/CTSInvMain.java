package azuazu3939.crafttableshop;

import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class CTSInvMain implements InventoryHolder {

    HumanEntity player;

    public CTSInvMain(HumanEntity player) {
        this.player = player;
    }
    @Override
    public @NotNull Inventory getInventory() {
        return null;
    }
}
