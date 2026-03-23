---
title: "PlayerSystems.NameplateRefSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.NameplateRefSystem"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "system"
  - "nameplate"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerSystems.NameplateRefSystem extends RefSystem<EntityStore>
```

An ECS ref system that creates a `Nameplate` component from the `DisplayNameComponent` when a player entity with both `Player` and `DisplayNameComponent` is added, if no nameplate already exists.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
