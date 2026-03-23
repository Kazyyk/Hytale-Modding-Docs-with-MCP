---
title: "BlockBreaking"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockBreaking"
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
public class BlockBreaking
```

Defines how a block can be broken, including the gather type, health, drop quantity/quality, and specific item/drop list drops.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `gatherType` | Yes |  |
| `float` | `health` | No |  |
| `int` | `quantity` | No |  Default: `1`. |
| `int` | `quality` | No |  |
| `String` | `itemId` | Yes |  |
| `String` | `dropListId` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 13 |
| `VARIABLE_FIELD_COUNT` | 3 |
| `VARIABLE_BLOCK_START` | 25 |
| `MAX_SIZE` | 49,152,040 |

Binary layout: 1 null-bit byte + 13 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockBreaking deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockBreaking` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockBreaking` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockBreaking` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockGathering](BlockGathering.md)
- [Harvesting](Harvesting.md)
