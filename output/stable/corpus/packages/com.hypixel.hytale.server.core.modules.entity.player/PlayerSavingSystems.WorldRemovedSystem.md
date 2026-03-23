# PlayerSavingSystems.WorldRemovedSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: StoreSystem<EntityStore>

public static class PlayerSavingSystems.WorldRemovedSystem extends StoreSystem<EntityStore>

An ECS store system that runs when the system is removed from the store (i.e., when the world is shutting down). Saves all player data if saving is enabled, and disconnects all players with the message "Stopping world!". Iterates over all entities matching `Player` and `PlayerRef` in parallel.

## Related Types

- PlayerSavingSystems -- parent container class
