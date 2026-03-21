---
title: "BlockFlags"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockFlags"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "block"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class BlockFlags
```

Boolean flags that modify block behavior: whether the block is usable (interactive) and whether it is stackable.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `boolean` | `isUsable` | No |  |
| `boolean` | `isStackable` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 2 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 2 |
| `MAX_SIZE` | 2 |

Binary layout: 2 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockFlags deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockFlags` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockFlags` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockFlags` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockType](BlockType.md)
