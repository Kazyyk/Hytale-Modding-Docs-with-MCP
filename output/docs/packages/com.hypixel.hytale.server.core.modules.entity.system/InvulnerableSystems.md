---
title: "InvulnerableSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.system"
fqcn: "com.hypixel.hytale.server.core.modules.entity.system.InvulnerableSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "ecs"
  - "entity"
  - "invulnerable"
  - "tracker"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.system`

```java
public class InvulnerableSystems
```

Container class for ECS systems that synchronize the `Invulnerable` component state with the network entity tracker. Follows the identical add/remove/update tracker pattern used by [EntityInteractableSystems](EntityInteractableSystems.md), [IntangibleSystems](IntangibleSystems.md), and [RespondToHitSystems](RespondToHitSystems.md).

## Inner Classes

### EntityTrackerAddAndRemove

```java
public static class EntityTrackerAddAndRemove extends RefChangeSystem<EntityStore, Invulnerable>
```

Reactive system that listens for changes to the `Invulnerable` component on visible entities.

- **onComponentAdded**: Adds the entity reference to the `QueueResource` set for deferred update.
- **onComponentSet**: No-op.
- **onComponentRemoved**: Queues a `ComponentUpdateType.Invulnerable` removal to all current viewers.

Queries for entities matching both `EntityTrackerSystems.Visible` and `Invulnerable` component types.

### EntityTrackerUpdate

```java
public static class EntityTrackerUpdate extends EntityTickingSystem<EntityStore>
```

Per-tick system that sends `InvulnerableUpdate` packets to players. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group. Supports parallel execution.

On each tick:
1. If the entity reference is in the `QueueResource` queue, queues an `InvulnerableUpdate` to all viewers and removes the ref from the queue.
2. Otherwise, if `newlyVisibleTo` is non-empty, queues the update to newly visible viewers only.

After all per-entity ticks, clears the `QueueResource` queue.

### QueueResource

```java
public static class QueueResource implements Resource<EntityStore>
```

Store-scoped resource holding a concurrent set of entity references that need invulnerable updates queued. The resource type is obtained from `EntityModule.get().getInvulnerableQueueResourceType()`.

## Related Types

- [EntityInteractableSystems](EntityInteractableSystems.md) -- identical pattern for `Interactable` component
- [IntangibleSystems](IntangibleSystems.md) -- identical pattern for `Intangible` component
- [RespondToHitSystems](RespondToHitSystems.md) -- identical pattern for `RespondToHit` component
- `Invulnerable` -- the marker ECS component being tracked
- `EntityTrackerSystems.Visible` -- visibility tracking component
- `EntityModule` -- registers these systems and provides the resource type
