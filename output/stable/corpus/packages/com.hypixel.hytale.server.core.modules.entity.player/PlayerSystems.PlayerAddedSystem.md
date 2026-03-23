# PlayerSystems.PlayerAddedSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class PlayerSystems.PlayerAddedSystem extends RefSystem<EntityStore>

An ECS ref system that performs full player initialization when a player entity joins a world. Sets display name, records spawn time, initializes game mode, sends inventory and active slot packets, sends creative sound set, handles pending death (shows respawn screen), spawns particle effects, and flushes packets. Depends on `PlayerSpawnedSystem`. On removal, closes all open windows.

## Related Types

- PlayerSystems -- parent container class
