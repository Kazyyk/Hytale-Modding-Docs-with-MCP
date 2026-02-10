---
title: "DrainPlayerFromWorldEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.DrainPlayerFromWorldEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - world
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IEvent<String>`
> Cancellable: No

Dispatched when a player leaves a world. This event fires during world transfers and as part of the disconnect sequence. The `world` and `transform` fields are mutable, allowing listeners to override the destination world and the player's position/rotation when they arrive.

Because the key type is `String`, this event supports keyed dispatch. Listeners can register for a specific key or use `registerGlobal()` to receive all dispatches.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `holder` | `Holder<EntityStore>` | `getHolder()` | No | The entity holder for the player leaving the world. |
| `world` | `World` | `getWorld()` | Yes | The world context. Mutable -- can be overridden to control destination. |
| `transform` | `Transform` | `getTransform()` | Yes | The player's position and rotation. Mutable -- can be overridden to control where the player appears next. |

## Fired By

- Dispatched by `World.drainPlayer()` (line 941) via `eventBus.dispatchFor()` using keyed dispatch when a player leaves a world.

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

- [`AddPlayerToWorldEvent`](./AddPlayerToWorldEvent.md) -- the counterpart event fired when a player enters a world. This event and `AddPlayerToWorldEvent` are inverses.
- [`PlayerDisconnectEvent`](./PlayerDisconnectEvent.md) -- this event may fire before `PlayerDisconnectEvent` during the disconnect sequence.
