---
title: "PlayerSavingSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSavingSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "saving"
  - "persistence"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerSavingSystems
```

Container class for ECS systems that handle periodic and on-removal player data saving.

## Constants

| Constant | Type | Value | Description |
|---|---|---|---|
| `PLAYER_SAVE_INTERVAL_SECONDS` | `float` | `10.0F` | Interval between periodic saves. |

## Inner Types

- [PlayerSavingSystems.SaveDataResource](PlayerSavingSystems.SaveDataResource.md) -- resource tracking save timer
- [PlayerSavingSystems.TickingSystem](PlayerSavingSystems.TickingSystem.md) -- periodic save system
- [PlayerSavingSystems.WorldRemovedSystem](PlayerSavingSystems.WorldRemovedSystem.md) -- saves and disconnects on world removal
