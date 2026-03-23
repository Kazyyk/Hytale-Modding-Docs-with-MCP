---
title: "MountSystems.RemoveMountedHolder"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.RemoveMountedHolder"
api_surface: false
extends: "HolderSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class RemoveMountedHolder extends HolderSystem<EntityStore>
```

Strips the [MountedComponent](MountedComponent.md) from the entity holder during entity removal. This ensures the component is removed at the holder level (pre-archetype), complementing the ref-level cleanup in [RemoveMounted](MountSystems.RemoveMounted.md).

## Query

Matches entities with `MountedComponent`.

## Behavior

- **onEntityAdd:** No-op.
- **onEntityRemoved:** Calls `holder.removeComponent(mountedComponentType)`.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MountSystems.RemoveMounted](MountSystems.RemoveMounted.md) -- ref-level removal cleanup
