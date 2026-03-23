---
title: "ServerSetBlocks"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.ServerSetBlocks"
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
public class ServerSetBlocks implements Packet, ToClientPacket
```

Packet that sets multiple blocks relative to an origin position. Each entry is a `SetBlockCmd` with index, block ID, filler, and rotation.

## Protocol Constants

| Name | Value |
|---|---|
| `PACKET_ID` | `141` |
| `IS_COMPRESSED` | `false` |
| `NetworkChannel` | `Chunks` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| public | `int` | `x` |
| public | `int` | `y` |
| public | `int` | `z` |
| @Nonnull public | `SetBlockCmd[]` | `cmds` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `ServerSetBlocks` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `@Override public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Override public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
