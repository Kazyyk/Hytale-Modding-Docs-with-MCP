---
title: "PlayerAuthentication"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.PlayerAuthentication"
api_surface: true
extends: ~
implements: []
generator_version: "1.0.0"
generated_at: "2026-03-20T20:00:00Z"
tags:
  - "auth"
  - "player"
  - "identity"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public class PlayerAuthentication
```

Holds authentication data for a connecting player, including their UUID, username, optional referral data, and referral source address. This object is populated during the authentication handshake before a [Player](Player.md) entity is fully created.

## Fields

| Field | Type | Modifiers | Description |
|---|---|---|---|
| `MAX_REFERRAL_DATA_SIZE` | `int` | `public static final` | Maximum allowed size for referral data in bytes. Value: `4096`. |

## Constructors

```java
public PlayerAuthentication()
```

Default constructor. Fields are unset until populated by the authentication pipeline.

```java
public PlayerAuthentication(@Nonnull UUID uuid, @Nonnull String username)
```

Constructs an authentication object with the given UUID and username.

## Identity Methods

```java
@Nonnull
public String getUsername()
```

Returns the authenticated player's username. Throws `UnsupportedOperationException` if the username has not been set (incomplete authentication).

```java
@Nonnull
public UUID getUuid()
```

Returns the authenticated player's UUID. Throws `UnsupportedOperationException` if the UUID has not been set (incomplete authentication).

```java
public void setUsername(@Nonnull String username)
```

Sets the player's username.

```java
public void setUuid(@Nonnull UUID uuid)
```

Sets the player's UUID.

## Referral Methods

```java
@Nullable
public byte[] getReferralData()
```

Returns the optional referral data byte array, or `null` if none was provided.

```java
public void setReferralData(@Nullable byte[] referralData)
```

Sets the referral data. Throws `IllegalArgumentException` if the data exceeds `MAX_REFERRAL_DATA_SIZE` (4096 bytes). Accepts `null` to clear.

```java
@Nullable
public HostAddress getReferralSource()
```

Returns the referral source address, or `null` if none was provided.

```java
public void setReferralSource(@Nullable HostAddress referralSource)
```

Sets the referral source address. Accepts `null` to clear.

## Related Types

- [Player](Player.md) -- the player entity created after authentication completes
- [PlayerConnectEvent](../events/PlayerConnectEvent.md) -- fired when a player connects (after authentication)
- [PlayerSetupConnectEvent](../events/PlayerSetupConnectEvent.md) -- fired during player connection setup
- `HostAddress` -- protocol-level address representation for the referral source
