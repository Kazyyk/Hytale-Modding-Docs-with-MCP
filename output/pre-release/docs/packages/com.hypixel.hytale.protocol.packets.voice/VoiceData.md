---
title: "VoiceData"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.voice"
fqcn: "com.hypixel.hytale.protocol.packets.voice.VoiceData"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Packet"
  - "ToServerPacket"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "protocol"
  - "packet"
  - "voice"
---

**Package:** `com.hypixel.hytale.protocol.packets.voice`

```java
public class VoiceData implements Packet, ToServerPacket
```

Client-to-server packet containing the player's encoded voice data. Transmitted on the `Voice` network channel and subsequently relayed to nearby players via [RelayedVoiceData](RelayedVoiceData.md).

## Protocol Constants

| Constant | Value |
|---|---|
| `PACKET_ID` | `450` |
| `IS_COMPRESSED` | `false` |
| `MAX_SIZE` | `523` |

## Fields

| Field | Type | Description |
|---|---|---|
| `sequenceNumber` | `short` | Packet sequence number for ordering |
| `timestamp` | `int` | Timestamp of the voice sample |
| `opusData` | `byte[]` | Opus-encoded audio data (max 512 bytes) |

## Methods

```java
@Override
public int getId()
```

Returns the packet ID (`450`).

```java
@Override
public NetworkChannel getChannel()
```

Returns `NetworkChannel.Voice`.

```java
@Nonnull
public static VoiceData deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `VoiceData` from the given buffer at the specified offset.

```java
@Override
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this packet into the given buffer.

```java
public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
```

Validates buffer structure without full deserialization.

## Related Types

- `Packet` -- base packet interface
- `ToServerPacket` -- directional marker interface
- [RelayedVoiceData](RelayedVoiceData.md) -- server relays this to other clients
- [VoiceConfig](VoiceConfig.md) -- voice configuration from server
