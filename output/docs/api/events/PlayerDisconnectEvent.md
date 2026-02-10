---
title: "PlayerDisconnectEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerDisconnectEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - connection
  - lifecycle
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Extends: `PlayerRefEvent<Void>`
> Implements: `IEvent<Void>`
> Cancellable: No

Dispatched when a fully connected player disconnects from the server. This event extends `PlayerRefEvent`, which provides the `playerRef` field via inheritance. The `disconnectReason` field indicates why the player disconnected.

This event fires only for players who completed the full connection flow (i.e., a `PlayerConnectEvent` was previously dispatched for them). For players who disconnect during the setup phase before entity creation, see `PlayerSetupDisconnectEvent`.

Because the key type is `Void`, this event is dispatched globally -- all registered listeners receive it regardless of key.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `playerRef` | `PlayerRef` | `getPlayerRef()` | No | Reference to the disconnecting player. Inherited from `PlayerRefEvent`. |
| `disconnectReason` | `PacketHandler.DisconnectReason` | `getDisconnectReason()` | No | The reason for the disconnect. |

## Fired By

- Dispatched by `Universe` (line 767) via `eventBus.dispatch()` when a connected player disconnects from the server.

## Listening

```java
getEventRegistry().register(PlayerDisconnectEvent.class, event -> {
    PlayerRef playerRef = event.getPlayerRef();
    PacketHandler.DisconnectReason reason = event.getDisconnectReason();
    // Handle player disconnect
});
```

## Related Events

- [`PlayerConnectEvent`](./PlayerConnectEvent.md) -- the counterpart event fired when the player initially connects. This event is the inverse of `PlayerConnectEvent`.
- [`PlayerSetupDisconnectEvent`](./PlayerSetupDisconnectEvent.md) -- fired when a player disconnects during the setup phase, before entity creation. Use this for early-disconnect handling.
- [`DrainPlayerFromWorldEvent`](./DrainPlayerFromWorldEvent.md) -- fired when the player leaves a world. May fire before this event during the disconnect sequence.
