---
title: "MountSystems.RemoveMountedBy"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.RemoveMountedBy"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class RemoveMountedBy extends RefSystem<EntityStore>
```

Dismounts all passengers when a mount entity is removed from the store. On entity removal, iterates the [MountedByComponent](MountedByComponent.md) passenger list and removes the [MountedComponent](MountedComponent.md) from each valid passenger whose mount target matches the removed entity (or is already invalid).

## Query

Matches entities with `MountedByComponent`.

## Behavior

- **onEntityAdded:** No-op.
- **onEntityRemove:** For each passenger in the `MountedByComponent`, checks if the passenger's `MountedComponent` targets this entity, and if so removes it.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MountSystems.RemoveMounted](MountSystems.RemoveMounted.md) -- handles the reverse case (mounted entity removed)
