---
title: "MountSystems.EnsureMinecartComponents"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.EnsureMinecartComponents"
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
public static class EnsureMinecartComponents extends HolderSystem<EntityStore>
```

Ensures that minecart entities have the required supporting components when added to the store. On entity add, ensures `Interactable` and `PrefabCopyableComponent` exist, and adds a `NetworkId` with a fresh network ID from the entity store.

## Query

Matches entities with [MinecartComponent](MinecartComponent.md).

## Dependencies

Root dependency (runs first).

## Behavior

- **onEntityAdd:** Ensures `Interactable`, adds `NetworkId`, ensures `PrefabCopyableComponent`.
- **onEntityRemoved:** No-op.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MinecartComponent](MinecartComponent.md) -- the query component
- [MountSystems.OnMinecartHit](MountSystems.OnMinecartHit.md) -- handles minecart damage
