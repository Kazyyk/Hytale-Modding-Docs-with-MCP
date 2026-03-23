---
title: "PlayerSystems.NameplateRefChangeSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.NameplateRefChangeSystem"
api_surface: false
extends: "RefChangeSystem<EntityStore, DisplayNameComponent>"
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
public static class PlayerSystems.NameplateRefChangeSystem extends RefChangeSystem<EntityStore, DisplayNameComponent>
```

An ECS component-change system that updates the `Nameplate` component text whenever the `DisplayNameComponent` is added, changed, or removed on a `Player` entity.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
