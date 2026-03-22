---
title: "BlockMatcher"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockMatcher"
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
public class BlockMatcher
```

Composite block matching configuration combining ID matchers with block face requirements.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [BlockIdMatcher](BlockIdMatcher.md) | `block` | Yes |  |
| [BlockFace](BlockFace.md) | `face` | No |  Default: `BlockFace.None`. |
| `boolean` | `staticFace` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 3 |
| `VARIABLE_FIELD_COUNT` | 1 |
| `VARIABLE_BLOCK_START` | 3 |
| `MAX_SIZE` | 32,768,026 |

Binary layout: 1 null-bit byte + 3 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockMatcher deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockMatcher` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockMatcher` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockMatcher` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockIdMatcher](BlockIdMatcher.md)
- [BlockFace](BlockFace.md)
- [BlockConditionInteraction](BlockConditionInteraction.md)
