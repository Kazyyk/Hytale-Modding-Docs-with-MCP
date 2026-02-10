---
title: "PlayerSetupDisconnectEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerSetupDisconnectEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - connection
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IEvent<Void>`
> Cancellable: No

Dispatched when a player disconnects during the setup phase, before a player entity has been created. This covers disconnects that occur after authentication but before the connection flow reaches `PlayerConnectEvent`. Because no player entity exists at this point, only lightweight identity fields (username, UUID, auth) are available.

This event is the setup-phase counterpart to `PlayerDisconnectEvent`, which handles disconnects after the player entity is fully created.

Because the key type is `Void`, this event is dispatched globally -- all registered listeners receive it regardless of key.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `username` | `String` | `getUsername()` | No | The disconnecting player's username. |
| `uuid` | `UUID` | `getUuid()` | No | The disconnecting player's UUID. |
| `auth` | `PlayerAuthentication` | `getAuth()` | No | Authentication data for the disconnecting player. |
| `disconnectReason` | `PacketHandler.DisconnectReason` | `getDisconnectReason()` | No | The reason for the disconnect. |

## Fired By

- Dispatched by `SetupPacketHandler` (line 198) via `eventBus.dispatch()` when a player disconnects during the setup phase before entity creation.

## Listening

```java
getEventRegistry().register(PlayerSetupDisconnectEvent.class, event -> {
    String name = event.getUsername();
    UUID id = event.getUuid();
    PacketHandler.DisconnectReason reason = event.getDisconnectReason();
    // Handle early-phase disconnect (no player entity available)
});
```

## Related Events

- [`PlayerSetupConnectEvent`](./PlayerSetupConnectEvent.md) -- the setup-phase connection event. This disconnect event is the inverse of `PlayerSetupConnectEvent`.
- [`PlayerDisconnectEvent`](./PlayerDisconnectEvent.md) -- fired when a fully connected player disconnects (after entity creation). Use this for post-setup disconnects.
