---
title: "ParticleAnimationFrame"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleAnimationFrame"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "particle"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class ParticleAnimationFrame
```

Protocol data structure in the Particle/VFX System group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Range](Range.md) | `frameIndex` | Yes | |
| [RangeVector2f](RangeVector2f.md) | `scale` | Yes | |
| [RangeVector3f](RangeVector3f.md) | `rotation` | Yes | |
| [Color](Color.md) | `color` | Yes | |
| `float` | `opacity` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 58 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 58 |
| `MAX_SIZE` | 58 |

Binary layout: 1 null-bit byte + 58 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ParticleAnimationFrame deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ParticleAnimationFrame` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ParticleAnimationFrame` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ParticleAnimationFrame` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Color](Color.md)
- [Range](Range.md)
- [RangeVector2f](RangeVector2f.md)
- [RangeVector3f](RangeVector3f.md)
