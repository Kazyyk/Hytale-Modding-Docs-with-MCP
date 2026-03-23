---
title: "PlayerPingSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerPingSystem"
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
  - "ping"
  - "system"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public class PlayerPingSystem extends EntityTickingSystem<EntityStore> implements RunWhenPausedSystem<EntityStore>
```

An ECS ticking system that sends periodic ping packets to each connected player to measure round-trip latency. Runs as a last-priority system in the `SEND_PACKET_GROUP`. Implements `RunWhenPausedSystem` so ping continues during game pause. Calls `PacketHandler.tickPing(dt)` for each entity with a `PlayerRef`.

## Related Types

- [PlayerConnectionFlushSystem](PlayerConnectionFlushSystem.md) -- flushes packets after ping
