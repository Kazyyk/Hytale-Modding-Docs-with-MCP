---
title: "PlayerSystems.KillFeedKillerEventSystem"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.player"
fqcn: "com.hypixel.hytale.server.core.modules.entity.player.PlayerSystems.KillFeedKillerEventSystem"
api_surface: false
extends: "EntityEventSystem<EntityStore, KillFeedEvent.KillerMessage>"
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
public static class PlayerSystems.KillFeedKillerEventSystem extends EntityEventSystem<EntityStore, KillFeedEvent.KillerMessage>
```

An ECS event system that handles `KillFeedEvent.KillerMessage` events for player entities. Provides the player's display name as the killer name in kill feed messages.

## Related Types

- [PlayerSystems](PlayerSystems.md) -- parent container class
