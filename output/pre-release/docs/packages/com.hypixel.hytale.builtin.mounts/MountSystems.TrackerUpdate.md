---
title: "MountSystems.TrackerUpdate"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.TrackerUpdate"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class TrackerUpdate extends EntityTickingSystem<EntityStore>
```

Ticking system that queues `MountedUpdate` network packets for all viewers tracking a mounted entity. Runs in the `EntityTrackerSystems.QUEUE_UPDATE_GROUP` system group.

## Query

Matches entities with both `EntityTrackerSystems.Visible` and [MountedComponent](MountedComponent.md).

## Behavior

Each tick, for each matching entity:
1. If `MountedComponent.consumeNetworkOutdated()` returns `true`, queues updates to all current viewers.
2. Otherwise, if there are newly visible viewers, queues updates only to those new viewers.

For entity mounts, resolves the mount target's `NetworkId` and creates a `MountedUpdate` with the network ID, offset, and controller type. For block mounts, reads the [BlockMountComponent](BlockMountComponent.md) to obtain the seat position, rotation, and block type for the `BlockMount` protocol object.

## Parallelism

```java
@Override
public boolean isParallel(int archetypeChunkSize, int taskCount)
```

Delegates to `EntityTickingSystem.maybeUseParallel()`.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MountSystems.TrackerRemove](MountSystems.TrackerRemove.md) -- handles removal updates
