---
title: "BlockMount"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockMount"
api_surface: false
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
public class BlockMount
```

Defines a mountable position on a block (seat or bed) with precise position and orientation.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [BlockMountType](BlockMountType.md) | `type` | No |  Default: `BlockMountType.Seat`. |
| [Vector3f](Vector3f.md) | `position` | Yes |  |
| [Vector3f](Vector3f.md) | `orientation` | Yes |  |
| `int` | `blockTypeId` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 30 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 30 |
| `MAX_SIZE` | 30 |

Binary layout: 1 null-bit byte + 30 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockMount deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockMount` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockMount` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockMount` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockMountType](BlockMountType.md)
- [BlockType](BlockType.md)
