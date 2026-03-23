---
title: "SetPaused"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.SetPaused"
api_surface: false
extends: null
implements: ["Packet", "ToServerPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "protocol"
  - "packets"
  - "world"
---

**Package:** `com.hypixel.hytale.protocol.packets.world`

```java
public class SetPaused implements Packet, ToServerPacket
```

Packet sent from the client to the server requesting to pause or unpause the game.

## Protocol Constants

| Name | Value |
|---|---|
| `PACKET_ID` | `158` |
| `IS_COMPRESSED` | `false` |
| `NetworkChannel` | `Default` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| public | `boolean` | `paused` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `SetPaused` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `@Override public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Override public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
