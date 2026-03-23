# KnockbackPredictionSystems.SimulateKnockback

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.player | Extends: EntityTickingSystem<EntityStore>

@Deprecated
public static class KnockbackPredictionSystems.SimulateKnockback extends EntityTickingSystem<EntityStore>

**Deprecated.** An ECS ticking system that runs the server-side knockback physics simulation. Runs AFTER `PlayerSystems.ProcessPlayerInput`. Simulates gravity, drag, friction, jumping, and collision detection at a fixed 60 Hz time step to predict knockback trajectory. Handles velocity requests (add/set), wish movement conversion, and blends the client position with the simulation position near the end of the knockback window.

Removes the `KnockbackSimulation` component when the simulation timer expires or the entity is dead.

Queries entities with `Player`, `TransformComponent`, `KnockbackSimulation`, `BoundingBox`, `MovementStatesComponent`, `MovementManager`, and `PlayerRef`.

## Related Types

- KnockbackPredictionSystems -- parent container class
- KnockbackSimulation -- simulation state managed by this system
