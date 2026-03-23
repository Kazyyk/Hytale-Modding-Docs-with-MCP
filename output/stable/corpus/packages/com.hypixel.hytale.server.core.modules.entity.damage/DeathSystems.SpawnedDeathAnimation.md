# DeathSystems.SpawnedDeathAnimation

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.damage | Extends: RefSystem<EntityStore>

public static class DeathSystems.SpawnedDeathAnimation extends RefSystem<EntityStore>

Plays the death animation on entities that are spawned into the world already dead (i.e., they have a `DeathComponent` when added to the store). This handles the case where a dead entity is loaded from persistence. Triggers on `onEntityAdded` for entities matching the dead living entity query. The `onEntityRemove` method is a no-op.

## Related Types

- DeathSystems -- parent class
- DeathSystems.DeathAnimation -- plays animation when death component is added at runtime
- DeathComponent -- required component
