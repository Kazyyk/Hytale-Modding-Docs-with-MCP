---
title: "PlayerDisconnectEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerDisconnectEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - player
  - connection
  - lifecycle
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Extends: `PlayerRefEvent<Void>`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched when a fully connected player disconnects from the server. The `disconnectReason` field indicates why the player disconnected, derived from the player's `PacketHandler`.

This event fires only for players who completed the full connection flow (i.e., a `PlayerConnectEvent` was previously dispatched for them). For players who disconnect during the setup phase before entity creation, see [`PlayerSetupDisconnectEvent`](./PlayerSetupDisconnectEvent.md).

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `playerRef` | `PlayerRef` | `getPlayerRef()` | No | No |
| `disconnectReason` | `PacketHandler.DisconnectReason` | `getDisconnectReason()` | No | No |

- **playerRef** -- Reference to the disconnecting player. Inherited from `PlayerRefEvent`.
- **disconnectReason** -- The reason for the disconnect.

## Fired By

- `Universe` (line 767) via `eventBus dispatch` -- EventBus dispatch when a connected player disconnects from the server.

## Listening

```java
getEventRegistry().register(PlayerDisconnectEvent.class, event -> {
    PlayerRef playerRef = event.getPlayerRef();
    PacketHandler.DisconnectReason reason = event.getDisconnectReason();
    // Handle player disconnect
});
```

## Related Events

- [`PlayerConnectEvent`](./PlayerConnectEvent.md) -- The counterpart event fired when the player initially connects.
- [`PlayerSetupDisconnectEvent`](./PlayerSetupDisconnectEvent.md) -- Fired when a player disconnects during the setup phase, before entity creation.
- [`DrainPlayerFromWorldEvent`](./DrainPlayerFromWorldEvent.md) -- Fired when the player leaves a world. May fire before this event during the disconnect sequence.
