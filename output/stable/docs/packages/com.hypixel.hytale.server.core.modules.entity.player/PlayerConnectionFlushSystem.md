---
title: "PlayerConnectionFlushSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerConnectionFlushSystem"
api_surface: false
extends: "EntityTickingSystem<EntityStore>"
implements:
  - "RunWhenPausedSystem<EntityStore>"
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "network"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerConnectionFlushSystem extends EntityTickingSystem<EntityStore> implements RunWhenPausedSystem<EntityStore>
```

An ECS ticking system that flushes outbound network packets for each player connection. Runs as the last system in the tick (after `SEND_PACKET_GROUP` and `PlayerPingSystem`). Only executes if `Constants.FORCE_NETWORK_FLUSH` is enabled. Implements `RunWhenPausedSystem` so it runs even when the game is paused.

## Related Types

- [PlayerPingSystem](PlayerPingSystem.md) -- runs before this system in the flush chain
