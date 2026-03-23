---
title: "PlayerSystems.UpdatePlayerRef"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.UpdatePlayerRef"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
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
public static class PlayerSystems.UpdatePlayerRef extends EntityTickingSystem<EntityStore>
```

An ECS ticking system that updates the `PlayerRef` position and rotation from the entity's `TransformComponent` and `HeadRotation` each tick. Queries entities with `PlayerRef`, `TransformComponent`, and `HeadRotation`.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
