---
title: "MountSystems.TrackedMounted"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.TrackedMounted"
api_surface: false
extends: "RefChangeSystem<EntityStore, MountedComponent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class TrackedMounted extends RefChangeSystem<EntityStore, MountedComponent>
```

Maintains the bidirectional mount relationship between a mounted entity and its mount target. Reacts to [MountedComponent](MountedComponent.md) lifecycle events.

## Behavior

- **onComponentAdded:** If the mount target entity is valid, ensures a [MountedByComponent](MountedByComponent.md) exists on the target and adds the mounted entity as a passenger.
- **onComponentRemoved:** Delegates to `MountSystems.handleMountedRemoval()` to clean up both sides of the relationship.
- **onComponentSet:** No-op.

## Query

Matches entities with `MountedComponent`.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MountedByComponent](MountedByComponent.md) -- the component maintained on mount targets
