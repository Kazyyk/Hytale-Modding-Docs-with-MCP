---
title: "InitialPacketHandler"
kind: "class"
package: "com.hypixel.hytale.server.core.io.handlers"
fqcn: "com.hypixel.hytale.server.core.io.handlers.InitialPacketHandler"
api_surface: false
extends: "PacketHandler"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "io"
  - "handlers"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.io.handlers`

```java
public class InitialPacketHandler extends PacketHandler
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `int` | `MAX_REFERRAL_DATA_SIZE` |
| `public static` | `AuthenticationPacketHandler.AuthHandlerSupplier` | `EDITOR_PACKET_HANDLER_SUPPLIER` |
| `private` | `boolean` | `receivedConnect` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `String` | `getIdentifier()` |
| `@Override public` | `void` | `registered0(PacketHandler oldHandler)` |
| `@Override public` | `void` | `accept(@Nonnull ToServerPacket packet)` |
| `@Override public` | `void` | `disconnect(@Nonnull String message)` |
| `public` | `void` | `handle(@Nonnull Connect packet)` |
| `private` | `byte[]` | `generatePasswordChallengeIfNeeded(UUID playerUuid)` |
| `public` | `void` | `handle(@Nonnull Disconnect packet)` |
