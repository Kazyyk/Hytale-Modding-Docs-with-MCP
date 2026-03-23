---
title: "PlayerSystems.BlockPausedMovementSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.BlockPausedMovementSystem"
api_surface: false
extends: "~"
implements: 
  - "RunWhenPausedSystem<EntityStore>"
  - "QuerySystem<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "system"
  - "movement"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerSystems.BlockPausedMovementSystem implements RunWhenPausedSystem<EntityStore>, QuerySystem<EntityStore>
```

An ECS system that blocks player movement input while the game is paused. When a paused player sends movement that differs from their current position or head rotation by more than 0.01, teleports them back to their current position. Clears the input queue each tick.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
