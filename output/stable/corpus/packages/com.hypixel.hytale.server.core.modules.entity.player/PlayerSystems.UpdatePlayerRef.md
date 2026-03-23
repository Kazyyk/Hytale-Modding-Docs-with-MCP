# PlayerSystems.UpdatePlayerRef

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public static class PlayerSystems.UpdatePlayerRef extends EntityTickingSystem<EntityStore>

An ECS ticking system that updates the `PlayerRef` position and rotation from the entity's `TransformComponent` and `HeadRotation` each tick. Queries entities with `PlayerRef`, `TransformComponent`, and `HeadRotation`.

## Related Types

- PlayerSystems -- parent container class
