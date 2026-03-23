---
title: "ReticleEvent"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.player"
fqcn: "com.hypixel.hytale.protocol.packets.player.ReticleEvent"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Packet"
  - "ToClientPacket"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "protocol"
  - "packet"
  - "player"
---

**Package:** `com.hypixel.hytale.protocol.packets.player`

```java
public class ReticleEvent implements Packet, ToClientPacket
```

Sent to the client to trigger a reticle animation or event by index.

## Protocol Constants

| Constant | Value |
|---|---|
| `PACKET_ID` | `113` |
| `IS_COMPRESSED` | `false` |

## Methods

```java
@Override
public int getId()
```

Returns the packet ID (`113`).

```java
@Override
public NetworkChannel getChannel()
```

Returns `NetworkChannel.Default`.

```java
@Nonnull
public static ReticleEvent deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ReticleEvent` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the number of bytes consumed by this packet in the buffer.

```java
@Override
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this packet into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

```java
public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
```

Validates buffer structure without full deserialization.

```java
public ReticleEvent clone()
```

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
