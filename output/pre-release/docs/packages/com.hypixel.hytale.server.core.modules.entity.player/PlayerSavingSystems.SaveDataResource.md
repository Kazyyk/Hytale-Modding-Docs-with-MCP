---
title: "PlayerSavingSystems.SaveDataResource"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSavingSystems.SaveDataResource"
api_surface: false
extends: ~
implements:
  - "Resource<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "saving"
  - "resource"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerSavingSystems.SaveDataResource implements Resource<EntityStore>
```

An ECS resource that holds the countdown timer for periodic player data saving. The delay resets to 10 seconds after each save cycle.

## Related Types

- [PlayerSavingSystems](PlayerSavingSystems.md) -- parent container class
- [PlayerSavingSystems.TickingSystem](PlayerSavingSystems.TickingSystem.md) -- system that decrements this timer
