---
title: "PlayerSetupDisconnectEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerSetupDisconnectEvent"
api_surface: "public"
cancellable: false
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - player
  - connection
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IEvent<Void>`
> Cancellable: No

Standard event dispatched when a player disconnects during the setup phase, before a player entity has been created. Because no player entity exists at this point, only lightweight identity fields (username, UUID, auth) are available.

This event is the setup-phase counterpart to [`PlayerDisconnectEvent`](./PlayerDisconnectEvent.md), which handles disconnects after the player entity is fully created.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `username` | `String` | `getUsername()` | No | No |
| `uuid` | `UUID` | `getUuid()` | No | No |
| `auth` | `PlayerAuthentication` | `getAuth()` | No | No |
| `disconnectReason` | `PacketHandler.DisconnectReason` | `getDisconnectReason()` | No | No |

- **username** -- The disconnecting player's username.
- **uuid** -- The disconnecting player's UUID.
- **auth** -- Authentication data for the disconnecting player.
- **disconnectReason** -- The reason for the disconnect.

## Fired By

- `SetupPacketHandler` (line 198) via `eventBus dispatch` -- EventBus dispatch when a setup-phase player disconnects.

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

- [`PlayerSetupConnectEvent`](./PlayerSetupConnectEvent.md) -- The setup-phase connection event. This is the inverse.
- [`PlayerDisconnectEvent`](./PlayerDisconnectEvent.md) -- Fired when a fully connected player disconnects (after entity creation).
