---
title: "SpawnBlockParticleSystem"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.SpawnBlockParticleSystem"
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
public class SpawnBlockParticleSystem implements Packet, ToClientPacket
```

Packet that spawns a block-related particle system at a position.

## Protocol Constants

| Name | Value |
|---|---|
| `PACKET_ID` | `153` |
| `IS_COMPRESSED` | `false` |
| `NetworkChannel` | `Default` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| public | `int` | `blockId` |
| @Nonnull public | `BlockParticleEvent` | `particleType` |
| @Nullable public | `Position` | `position` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `SpawnBlockParticleSystem` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `@Override public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Override public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
