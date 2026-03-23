---
title: "RelayedVoiceData"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.voice"
fqcn: "com.hypixel.hytale.protocol.packets.voice.RelayedVoiceData"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Packet"
  - "ToClientPacket"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "protocol"
  - "packet"
  - "voice"
---

**Package:** `com.hypixel.hytale.protocol.packets.voice`

```java
public class RelayedVoiceData implements Packet, ToClientPacket
```

Server-to-client packet that relays voice data from one player to nearby listeners. Contains the speaker identity, position, sequence metadata, and Opus-encoded audio data. Transmitted on the `Voice` network channel.

## Protocol Constants

| Constant | Value |
|---|---|
| `PACKET_ID` | `451` |
| `IS_COMPRESSED` | `false` |
| `MAX_SIZE` | `569` |

## Fields

| Field | Type | Description |
|---|---|---|
| `speakerId` | `java.util.UUID` | UUID of the speaking player |
| `entityId` | `int` | Entity ID of the speaker |
| `sequenceNumber` | `short` | Packet sequence number for ordering |
| `timestamp` | `int` | Timestamp of the voice sample |
| `speakerPosition` | `Position` | Nullable 3D position of the speaker for spatial audio |
| `speakerIsUnderwater` | `boolean` | Whether the speaker is underwater (affects audio filtering) |
| `opusData` | `byte[]` | Opus-encoded audio data (max 512 bytes) |

## Methods

```java
@Override
public int getId()
```

Returns the packet ID (`451`).

```java
@Override
public NetworkChannel getChannel()
```

Returns `NetworkChannel.Voice`.

```java
@Nonnull
public static RelayedVoiceData deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `RelayedVoiceData` from the given buffer at the specified offset.

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
- `ToClientPacket` -- directional marker interface
- [VoiceData](VoiceData.md) -- client-to-server voice data packet
- [VoiceConfig](VoiceConfig.md) -- voice configuration packet
