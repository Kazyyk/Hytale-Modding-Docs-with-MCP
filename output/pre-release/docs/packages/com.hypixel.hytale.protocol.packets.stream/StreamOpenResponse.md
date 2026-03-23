---
title: "StreamOpenResponse"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.stream"
fqcn: "com.hypixel.hytale.protocol.packets.stream.StreamOpenResponse"
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
  - "stream"
---

**Package:** `com.hypixel.hytale.protocol.packets.stream`

```java
public class StreamOpenResponse implements Packet, ToClientPacket
```

Server-to-client packet sent in response to a [StreamOpen](StreamOpen.md) request. Indicates whether the stream was accepted and, if rejected, provides a reason string.

## Protocol Constants

| Constant | Value |
|---|---|
| `PACKET_ID` | `461` |
| `IS_COMPRESSED` | `false` |

## Fields

| Field | Type | Nullable | Description |
|---|---|---|---|
| `type` | [StreamType](StreamType.md) | no | The stream type that was requested |
| `accepted` | `boolean` | no | Whether the stream open request was accepted |
| `rejectionReason` | `String` | yes | Human-readable reason the request was rejected |

## Methods

```java
@Override
public int getId()
```

Returns the packet ID (`461`).

```java
@Override
public NetworkChannel getChannel()
```

Returns `NetworkChannel.Default`.

```java
@Nonnull
public static StreamOpenResponse deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `StreamOpenResponse` from the given buffer at the specified offset.

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
- [StreamType](StreamType.md) -- stream type enum
- [StreamOpen](StreamOpen.md) -- the client request this responds to
