---
title: "AuthenticationPacketHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.handlers.login"
fqcn: "com.hypixel.hytale.server.core.io.handlers.login.AuthenticationPacketHandler"
api_surface: false
extends: "HandshakeHandler"
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
public class AuthenticationPacketHandler extends HandshakeHandler
```

Extends `HandshakeHandler` to perform authentication during the login flow. Enforces the server's max player limit before proceeding. On successful authentication, transitions the connection to a [PasswordPacketHandler](PasswordPacketHandler.md) for optional password verification.

## Methods

```java
@Nonnull
@Override
public String getIdentifier()
```

Returns a string identifier for this handler including the remote address and auth handler supplier.

```java
@Override
public void registered0(PacketHandler oldHandler)
```

Called when registered. Checks max player count and disconnects if full, otherwise delegates to the parent.

```java
@Override
protected void onAuthenticated(byte[] passwordChallenge)
```

Transitions the channel to a [PasswordPacketHandler](PasswordPacketHandler.md) after successful authentication.

## Inner Types

- **AuthHandlerSupplier** -- Functional interface for creating the next `PacketHandler` after authentication.
