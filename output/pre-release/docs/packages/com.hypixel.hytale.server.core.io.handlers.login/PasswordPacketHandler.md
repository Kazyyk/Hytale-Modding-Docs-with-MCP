---
title: "PasswordPacketHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.handlers.login"
fqcn: "com.hypixel.hytale.server.core.io.handlers.login.PasswordPacketHandler"
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
public class PasswordPacketHandler extends GenericConnectionPacketHandler
```

Handles optional password verification during login. If the server has a password configured and a challenge was issued, validates the client's SHA-256 hash response. Allows up to 3 attempts before disconnecting. If no password is required, immediately proceeds to the game setup handler.

## Methods

```java
@Nonnull
@Override
public String getIdentifier()
```

```java
@Override
public void registered0(PacketHandler oldHandler)
```

```java
@Override
public void accept(@Nonnull ToServerPacket packet)
```

```java
public void handle(@Nonnull Disconnect packet)
```

```java
public void handle(@Nonnull PasswordResponse packet)
```

Validates the password hash against the expected value. On mismatch, decrements attempts and issues a new challenge. On match, proceeds to setup.

## Inner Types

- **SetupHandlerSupplier** -- Functional interface for creating the next `PacketHandler` after password verification.
