---
title: "PlayerMovementManagerSystems.AssignmentSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerMovementManagerSystems.AssignmentSystem"
api_surface: false
extends: "HolderSystem<EntityStore>"
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
public static class PlayerMovementManagerSystems.AssignmentSystem extends HolderSystem<EntityStore>
```

An ECS holder system that ensures every player entity has a `MovementManager` component. Queries entities with `PlayerRef` but without `MovementManager`, and adds the component on entity creation.

## Related Types

- [PlayerMovementManagerSystems](PlayerMovementManagerSystems.md) -- parent container class
- [PlayerMovementManagerSystems.PostAssignmentSystem](PlayerMovementManagerSystems.PostAssignmentSystem.md) -- resets defaults after assignment
