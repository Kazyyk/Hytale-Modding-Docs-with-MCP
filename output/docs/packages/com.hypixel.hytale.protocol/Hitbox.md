---
title: "Hitbox"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Hitbox"
api_surface: true
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
public class Hitbox
```

Axis-aligned bounding box defined by min/max corners in 3D space.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `minX` | No |  |
| `float` | `minY` | No |  |
| `float` | `minZ` | No |  |
| `float` | `maxX` | No |  |
| `float` | `maxY` | No |  |
| `float` | `maxZ` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 24 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 24 |
| `MAX_SIZE` | 24 |

Binary layout: 24 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Hitbox deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Hitbox` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Hitbox` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Hitbox` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [DetailBox](DetailBox.md)
- [BlockType](BlockType.md)
- [HitboxCollisionConfig](HitboxCollisionConfig.md)
