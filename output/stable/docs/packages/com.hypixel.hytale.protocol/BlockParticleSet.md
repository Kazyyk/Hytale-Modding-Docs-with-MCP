---
title: "BlockParticleSet"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.BlockParticleSet"
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
public class BlockParticleSet
```

Maps particle event types to particle system references for a block.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes |  |
| [Color](Color.md) | `color` | Yes |  |
| `float` | `scale` | No |  |
| [Vector3f](Vector3f.md) | `positionOffset` | Yes |  |
| [Direction](Direction.md) | `rotationOffset` | Yes |  |
| `Map<`[BlockParticleEvent](BlockParticleEvent.md)`, ``String``>` | `particleSystemIds` | Yes |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 32 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 40 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 32 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static BlockParticleSet deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `BlockParticleSet` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `BlockParticleSet` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `BlockParticleSet` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [BlockParticleEvent](BlockParticleEvent.md)
- [BlockType](BlockType.md)
