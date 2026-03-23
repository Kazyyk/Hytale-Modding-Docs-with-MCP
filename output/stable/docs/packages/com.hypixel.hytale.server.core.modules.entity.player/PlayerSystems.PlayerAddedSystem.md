---
title: "PlayerSystems.PlayerAddedSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.PlayerAddedSystem"
api_surface: false
extends: "RefSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerSystems.PlayerAddedSystem extends RefSystem<EntityStore>
```

An ECS ref system that performs full player initialization when a player entity joins a world. Sets display name, records spawn time, initializes game mode, sends inventory and active slot packets, sends creative sound set, handles pending death (shows respawn screen), spawns particle effects, and flushes packets. Depends on `PlayerSpawnedSystem`. On removal, closes all open windows.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
