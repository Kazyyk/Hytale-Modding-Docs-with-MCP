---
title: "VoiceConfig"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.voice"
fqcn: "com.hypixel.hytale.protocol.packets.voice.VoiceConfig"
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
public class VoiceConfig implements Packet, ToClientPacket
```

Server-to-client packet that configures the client's voice chat parameters, including codec, sample rate, spatial audio distances, and rate limits.

## Protocol Constants

| Constant | Value |
|---|---|
| `PACKET_ID` | `452` |
| `IS_COMPRESSED` | `false` |
| `MAX_SIZE` | `17` |

## Fields

| Field | Type | Description |
|---|---|---|
| `voiceEnabled` | `boolean` | Whether voice chat is enabled on this server |
| `codec` | [VoiceCodec](VoiceCodec.md) | Audio codec to use (default `Opus`) |
| `sampleRate` | `int` | Audio sample rate in Hz |
| `channels` | `byte` | Number of audio channels |
| `maxHearingDistance` | `float` | Maximum distance at which voice can be heard |
| `referenceDistance` | `float` | Distance at which audio is at full volume |
| `supportsVoiceStream` | `boolean` | Whether the server supports voice streaming |
| `maxPacketsPerSecond` | `byte` | Rate limit for voice packets |

## Methods

```java
@Override
public int getId()
```

Returns the packet ID (`452`).

```java
@Override
public NetworkChannel getChannel()
```

Returns `NetworkChannel.Default`.

```java
@Nonnull
public static VoiceConfig deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `VoiceConfig` from the given buffer at the specified offset.

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
- [VoiceCodec](VoiceCodec.md) -- codec enum
- [VoiceData](VoiceData.md) -- client voice data packet
- [RelayedVoiceData](RelayedVoiceData.md) -- relayed voice data packet
