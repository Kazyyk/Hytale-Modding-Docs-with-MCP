---
title: "ParticleCollision"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleCollision"
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
public class ParticleCollision
```

Protocol data structure in the Particle/VFX System group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [ParticleCollisionBlockType](ParticleCollisionBlockType.md) | `blockType` | No | Default: `ParticleCollisionBlockType.None`. |
| [ParticleCollisionAction](ParticleCollisionAction.md) | `action` | No | Default: `ParticleCollisionAction.Expire`. |
| [ParticleRotationInfluence](ParticleRotationInfluence.md) | `particleRotationInfluence` | No | Default: `ParticleRotationInfluence.None`. |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 3 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 3 |
| `MAX_SIZE` | 3 |

Binary layout: 3 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ParticleCollision deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ParticleCollision` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ParticleCollision` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ParticleCollision` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ParticleCollisionAction](ParticleCollisionAction.md)
- [ParticleCollisionBlockType](ParticleCollisionBlockType.md)
- [ParticleRotationInfluence](ParticleRotationInfluence.md)
