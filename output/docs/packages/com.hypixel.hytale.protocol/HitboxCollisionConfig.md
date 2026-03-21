---
title: "HitboxCollisionConfig"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.HitboxCollisionConfig"
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
public class HitboxCollisionConfig
```

Configuration for hitbox-based collision detection behavior.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [CollisionType](CollisionType.md) | `collisionType` | No |  Default: `CollisionType.Hard`. |
| `float` | `softCollisionOffsetRatio` | No |  |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 5 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 5 |
| `MAX_SIZE` | 5 |

Binary layout: 5 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static HitboxCollisionConfig deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `HitboxCollisionConfig` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `HitboxCollisionConfig` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `HitboxCollisionConfig` into the given buffer.

```java
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Hitbox](Hitbox.md)
- [HitboxCollisionUpdate](HitboxCollisionUpdate.md)
