---
title: "BlockGathering"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockGathering"
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
public class BlockGathering
```

Groups the different ways a block can be gathered: standard breaking, harvesting, and soft-block collection.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [BlockBreaking](BlockBreaking.md) | `breaking` | Yes |  |
| [Harvesting](Harvesting.md) | `harvest` | Yes |  |
| [SoftBlock](SoftBlock.md) | `soft` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 1 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 13 |
| `MAX_SIZE` | 114,688,092 |

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockGathering deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockGathering` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockGathering` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockGathering` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockBreaking](BlockBreaking.md)
- [Harvesting](Harvesting.md)
- [BlockType](BlockType.md)
