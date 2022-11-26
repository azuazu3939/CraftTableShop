package azuazu3939.crafttableshop;

import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.jetbrains.annotations.NotNull;

public class CTSInvSub implements InventoryHolder {

    Player player;

    public CTSInvSub(Player player) {
        this.player = player;
    }

    @Override
    public @NotNull Inventory getInventory() {
        return null;
    }

}
