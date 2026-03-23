# KnockbackPredictionSystems.ClearOnRemove

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefSystem<EntityStore>

public static class KnockbackPredictionSystems.ClearOnRemove extends RefSystem<EntityStore>

An ECS ref system that removes the `KnockbackSimulation` component when an entity with that component is removed from the store. Prevents stale simulation state from persisting.

## Related Types

- KnockbackPredictionSystems -- parent container class
- KnockbackSimulation -- component removed by this system
