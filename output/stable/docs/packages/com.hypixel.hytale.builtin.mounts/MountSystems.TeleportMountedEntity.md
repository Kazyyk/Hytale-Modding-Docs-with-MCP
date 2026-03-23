---
title: "MountSystems.TeleportMountedEntity"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.TeleportMountedEntity"
api_surface: false
extends: "RefChangeSystem<EntityStore, Teleport>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class TeleportMountedEntity extends RefChangeSystem<EntityStore, Teleport>
```

Dismounts an entity when it is teleported. Reacts to `Teleport` component being added to entities with a [MountedComponent](MountedComponent.md), and removes the `MountedComponent`.

## Query

Matches entities with `MountedComponent`.

## Watched Component

`Teleport` -- reacts to addition only; `onComponentSet` and `onComponentRemoved` are no-ops.

## Dependencies

Ordered `BEFORE` both `TeleportSystems.MoveSystem` and `TeleportSystems.PlayerMoveSystem` with `CLOSEST` priority.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MountSystems.MountedEntityDeath](MountSystems.MountedEntityDeath.md) -- similar dismount-on-event pattern
