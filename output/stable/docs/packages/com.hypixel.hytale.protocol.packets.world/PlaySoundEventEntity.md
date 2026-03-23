---
title: "PlaySoundEventEntity"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.world"
fqcn: "com.hypixel.hytale.protocol.packets.world.PlaySoundEventEntity"
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
public class PlaySoundEventEntity implements Packet, ToClientPacket
```

Packet that triggers a sound event attached to a specific entity, tracking its position.

## Protocol Constants

| Name | Value |
|---|---|
| `PACKET_ID` | `156` |
| `IS_COMPRESSED` | `false` |
| `NetworkChannel` | `Default` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| public | `int` | `soundEventIndex` |
| public | `int` | `networkId` |
| public | `float` | `volumeModifier` |
| public | `float` | `pitchModifier` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public static` | `PlaySoundEventEntity` | `deserialize(@Nonnull ByteBuf buf, int offset)` |
| `public static` | `int` | `computeBytesConsumed(@Nonnull ByteBuf buf, int offset)` |
| `@Override public` | `void` | `serialize(@Nonnull ByteBuf buf)` |
| `@Override public` | `int` | `computeSize()` |
| `public static` | `ValidationResult` | `validateStructure(@Nonnull ByteBuf buffer, int offset)` |
