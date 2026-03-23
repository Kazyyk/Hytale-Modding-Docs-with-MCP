---
title: "BlockEntitySystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity"
fqcn: "com.hypixel.hytale.server.core.modules.entity.BlockEntitySystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:13:02Z"
tags:
  - "entity"
  - "module"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity`

```java
public class BlockEntitySystems
```

Container class for ECS systems that manage block entities -- entities that represent in-world blocks with additional behavior (physics, network tracking, visual updates). All inner systems operate on `EntityStore` and are registered by [EntityModule](EntityModule.md) during setup.

## Inner Classes

### BlockEntitySetupSystem

```java
public static class BlockEntitySetupSystem extends HolderSystem<EntityStore>
```

Initialization system triggered when a block entity is added to the store. Performs the following setup:

1. Assigns a `NetworkId` if the archetype does not already contain one.
2. Creates a `BoundingBox` from the `BlockEntity` component. Falls back to a 1x1x1 box if creation fails.
3. Initializes physics via `BlockEntity.initPhysics()` with movement-out-of-solid disabled.

Queries for entities matching the `BlockEntity` component type.

### BlockEntityTrackerSystem

```java
public static class BlockEntityTrackerSystem extends EntityTickingSystem<EntityStore>
```

Per-tick system that sends block entity state updates to visible players. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group.

On each tick, checks whether the block ID or entity scale has changed since the last update. If either is outdated, queues a `BlockUpdate` packet to all viewers. For newly visible viewers, always sends the current state.

Supports parallel execution via `EntityTickingSystem.maybeUseParallel()`.

Queries for entities matching both the `Visible` and `BlockEntity` component types.

### Ticking

```java
public static class Ticking extends EntityTickingSystem<EntityStore> implements DisableProcessingAssert
```

Per-tick physics system for block entities. Ticks the `SimplePhysicsProvider` from the block entity's component using the entity's `TransformComponent`, `Velocity`, and world reference.

If the physics tick throws an exception, the entity is logged and removed via `RemoveReason.REMOVE`.

Queries for entities matching the archetype of `TransformComponent`, `BlockEntity`, and `Velocity`.

## Related Types

- [EntityModule](EntityModule.md) -- registers all three systems during setup
- [DespawnSystem](DespawnSystem.md) -- another entity lifecycle system in this package
- [LegacyProjectileSystems](LegacyProjectileSystems.md) -- similar system container for projectile entities
- `BlockEntity` -- the ECS component these systems operate on
- `BoundingBox` -- bounding box component initialized by the setup system
- `EntityTrackerSystems.Visible` -- visibility tracking used by the tracker system
