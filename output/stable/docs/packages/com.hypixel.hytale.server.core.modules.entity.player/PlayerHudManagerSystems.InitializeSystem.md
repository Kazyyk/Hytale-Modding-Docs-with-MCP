---
title: "PlayerHudManagerSystems.InitializeSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerHudManagerSystems.InitializeSystem"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "hud"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerHudManagerSystems.InitializeSystem extends RefSystem<EntityStore>
```

An ECS ref system that sends the initial HUD component visibility state to the player's client when the entity is added to the store. Queries entities with both `PlayerRef` and `Player` components. Calls `HudManager.sendVisibleHudComponents()` on the player's packet handler.

## Related Types

- [PlayerHudManagerSystems](PlayerHudManagerSystems.md) -- parent container class
