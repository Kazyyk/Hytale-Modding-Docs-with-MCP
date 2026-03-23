---
title: "ItemToolSpec"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ItemToolSpec"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "item"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ItemToolSpec
```

Defines a single tool specialization with its gather type capability.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `gatherType` | Yes |  |
| `float` | `power` | No |  |
| `int` | `quality` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 9 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 9 |
| `MAX_SIZE` | 16,384,014 |

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ItemToolSpec deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ItemToolSpec` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ItemToolSpec` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ItemToolSpec` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ItemTool](ItemTool.md)
