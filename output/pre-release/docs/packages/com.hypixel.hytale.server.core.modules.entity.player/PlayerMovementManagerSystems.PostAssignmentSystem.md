---
title: "PlayerMovementManagerSystems.PostAssignmentSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerMovementManagerSystems.PostAssignmentSystem"
api_surface: false
extends: "RefSystem<EntityStore>"
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
public static class PlayerMovementManagerSystems.PostAssignmentSystem extends RefSystem<EntityStore>
```

An ECS ref system that resets the `MovementManager` to its defaults and sends an update after a player entity with both `MovementManager` and `PlayerRef` is added to the store. Calls `MovementManager.resetDefaultsAndUpdate()`.

## Related Types

- [PlayerMovementManagerSystems](PlayerMovementManagerSystems.md) -- parent container class
- [PlayerMovementManagerSystems.AssignmentSystem](PlayerMovementManagerSystems.AssignmentSystem.md) -- ensures the component exists first
