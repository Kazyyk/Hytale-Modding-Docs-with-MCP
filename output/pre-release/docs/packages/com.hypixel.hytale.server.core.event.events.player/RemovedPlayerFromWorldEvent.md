---
title: "RemovedPlayerFromWorldEvent"
kind: "class"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.RemovedPlayerFromWorldEvent"
api_surface: true
extends: "java.lang.Object"
implements:
  - "IEvent"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "event"
  - "player"
  - "world"
---

**Package:** `com.hypixel.hytale.server.core.event.events.player`

```java
public class RemovedPlayerFromWorldEvent implements IEvent<String>
```

Fired after a player entity has been removed from a world. Provides access to the entity holder, the world it was removed from, and the leave message. Listeners can suppress the broadcast leave message or replace it.

## Constructors

```java
public RemovedPlayerFromWorldEvent(@Nonnull Holder<EntityStore> holder, @Nonnull World world, @Nullable Message leaveMessage)
```

## Methods

```java
@Nonnull
public Holder<EntityStore> getHolder()
```

Returns the entity holder for the removed player.

```java
@Nonnull
public World getWorld()
```

Returns the world the player was removed from.

```java
public boolean shouldBroadcastLeaveMessage()
```

Returns whether the leave message should be broadcast to other players.

```java
public void setBroadcastLeaveMessage(boolean broadcastLeaveMessage)
```

Sets whether to broadcast the leave message.

```java
@Nullable
public Message getLeaveMessage()
```

Returns the leave message, or `null` if none.

```java
public void setLeaveMessage(@Nullable Message leaveMessage)
```

Replaces the leave message.

## Related Types

- `AddPlayerToWorldEvent` -- the counterpart event for player addition
- `World` -- the world the player was removed from
- `EntityStore` -- store type parameter
