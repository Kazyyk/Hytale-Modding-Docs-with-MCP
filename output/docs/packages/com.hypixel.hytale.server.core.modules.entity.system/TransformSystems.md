---
title: "TransformSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.system"
fqcn: "com.hypixel.hytale.server.core.modules.entity.system.TransformSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "transform"
  - "tracker"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

```java
public class TransformSystems
```

Container class for ECS systems that handle entity transform (position and rotation) lifecycle and network synchronization. Contains a tracker update system for sending transform changes to clients and a cleanup system for entity removal.

## Inner Classes

### EntityTrackerUpdate

```java
public static class EntityTrackerUpdate extends EntityTickingSystem<EntityStore>
```

Per-tick system that sends `TransformUpdate` packets to visible players when an entity's position or rotation changes. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group. Supports parallel execution.

Queries for entities matching both `EntityTrackerSystems.Visible` and `TransformComponent`.

On each tick:
1. Reads the current position, body rotation, and head rotation (from `HeadRotation` component, if present; otherwise `Vector3f.ZERO`).
2. Compares against the `sentTransform` stored in the `TransformComponent` using `PositionUtil.equals()`.
3. If position, look orientation, or body orientation has changed:
   - Updates the `sentTransform` fields.
   - Queues a `TransformUpdate` to all viewers in `visibleTo`, excluding the entity itself (to avoid sending self-updates).
4. If nothing changed but `newlyVisibleTo` is non-empty:
   - Queues the current transform to newly visible viewers only, including the entity itself.

### OnRemove

```java
public static class OnRemove extends HolderSystem<EntityStore>
```

Holder system that clears the chunk location reference from `TransformComponent` when an entity is removed from the store. Queries for entities with `TransformComponent`.

- **onEntityAdd**: No-op.
- **onEntityRemoved**: Calls `TransformComponent.setChunkLocation(null, null)` to release the chunk reference.

## Related Types

- [AudioSystems](AudioSystems.md) -- audio tracker update follows a similar pattern
- [ModelSystems](ModelSystems.md) -- animation tracker update follows a similar pattern
- [SnapshotSystems](SnapshotSystems.md) -- captures transform snapshots for lag compensation
- [UpdateLocationSystems](UpdateLocationSystems.md) -- manages chunk assignment based on position
- [EntitySystems](EntitySystems.md) -- contains `UnloadEntityFromChunk` for chunk cleanup
- `TransformComponent` -- ECS component holding position, rotation, and chunk reference
- `HeadRotation` -- optional ECS component for head orientation
- `EntityTrackerSystems.Visible` -- visibility tracking component
- `PositionUtil` -- utility for comparing positions and directions
