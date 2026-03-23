---
title: "ClientPlaceBlock"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.player"
fqcn: "com.hypixel.hytale.protocol.packets.player.ClientPlaceBlock"
api_surface: false
extends: "java.lang.Object"
implements:
  - "Packet"
  - "ToServerPacket"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:46:00Z"
tags:
  - "protocol"
  - "packet"
  - "player"
---

**Package:** `com.hypixel.hytale.protocol.packets.player`

```java
public class ClientPlaceBlock implements Packet, ToServerPacket
```

Sent by the client when the player places a block, containing the target position, rotation, and block type ID.

## Protocol Constants

| Constant | Value |
|---|---|
| `PACKET_ID` | `117` |
| `IS_COMPRESSED` | `false` |

## Methods

```java
@Override
public int getId()
```

Returns the packet ID (`117`).

```java
@Override
public NetworkChannel getChannel()
```

Returns `NetworkChannel.Default`.

```java
@Nonnull
public static ClientPlaceBlock deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ClientPlaceBlock` from the given buffer at the specified offset.

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
public ClientPlaceBlock clone()
```

Creates a deep copy of this packet.

## Related Types

- `Packet` -- base packet interface
- `ToServerPacket` -- directional marker interface
