---
title: "DeathSystems.KillFeed"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathSystems.KillFeed"
api_surface: false
extends: "DeathSystems.OnDeathSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "system"
  - "killfeed"
  - "ui"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public static class DeathSystems.KillFeed extends DeathSystems.OnDeathSystem
```

Broadcasts kill feed messages to all players in the world when an entity dies. Dispatches three cancellable [KillFeedEvent](KillFeedEvent.md) events in sequence:
1. `KillerMessage` on the source entity (if entity source) -- can set/cancel the killer's name display.
2. `DecedentMessage` on the dying entity -- can set/cancel the victim's name display.
3. `Display` on the dying entity -- controls the final broadcast targets and icon.

If not cancelled, sends a `KillFeedMessage` packet to all broadcast target players.

## Related Types

- [DeathSystems](DeathSystems.md) -- parent class
- [KillFeedEvent](KillFeedEvent.md) -- the events dispatched
- [KillFeedEvent.KillerMessage](KillFeedEvent.KillerMessage.md) -- killer name event
- [KillFeedEvent.DecedentMessage](KillFeedEvent.DecedentMessage.md) -- victim name event
- [KillFeedEvent.Display](KillFeedEvent.Display.md) -- final display event
- [Damage](Damage.md) -- reads `DEATH_ICON` meta key
- [DeathSystems.OnDeathSystem](DeathSystems.OnDeathSystem.md) -- base class
