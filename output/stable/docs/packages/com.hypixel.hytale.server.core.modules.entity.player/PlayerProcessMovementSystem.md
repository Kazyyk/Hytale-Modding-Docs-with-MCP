---
title: "PlayerProcessMovementSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerProcessMovementSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "movement"
  - "collision"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerProcessMovementSystem extends EntityTickingSystem<EntityStore>
```

An ECS ticking system that processes player movement and block collision each tick. Validates position offsets, checks for movement jumps (resets velocity in Adventure mode if offset exceeds 10 blocks), runs collision detection against the world, processes velocity sampling, identifies the block the player is standing on and inside, and triggers block collision interaction chains (e.g., damage blocks).

Queries entities with `Player`, `PlayerRef`, `TransformComponent`, `BoundingBox`, `Velocity`, `CollisionResultComponent`, and `PositionDataComponent`. Runs single-threaded.

## Related Types

- [PlayerSystems.ProcessPlayerInput](PlayerSystems.ProcessPlayerInput.md) -- processes input before movement
