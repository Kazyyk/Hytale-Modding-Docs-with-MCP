---
title: "KillFeedEvent.DecedentMessage"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage.event"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.event.KillFeedEvent.DecedentMessage"
api_surface: false
extends: "CancellableEcsEvent"
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
public static final class KillFeedEvent.DecedentMessage extends CancellableEcsEvent
```

A cancellable ECS event dispatched on the dying entity during kill feed generation. Allows systems listening on the victim to set a custom display message or cancel the kill feed entry for the decedent. If cancelled, no kill feed message is sent.

## Constructor

```java
public DecedentMessage(@Nonnull Damage damage)
```

Creates the event with the killing damage.

## Methods

```java
public Damage getDamage()
```

Returns the [Damage](Damage.md) event that caused the kill.

```java
public void setMessage(@Nullable Message message)
```

Sets the victim's display message for the kill feed.

```java
@Nullable
public Message getMessage()
```

Returns the victim's display message, or `null` if not set.

## Related Types

- [KillFeedEvent](KillFeedEvent.md) -- parent class
- [DeathSystems.KillFeed](DeathSystems.KillFeed.md) -- dispatches this event
- [Damage](Damage.md) -- the killing damage
