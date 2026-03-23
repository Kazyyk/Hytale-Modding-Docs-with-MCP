# LegacyProjectileSystems

Type: class | Package: com.hypixel.hytale.server.core.modules.entity

public class LegacyProjectileSystems

Container class for ECS systems that manage legacy projectile entities. These systems handle projectile initialization, validation, and per-tick physics/lifecycle processing. All inner systems operate on `EntityStore` and are registered by EntityModule during setup.

## Inner Classes

### OnAddHolderSystem


public static class OnAddHolderSystem extends HolderSystem<EntityStore>

Initialization system triggered when a projectile entity is added to the store. Performs the following setup:

1. Assigns a `NetworkId` if the archetype does not already contain one.
2. Calls `ProjectileComponent.initialize()`.
3. Attempts to load the model from `ModelAsset.getAssetMap()` using the projectile's appearance key. If a model is found, sets up `ModelComponent` and `PersistentModel` components, and derives the bounding box from the model.
4. If no model is found, falls back to the `Projectile` asset's radius/height for the bounding box, or defaults to 0.25x0.25x0.25.
5. Sets `BoundingBox` on the entity and initializes physics.

Queries for entities matching the `ProjectileComponent` component type.

### OnAddRefSystem


public static class OnAddRefSystem extends RefSystem<EntityStore>

Validation system that runs after a projectile entity is added. If the `ProjectileComponent`'s `getProjectile()` returns `null` (indicating failed initialization), logs a warning and removes the entity.

Queries for entities matching the `ProjectileComponent` component type.

### TickingSystem


public static class TickingSystem extends EntityTickingSystem<EntityStore> implements DisableProcessingAssert

Per-tick physics and lifecycle system for projectile entities. On each tick:

1. Checks if the projectile's dead timer has expired via `consumeDeadTimer(dt)`. If so, calls `onProjectileDeath()` and removes the entity.
2. Otherwise, ticks the `SimplePhysicsProvider` with the entity's `Velocity`, world, `TransformComponent`, and command buffer.
3. If a physics tick throws an exception, logs the error and removes the entity.

Queries for entities matching the archetype of `ProjectileComponent`, `TransformComponent`, `Velocity`, and `BoundingBox`.

## Related Types

- EntityModule -- registers all three projectile systems during setup
- BlockEntitySystems -- similar system container for block entities
- DespawnSystem -- another entity lifecycle system
- `ProjectileComponent` -- the ECS component these systems operate on
- `BoundingBox` -- bounding box component initialized during setup
- `ModelComponent` -- visual model set when a model asset is available
