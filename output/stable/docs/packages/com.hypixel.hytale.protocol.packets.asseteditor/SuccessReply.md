---
title: "SuccessReply"
kind: "class"
package: "com.hypixel.hytale.protocol.packets.asseteditor"
fqcn: "com.hypixel.hytale.protocol.packets.asseteditor.SuccessReply"
api_surface: false
extends: ~
implements: ["Packet", "ToServerPacket", "ToClientPacket"]
generator_version: "2.0.0"
generated_at: "2026-03-21T02:40:50Z"
tags:
  - "protocol"
  - "asset-editor"
  - "packet"
  - "bidirectional"
---

**Package:** `com.hypixel.hytale.protocol.packets.asseteditor`

```java
public class SuccessReply implements Packet, ToServerPacket, ToClientPacket
```

Bidirectional packet (ID 301). Server reply indicating that an asset editor operation succeeded.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `FormattedMessage` | `message` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 5 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 5 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static SuccessReply deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `SuccessReply` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `SuccessReply` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `SuccessReply` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.
