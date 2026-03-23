---
title: "MountSystems.RemoveBlockSeat"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.RemoveBlockSeat"
api_surface: false
extends: "RefSystem<ChunkStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class RemoveBlockSeat extends RefSystem<ChunkStore>
```

A `ChunkStore` system that dismounts all seated entities when a block seat chunk entity is removed. Registered on the chunk store registry by [MountPlugin](MountPlugin.md).

## Query

Matches chunk entities with [BlockMountComponent](BlockMountComponent.md).

## Behavior

- **onEntityAdded:** No-op.
- **onEntityRemove:** Collects all seated entity references from the `BlockMountComponent`, removes each from the seat, and schedules removal of the [MountedComponent](MountedComponent.md) on the world thread for each valid seated entity.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [BlockMountComponent](BlockMountComponent.md) -- the component tracking seated entities
