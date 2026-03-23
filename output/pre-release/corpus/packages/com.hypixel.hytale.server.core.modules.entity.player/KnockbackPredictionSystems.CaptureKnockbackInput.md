# KnockbackPredictionSystems.CaptureKnockbackInput

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

public static class KnockbackPredictionSystems.CaptureKnockbackInput extends EntityTickingSystem<EntityStore>

An ECS ticking system that runs BEFORE `PlayerSystems.ProcessPlayerInput` to extract movement and jump inputs from the player input queue during knockback. Updates the KnockbackSimulation component with client position, relative movement, and movement states.

Queries entities with both `PlayerInput` and `KnockbackSimulation` components.

## Related Types

- KnockbackPredictionSystems -- parent container class
- KnockbackSimulation -- simulation state updated by this system
- PlayerInput -- input queue consumed by this system
