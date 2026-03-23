# PlayerSystems.ProcessPlayerInput

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public static class PlayerSystems.ProcessPlayerInput extends EntityTickingSystem<EntityStore>

An ECS ticking system that drains the PlayerInput queue and applies each input update to the entity. Queries entities with `Player`, `PlayerInput`, and `TransformComponent`.

## Related Types

- PlayerSystems -- parent container class
