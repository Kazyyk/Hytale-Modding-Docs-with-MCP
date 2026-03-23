---
title: "SetFluids"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.SetFluids"
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
public class SetFluids implements Packet, ToClientPacket
```

Packet delivering compressed fluid data for a chunk section. Compressed on the wire.

## Protocol Constants

| Name | Value |
|---|---|
| `PACKET_ID` | `136` |
| `IS_COMPRESSED` | `true` |
| `NetworkChannel` | `Chunks` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| public | `int` | `x` |
| public | `int` | `y` |
| public | `int` | `z` |
| @Nullable public | `byte[]` | `data` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `SetFluids` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `@Override public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Override public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
