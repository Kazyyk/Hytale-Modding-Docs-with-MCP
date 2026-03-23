---
title: "PlayerAuthentication"
kind: "class"
package: "com.hypixel.hytale.server.core.auth"
fqcn: "com.hypixel.hytale.server.core.auth.PlayerAuthentication"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "auth"
---

**Package:** `com.hypixel.hytale.server.core.auth`

```java
public class PlayerAuthentication
```

Holds the authenticated identity of a connected player, including UUID, username, referral data, and referral source address. Created during the player authentication handshake.

## Constants

```java
public static final int MAX_REFERRAL_DATA_SIZE = 4096
```

## Constructors

```java
public PlayerAuthentication()
```

```java
public PlayerAuthentication(@Nonnull UUID uuid, @Nonnull String username)
```

## Methods

```java
@Nonnull
public String getUsername()
```

Returns the authenticated username. Throws `UnsupportedOperationException` if not yet set.

```java
@Nonnull
public UUID getUuid()
```

Returns the authenticated UUID. Throws `UnsupportedOperationException` if not yet set.

```java
public void setUsername(@Nonnull String username)
```

```java
public void setUuid(@Nonnull UUID uuid)
```

```java
@Nullable
public byte[] getReferralData()
```

```java
public void setReferralData(@Nullable byte[] referralData)
```

Sets referral data. Throws `IllegalArgumentException` if the data exceeds 4096 bytes.

```java
@Nullable
public HostAddress getReferralSource()
```

```java
public void setReferralSource(@Nullable HostAddress referralSource)
```
