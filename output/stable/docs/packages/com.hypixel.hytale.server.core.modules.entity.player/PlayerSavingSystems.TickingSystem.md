---
title: "PlayerSavingSystems.TickingSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSavingSystems.TickingSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements:
  - "RunWhenPausedSystem<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "saving"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerSavingSystems.TickingSystem extends EntityTickingSystem<EntityStore> implements RunWhenPausedSystem<EntityStore>
```

An ECS ticking system that periodically saves player data every 10 seconds (when saving is enabled for the world). Compares current position, rotation, and inventory state against last saved values. Only saves when a change is detected. Implements `RunWhenPausedSystem` so saves continue during game pause.

Queries entities with `Player`, `TransformComponent`, and `HeadRotation`.

## Related Types

- [PlayerSavingSystems](PlayerSavingSystems.md) -- parent container class
- [PlayerSavingSystems.SaveDataResource](PlayerSavingSystems.SaveDataResource.md) -- timer resource
