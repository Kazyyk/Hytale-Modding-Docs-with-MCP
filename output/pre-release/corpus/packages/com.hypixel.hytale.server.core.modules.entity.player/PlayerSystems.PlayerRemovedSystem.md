# PlayerSystems.PlayerRemovedSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: HolderSystem<EntityStore>

public static class PlayerSystems.PlayerRemovedSystem extends HolderSystem<EntityStore>

An ECS holder system that handles player entity removal from a world. Logs the removal, saves the player's last position and head rotation to their per-world data, disables packet queuing, flushes remaining packets, and broadcasts a "player left world" message to other players.

## Related Types

- PlayerSystems -- parent container class
