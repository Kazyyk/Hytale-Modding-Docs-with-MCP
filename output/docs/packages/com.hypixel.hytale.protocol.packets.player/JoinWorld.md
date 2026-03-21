---
title: "JoinWorld"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.player"
fqcn: "com.hypixel.hytale.protocol.packets.player.JoinWorld"
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
public class JoinWorld implements Packet, ToClientPacket
```

Sent to the client when the player joins a world, carrying the world UUID and transition flags.

## Protocol Constants

| Constant | Value |
|---|---|
| `PACKET_ID` | `104` |
| `IS_COMPRESSED` | `false` |

## Methods

```java
@Override
public int getId()
```

Returns the packet ID (`104`).

```java
@Override
public NetworkChannel getChannel()
```

Returns `NetworkChannel.Default`.

```java
@Nonnull
public static JoinWorld deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `JoinWorld` from the given buffer at the specified offset.

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
public JoinWorld clone()
```

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToClientPacket` -- directional marker interface
