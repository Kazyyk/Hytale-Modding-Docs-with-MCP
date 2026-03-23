---
title: "HandshakeHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.handlers.login"
fqcn: "com.hypixel.hytale.server.core.io.handlers.login.HandshakeHandler"
api_surface: false
extends: "GenericConnectionPacketHandler"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
tags:
  - "login"
  - "auth"
  - "networking"
---

**Package:** `com.hypixel.hytale.server.core.io.handlers.login`

```java
public abstract class HandshakeHandler extends GenericConnectionPacketHandler
```

Abstract handler for the login handshake flow. Validates the client's identity token (JWT) against the session service, performs mutual authentication via authorization grants and server token exchange, and optionally generates a password challenge. Manages the multi-stage authentication state machine: `REQUESTING_AUTH_GRANT` -> `AWAITING_AUTH_TOKEN` -> `PROCESSING_AUTH_TOKEN` -> `EXCHANGING_SERVER_TOKEN` -> `AUTHENTICATED`.

## Methods

```java
@Override
public void accept(@Nonnull ToServerPacket packet)
```

Dispatches incoming packets to `Disconnect` or `AuthToken` handlers.

```java
@Override
public void registered0(PacketHandler oldHandler)
```

Validates the identity token, checks UUID match and required scope, then begins the auth grant request.

```java
public void handle(@Nonnull Disconnect packet)
```

Handles client disconnect during handshake.

```java
public void handle(@Nonnull AuthToken packet)
```

Validates the client's access token JWT, verifies UUID and username match, then initiates server auth grant exchange.

```java
protected abstract void onAuthenticated(byte[] var1)
```

Called when authentication completes. Subclasses define the next step (e.g., password or game handler).
