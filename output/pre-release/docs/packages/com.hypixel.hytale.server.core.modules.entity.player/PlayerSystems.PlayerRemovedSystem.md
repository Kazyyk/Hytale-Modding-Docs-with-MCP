---
title: "PlayerSystems.PlayerRemovedSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.PlayerRemovedSystem"
api_surface: false
extends: "HolderSystem<EntityStore>"
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
public static class PlayerSystems.PlayerRemovedSystem extends HolderSystem<EntityStore>
```

An ECS holder system that handles player entity removal from a world. Logs the removal, saves the player's last position and head rotation to their per-world data, disables packet queuing, flushes remaining packets, and broadcasts a "player left world" message to other players.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
