---
title: "DrainPlayerFromWorldEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.DrainPlayerFromWorldEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - player
  - world
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IEvent<String>`
> Cancellable: No

Standard event dispatched when a player leaves a world. This fires during world transfers and as part of the disconnect sequence. The `world` and `transform` fields are mutable, allowing listeners to override the destination world and the player's position/rotation when they arrive.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `holder` | `Holder<EntityStore>` | `getHolder()` | No | No |
| `world` | `World` | `getWorld()` | Yes | No |
| `transform` | `Transform` | `getTransform()` | Yes | Yes |

- **holder** -- The entity holder for the player leaving the world.
- **world** -- The world context. Mutable via `setWorld(@Nonnull World)` -- can be overridden to control destination.
- **transform** -- The player's position and rotation. May be `null`. Mutable via `setTransform(@Nullable Transform)` -- can be overridden to control where the player appears next.

## Fired By

- `World.drainPlayer()` (line 941) via `eventBus dispatchFor` -- EventBus keyed dispatch when a player leaves a world.

## Listening

```java
// Listen globally for all world departures
getEventRegistry().registerGlobal(DrainPlayerFromWorldEvent.class, event -> {
    World world = event.getWorld();
    Transform transform = event.getTransform();
    // Handle player leaving a world
});
```

## Related Events

- [`AddPlayerToWorldEvent`](./AddPlayerToWorldEvent.md) -- The counterpart event fired when a player enters a world.
- [`PlayerDisconnectEvent`](./PlayerDisconnectEvent.md) -- This event may fire before `PlayerDisconnectEvent` during the disconnect sequence.
