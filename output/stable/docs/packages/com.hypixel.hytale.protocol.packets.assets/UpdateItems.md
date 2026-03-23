---
title: "UpdateItems"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.assets"
fqcn: "com.hypixel.hytale.protocol.packets.assets.UpdateItems"
api_surface: false
extends: ~
implements: ["Packet", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T02:59:19Z"
tags:
  - "protocol"
  - "packet"
  - "assets"
  - "server-to-client"
  - "compressed"
---

**Package:** `com.hypixel.hytale.protocol.packets.assets`

```java
public class UpdateItems implements Packet, ToClientPacket
```

Server-to-client packet (ID 54, compressed). Transmits Items asset data to the client on the `Default` channel.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `UpdateType` | `type` | No | Whether this is an init or incremental update. |
| `Map<String, ItemBase>` | `items` | Yes |  |
| `String[]` | `removedItems` | Yes |  |
| `boolean` | `updateModels` | No | Controls whether to refresh Models. |
| `boolean` | `updateIcons` | No | Controls whether to refresh Icons. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 4 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 12 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte(s) + 4 bytes of fixed fields + 2 variable-length field(s) (VarInt length prefixes). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static UpdateItems deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `UpdateItems` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `UpdateItems` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `UpdateItems` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

```java
public static ValidationResult validateStructure(@Nonnull ByteBuf buffer, int offset)
```

Validates the binary structure of a `UpdateItems` at the given offset without deserializing.
