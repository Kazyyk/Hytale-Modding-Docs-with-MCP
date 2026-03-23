# PlayerSystems.EnsureEffectControllerSystem

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: HolderSystem<EntityStore>

public static class PlayerSystems.EnsureEffectControllerSystem extends HolderSystem<EntityStore>

An ECS holder system that ensures every player entity has an `EffectControllerComponent`. Queries entities with a `PlayerRef` and adds the component on entity creation.

## Related Types

- PlayerSystems -- parent container class