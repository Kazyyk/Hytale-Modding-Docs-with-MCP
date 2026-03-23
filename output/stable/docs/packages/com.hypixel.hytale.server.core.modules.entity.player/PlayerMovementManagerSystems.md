---
title: "PlayerMovementManagerSystems"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerMovementManagerSystems"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "movement"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerMovementManagerSystems
```

Container class for ECS systems that manage the `MovementManager` component on player entities.

## Inner Types

- [PlayerMovementManagerSystems.AssignmentSystem](PlayerMovementManagerSystems.AssignmentSystem.md) -- ensures players have a MovementManager
- [PlayerMovementManagerSystems.PostAssignmentSystem](PlayerMovementManagerSystems.PostAssignmentSystem.md) -- resets defaults after assignment

## Related Types

- [PlayerSystems](PlayerSystems.md) -- other player systems
