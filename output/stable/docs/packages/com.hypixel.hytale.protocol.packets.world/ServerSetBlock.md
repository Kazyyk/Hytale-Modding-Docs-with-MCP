---
title: "ServerSetBlock"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.ServerSetBlock"
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
public class ServerSetBlock implements Packet, ToClientPacket
```

Packet that sets a single block at the given world coordinates. Sent on the Chunks channel.

## Protocol Constants

| Name | Value |
|---|---|
| `PACKET_ID` | `140` |
| `IS_COMPRESSED` | `false` |
| `NetworkChannel` | `Chunks` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| public | `int` | `x` |
| public | `int` | `y` |
| public | `int` | `z` |
| public | `int` | `blockId` |
| public | `short` | `filler` |
| public | `byte` | `rotation` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ServerSetBlock` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `@Override public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Override public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
