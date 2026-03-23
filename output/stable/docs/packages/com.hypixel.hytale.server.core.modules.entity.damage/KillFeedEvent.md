---
title: "KillFeedEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage.event"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.event.KillFeedEvent"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "killfeed"
  - "event"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage.event`

```java
public class KillFeedEvent
```

Container class for the three cancellable ECS events dispatched during kill feed message generation by [DeathSystems.KillFeed](DeathSystems.KillFeed.md). These events allow other systems to customize or cancel the kill feed display.

## Inner Types

- [KillFeedEvent.KillerMessage](KillFeedEvent.KillerMessage.md) -- event dispatched on the killer entity to set the killer's display name
- [KillFeedEvent.DecedentMessage](KillFeedEvent.DecedentMessage.md) -- event dispatched on the dying entity to set the victim's display name
- [KillFeedEvent.Display](KillFeedEvent.Display.md) -- event dispatched for the final kill feed broadcast

## Related Types

- [DeathSystems.KillFeed](DeathSystems.KillFeed.md) -- the system that dispatches these events
- [Damage](Damage.md) -- the damage event carried through the kill feed
