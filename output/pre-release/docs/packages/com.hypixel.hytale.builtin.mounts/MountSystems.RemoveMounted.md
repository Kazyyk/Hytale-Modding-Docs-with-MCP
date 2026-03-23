---
title: "MountSystems.RemoveMounted"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.RemoveMounted"
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
public static class RemoveMounted extends RefSystem<EntityStore>
```

Cleans up mount relationships when a mounted entity is removed from the store. On entity removal, reads the entity's [MountedComponent](MountedComponent.md) and delegates to `MountSystems.handleMountedRemoval()` to remove the passenger from the mount's [MountedByComponent](MountedByComponent.md) or [BlockMountComponent](BlockMountComponent.md).

## Query

Matches entities with `MountedComponent`.

## Behavior

- **onEntityAdded:** No-op.
- **onEntityRemove:** Delegates to `handleMountedRemoval`.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MountSystems.RemoveMountedBy](MountSystems.RemoveMountedBy.md) -- handles the reverse case (mount entity removed)
