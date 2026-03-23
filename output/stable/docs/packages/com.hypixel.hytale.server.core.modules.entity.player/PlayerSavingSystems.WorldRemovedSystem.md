---
title: "PlayerSavingSystems.WorldRemovedSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSavingSystems.WorldRemovedSystem"
api_surface: false
extends: "StoreSystem<EntityStore>"
implements: []
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
public static class PlayerSavingSystems.WorldRemovedSystem extends StoreSystem<EntityStore>
```

An ECS store system that runs when the system is removed from the store (i.e., when the world is shutting down). Saves all player data if saving is enabled, and disconnects all players with the message "Stopping world!". Iterates over all entities matching `Player` and `PlayerRef` in parallel.

## Related Types

- [PlayerSavingSystems](PlayerSavingSystems.md) -- parent container class
