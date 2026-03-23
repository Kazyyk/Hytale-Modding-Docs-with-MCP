---
title: "PlayerSystems.ProcessPlayerInput"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.ProcessPlayerInput"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "system"
  - "input"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerSystems.ProcessPlayerInput extends EntityTickingSystem<EntityStore>
```

An ECS ticking system that drains the [PlayerInput](PlayerInput.md) queue and applies each input update to the entity. Queries entities with `Player`, `PlayerInput`, and `TransformComponent`.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
