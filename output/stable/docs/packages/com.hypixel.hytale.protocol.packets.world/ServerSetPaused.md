---
title: "ServerSetPaused"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.ServerSetPaused"
api_surface: false
extends: null
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packets"
  - "world"
---

**Package:** `com.hypixel.hytale.protocol.packets.world`

```java
public class ServerSetPaused implements Packet, ToClientPacket
```

Packet sent to clients to indicate the server has paused or unpaused the game.

## Protocol Constants

| Name | Value |
|---|---|
| `PACKET_ID` | `159` |
| `IS_COMPRESSED` | `false` |
| `NetworkChannel` | `Default` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| public | `boolean` | `paused` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ServerSetPaused` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `@Override public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Override public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
