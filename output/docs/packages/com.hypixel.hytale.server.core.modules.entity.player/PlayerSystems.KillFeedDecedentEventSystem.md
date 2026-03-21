---
title: "PlayerSystems.KillFeedDecedentEventSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.KillFeedDecedentEventSystem"
api_surface: false
extends: "EntityEventSystem<EntityStore, KillFeedEvent.DecedentMessage>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "player"
  - "entity"
  - "system"
  - "killfeed"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.player`

```java
public static class PlayerSystems.KillFeedDecedentEventSystem extends EntityEventSystem<EntityStore, KillFeedEvent.DecedentMessage>
```

An ECS event system that handles `KillFeedEvent.DecedentMessage` events for player entities. Provides the player's display name (from `DisplayNameComponent` or falling back to `PlayerRef.getUsername()`) as the victim name in kill feed messages.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
