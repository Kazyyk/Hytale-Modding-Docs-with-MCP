# PlayerSendInventorySystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public class PlayerSendInventorySystem extends EntityTickingSystem<EntityStore>

An ECS ticking system that sends inventory updates to the client when the player's inventory is dirty. Each tick, checks `Inventory.consumeIsDirty()` and sends the full inventory packet if changes occurred. Also calls `WindowManager.updateWindows()` to synchronize open UI windows.

Queries entities with `Player` and `PlayerRef`.

## Related Types

- PlayerSystems -- other player systems
