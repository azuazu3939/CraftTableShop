package azuazu3939.crafttableshop;

import org.bukkit.entity.HumanEntity;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class CTSInvCraft implements InventoryHolder {

    HumanEntity player;

    public CTSInvCraft(HumanEntity player) {
        this.player = player;
    }
    @Override
    public @NotNull Inventory getInventory() {
        return null;
    }
}
