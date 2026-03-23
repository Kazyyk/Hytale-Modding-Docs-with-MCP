---
title: "com.hypixel.hytale.server.core.io.handlers.login"
package: "com.hypixel.hytale.server.core.io.handlers.login"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:08:32Z"
---

**Package:** `com.hypixel.hytale.server.core.io.handlers.login`

This package implements the server-side login handshake pipeline, including JWT-based mutual authentication, identity token validation, and optional password verification.

## Classes

| Type | Description |
|---|---|
| [AuthenticationPacketHandler](AuthenticationPacketHandler.md) | Concrete handshake handler enforcing max players and delegating to password handler |
| [HandshakeHandler](HandshakeHandler.md) | Abstract base for JWT-based mutual authentication flow |
| [PasswordPacketHandler](PasswordPacketHandler.md) | Optional password challenge-response verification |
