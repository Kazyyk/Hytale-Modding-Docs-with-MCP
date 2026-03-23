---
title: "MountSystems.MountedEntityDeath"
kind: "class"
package: "com.hypixel.hytale.builtin.mounts"
fqcn: "com.hypixel.hytale.builtin.mounts.MountSystems.MountedEntityDeath"
api_surface: false
extends: "RefChangeSystem<EntityStore, DeathComponent>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "mounts"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.mounts`

```java
public static class MountedEntityDeath extends RefChangeSystem<EntityStore, DeathComponent>
```

Dismounts an entity when it dies. Reacts to `DeathComponent` being added to entities that have a [MountedComponent](MountedComponent.md), and removes the `MountedComponent` via the command buffer.

## Query

Matches entities with `MountedComponent`.

## Watched Component

`DeathComponent` -- reacts to addition only; `onComponentSet` and `onComponentRemoved` are no-ops.

## Related Types

- [MountSystems](MountSystems.md) -- enclosing class
- [MountSystems.TeleportMountedEntity](MountSystems.TeleportMountedEntity.md) -- similar dismount-on-event pattern
