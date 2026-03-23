---
title: "Trail"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Trail"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class Trail
```

Protocol data structure in the Particle/VFX System group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes | |
| `String` | `texture` | Yes | |
| `int` | `lifeSpan` | No | |
| `float` | `roll` | No | |
| [Edge](Edge.md) | `start` | Yes | |
| [Edge](Edge.md) | `end` | Yes | |
| `float` | `lightInfluence` | No | |
| [FXRenderMode](FXRenderMode.md) | `renderMode` | No | Default: `FXRenderMode.BlendLinear`. |
| [IntersectionHighlight](IntersectionHighlight.md) | `intersectionHighlight` | Yes | |
| `boolean` | `smooth` | No | |
| [Vector2i](Vector2i.md) | `frameSize` | Yes | |
| [Range](Range.md) | `frameRange` | Yes | |
| `int` | `frameLifeSpan` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 61 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 69 |
| `MAX_SIZE` | 32,768,079 |

Binary layout: 1 null-bit byte + 61 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Trail deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Trail` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Trail` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Trail` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Edge](Edge.md)
- [FXRenderMode](FXRenderMode.md)
- [IntersectionHighlight](IntersectionHighlight.md)
- [Range](Range.md)
- [Vector2i](Vector2i.md)
