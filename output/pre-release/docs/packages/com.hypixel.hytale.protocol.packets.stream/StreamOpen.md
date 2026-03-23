---
title: "StreamOpen"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.stream"
fqcn: "com.hypixel.hytale.protocol.packets.stream.StreamOpen"
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
  - "stream"
---

**Package:** `com.hypixel.hytale.protocol.packets.stream`

```java
public class StreamOpen implements Packet, ToServerPacket
```

Client-to-server packet requesting the server to open a stream of a given type. The client specifies the desired [StreamType](StreamType.md) (e.g., `Game` or `Voice`).

## Protocol Constants

| Constant | Value |
|---|---|
| `PACKET_ID` | `460` |
| `IS_COMPRESSED` | `false` |
| `MAX_SIZE` | `1` |

## Fields

| Field | Type | Default | Description |
|---|---|---|---|
| `type` | [StreamType](StreamType.md) | `StreamType.Game` | The type of stream to open |

## Methods

```java
@Override
public int getId()
```

Returns the packet ID (`460`).

```java
@Override
public NetworkChannel getChannel()
```

Returns `NetworkChannel.Default`.

```java
@Nonnull
public static StreamOpen deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `StreamOpen` from the given buffer at the specified offset.

```java
@Override
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this packet into the given buffer.

```java
@Override
public int computeSize()
```

Returns `1`.

```java
public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
```

Validates buffer structure without full deserialization.

## Related Types

- `Packet` -- base packet interface
- `ToServerPacket` -- directional marker interface
- [StreamType](StreamType.md) -- stream type enum
- [StreamOpenResponse](StreamOpenResponse.md) -- server response to this request
