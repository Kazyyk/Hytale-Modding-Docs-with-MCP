# PlayerSavingSystems.TickingSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore> | Implements: RunWhenPausedSystem<EntityStore>

public static class PlayerSavingSystems.TickingSystem extends EntityTickingSystem<EntityStore> implements RunWhenPausedSystem<EntityStore>

An ECS ticking system that periodically saves player data every 10 seconds (when saving is enabled for the world). Compares current position, rotation, and inventory state against last saved values. Only saves when a change is detected. Implements `RunWhenPausedSystem` so saves continue during game pause.

Queries entities with `Player`, `TransformComponent`, and `HeadRotation`.

## Related Types

- PlayerSavingSystems -- parent container class
- PlayerSavingSystems.SaveDataResource -- timer resource
