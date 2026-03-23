---
title: "KillFeedEvent.Display"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage.event"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.event.KillFeedEvent.Display"
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
public static final class KillFeedEvent.Display extends CancellableEcsEvent
```

A cancellable ECS event dispatched on the dying entity as the final step of kill feed generation. Controls which players receive the kill feed message and what icon is displayed. If cancelled, no packets are sent.

## Constructor

```java
public Display(@Nonnull Damage damage, @Nullable String icon, @Nonnull List<PlayerRef> broadcastTargets)
```

Creates the display event with the killing damage, an optional death icon, and the list of players to broadcast to.

## Methods

```java
@Nonnull
public List<PlayerRef> getBroadcastTargets()
```

Returns the mutable list of players who will receive the kill feed message.

```java
@Nonnull
public Damage getDamage()
```

Returns the [Damage](Damage.md) event that caused the kill.

```java
@Nullable
public String getIcon()
```

Returns the kill feed icon identifier, or `null`.

```java
public void setIcon(@Nullable String icon)
```

Sets the kill feed icon identifier.

## Related Types

- [KillFeedEvent](KillFeedEvent.md) -- parent class
- [DeathSystems.KillFeed](DeathSystems.KillFeed.md) -- dispatches this event
- [Damage](Damage.md) -- reads `DEATH_ICON` meta key for the default icon
