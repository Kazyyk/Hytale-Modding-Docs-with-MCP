---
title: "PlayerSystems.PlayerSpawnedSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.PlayerSpawnedSystem"
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
public static class PlayerSystems.PlayerSpawnedSystem extends RefSystem<EntityStore>
```

An ECS ref system that sends the player's initial entity state to themselves when added to the store. Calls the deprecated `sendPlayerSelf()` method which constructs a comprehensive `EntityUpdates` packet including model, skin, equipment, transform, effects, stats, nameplate, and component flags.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
