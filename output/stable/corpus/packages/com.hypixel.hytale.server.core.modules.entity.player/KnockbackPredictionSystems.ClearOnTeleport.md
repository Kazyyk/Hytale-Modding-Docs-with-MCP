# KnockbackPredictionSystems.ClearOnTeleport

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: RefChangeSystem<EntityStore, Teleport>

public static class KnockbackPredictionSystems.ClearOnTeleport extends RefChangeSystem<EntityStore, Teleport>

An ECS component-change system that removes the `KnockbackSimulation` component when a `Teleport` component is added to an entity that has a knockback simulation in progress. This cancels the knockback prediction when the player is teleported.

## Related Types

- KnockbackPredictionSystems -- parent container class
- KnockbackSimulation -- component removed by this system
