---
title: "MountSystems.TrackerRemove"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.TrackerRemove"
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
public static class TrackerRemove extends RefChangeSystem<EntityStore, MountedComponent>
```

Reacts to [MountedComponent](MountedComponent.md) removal on visible entities. When the component is removed:
1. If the mount was a block mount, stops the movement animation via `AnimationUtils.stopAnimation`.
2. Queues a `ComponentUpdateType.Mounted` remove update to all viewers tracking the entity.

## Query

Matches entities with `EntityTrackerSystems.Visible`.

## Watched Component

`MountedComponent` -- reacts to removal only; `onComponentAdded` and `onComponentSet` are no-ops.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MountSystems.TrackerUpdate](MountSystems.TrackerUpdate.md) -- handles update packets
