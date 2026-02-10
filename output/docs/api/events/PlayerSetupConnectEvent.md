---
title: "PlayerSetupConnectEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerSetupConnectEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - player
  - connection
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IEvent<Void>`, `ICancellable`
> Cancellable: Yes

Dispatched during early connection setup, after authentication completes but before a player entity is created. This is the earliest point at which a plugin can inspect or reject an incoming player connection. Cancelling this event disconnects the player with the configurable reason message.

This event also supports server-to-server referrals. A connection may have arrived via referral from another server (check `isReferralConnection()`), and listeners can redirect the connecting player to a different server using `referToServer()`.

Because the key type is `Void`, this event is dispatched globally -- all registered listeners receive it regardless of key.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Notes |
|-------|------|----------|---------|-------|
| `packetHandler` | `PacketHandler` | `getPacketHandler()` | No | The packet handler for this connection. |
| `username` | `String` | `getUsername()` | No | The connecting player's username. |
| `uuid` | `UUID` | `getUuid()` | No | The connecting player's UUID. |
| `auth` | `PlayerAuthentication` | `getAuth()` | No | Authentication data for the connecting player. |
| `referralData` | `byte[]` | `getReferralData()` | No | Referral payload from the originating server. Nullable -- `null` if this is not a referral connection. |
| `referralSource` | `HostAddress` | `getReferralSource()` | No | Network address of the server that referred this player. Nullable -- `null` if this is not a referral connection. |
| `reason` | `String` | `getReason()` | Yes | Disconnect reason shown to the player if the event is cancelled. Default: `"You have been disconnected from the server!"` |
| `clientReferral` | `ClientReferral` | `getClientReferral()` | No | Client-side referral information. Nullable. |

## Methods

### `referToServer(String host, int port)`

Redirects the connecting player to another server. The current connection will be terminated and the client will attempt to connect to the specified host and port. The referral data payload is limited to a maximum of 4096 bytes.

### `isReferralConnection()`

Returns `true` if this connection was referred from another server (i.e., `referralData` and `referralSource` are non-null).

## Cancellation

Cancelling this event prevents the player from connecting. The player is disconnected and shown the message from the `reason` field. Set a custom reason before cancelling to provide a meaningful disconnect message:

```java
getEventRegistry().register(PlayerSetupConnectEvent.class, event -> {
    if (isBanned(event.getUuid())) {
        event.setReason("You are banned from this server.");
        event.setCancelled(true);
    }
});
```

## Fired By

- Dispatched by `SetupPacketHandler` (line 123) via `eventBus.dispatchFor()` after authentication completes. Fires during early connection setup before a player entity exists.

## Listening

```java
getEventRegistry().register(PlayerSetupConnectEvent.class, event -> {
    String name = event.getUsername();
    UUID id = event.getUuid();
    // Inspect or reject the incoming connection
});
```

## Related Events

- [`PlayerSetupDisconnectEvent`](./PlayerSetupDisconnectEvent.md) -- fired when a player disconnects during the setup phase (before entity creation). The setup-phase counterpart to this event.
- [`PlayerConnectEvent`](./PlayerConnectEvent.md) -- fired after this event, once the player entity has been created and connected. Next step in the connection flow.

### Connection Flow

```
PlayerSetupConnectEvent --> PlayerConnectEvent --> AddPlayerToWorldEvent --> PlayerReadyEvent
```
