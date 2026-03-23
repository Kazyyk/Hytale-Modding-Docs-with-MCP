---
title: "BlockTextures"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockTextures"
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
public class BlockTextures
```

Per-face texture references for a cube-rendered block. Each face (top, bottom, front, back, left, right) can have an independent texture.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `top` | Yes |  |
| `String` | `bottom` | Yes |  |
| `String` | `front` | Yes |  |
| `String` | `back` | Yes |  |
| `String` | `left` | Yes |  |
| `String` | `right` | Yes |  |
| `float` | `weight` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 5 |
| `VARIABLE_FIELD_COUNT` | 6 |
| `VARIABLE_BLOCK_START` | 29 |
| `MAX_SIZE` | 98,304,059 |

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockTextures deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockTextures` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockTextures` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockTextures` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockType](BlockType.md)
- [Fluid](Fluid.md)
