---
title: "PlayerSetupConnectEvent"
kind: "event"
package: "com.hypixel.hytale.server.core.event.events.player"
fqcn: "com.hypixel.hytale.server.core.event.events.player.PlayerSetupConnectEvent"
api_surface: "public"
cancellable: true
generator_version: "1.0.0"
generated_at: "2026-02-18T17:30:00Z"
tags:
  - player
  - connection
  - cancellable
---

> Package: `com.hypixel.hytale.server.core.event.events.player`
> Implements: `IEvent<Void>`, `ICancellable`
> Cancellable: Yes

Standard event dispatched during early connection setup, after authentication completes but before a player entity is created. This is the earliest point at which a plugin can inspect or reject an incoming connection. Cancelling this event disconnects the player with the configurable reason message.

This event also supports server-to-server referrals via `referToServer()`.

## Fields / Accessors

| Field | Type | Accessor | Mutable | Nullable |
|-------|------|----------|---------|----------|
| `packetHandler` | `PacketHandler` | `getPacketHandler()` | No | No |
| `username` | `String` | `getUsername()` | No | No |
| `uuid` | `UUID` | `getUuid()` | No | No |
| `auth` | `PlayerAuthentication` | `getAuth()` | No | No |
| `referralData` | `byte[]` | `getReferralData()` | No | Yes |
| `referralSource` | `HostAddress` | `getReferralSource()` | No | Yes |
| `reason` | `String` | `getReason()` | Yes | No |
| `clientReferral` | `ClientReferral` | `getClientReferral()` | No | Yes |

- **packetHandler** -- The packet handler for this connection.
- **username** -- The connecting player's username.
- **uuid** -- The connecting player's UUID.
- **auth** -- Authentication data for the connecting player.
- **referralData** -- Referral payload from the originating server. `null` if not a referral connection.
- **referralSource** -- Network address of the server that referred this player. `null` if not a referral connection.
- **reason** -- Disconnect reason shown to the player if the event is cancelled. Default: `"You have been disconnected from the server!"`. Mutable via `setReason(String)`.
- **clientReferral** -- Client-side referral information. `null` until `referToServer()` is called.

## Methods

### `referToServer(String host, int port)`

Redirects the connecting player to another server. Maximum 4096 bytes referral data.

### `referToServer(String host, int port, byte[] data)`

Redirects with custom referral data payload.

### `isReferralConnection()`

Returns `true` if this connection was referred from another server.

## Fired By

- `SetupPacketHandler` (line 123) via `eventBus dispatchFor` -- EventBus dispatch during early connection (before player entity exists).

## Listening

```java
getEventRegistry().register(PlayerSetupConnectEvent.class, event -> {
    if (isBanned(event.getUuid())) {
        event.setReason("You are banned from this server.");
        event.setCancelled(true);
    }
});
```

## Related Events

- [`PlayerSetupDisconnectEvent`](./PlayerSetupDisconnectEvent.md) -- Fired when a player disconnects during the setup phase.
- [`PlayerConnectEvent`](./PlayerConnectEvent.md) -- Fired after this event, once the player entity has been created.

### Connection Flow

```
PlayerSetupConnectEvent --> PlayerConnectEvent --> AddPlayerToWorldEvent --> PlayerReadyEvent
```
