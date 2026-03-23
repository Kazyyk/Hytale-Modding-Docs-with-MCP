---
title: "Particle"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.Particle"
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
public class Particle
```

Protocol data structure in the Particle/VFX System group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `texturePath` | Yes | |
| [Size](Size.md) | `frameSize` | Yes | |
| [ParticleUVOption](ParticleUVOption.md) | `uvOption` | No | Default: `ParticleUVOption.None`. |
| [ParticleScaleRatioConstraint](ParticleScaleRatioConstraint.md) | `scaleRatioConstraint` | No | Default: `ParticleScaleRatioConstraint.OneToOne`. |
| [SoftParticle](SoftParticle.md) | `softParticles` | No | Default: `SoftParticle.Enable`. |
| `float` | `softParticlesFadeFactor` | No | |
| `boolean` | `useSpriteBlending` | No | |
| [ParticleAnimationFrame](ParticleAnimationFrame.md) | `initialAnimationFrame` | Yes | |
| [ParticleAnimationFrame](ParticleAnimationFrame.md) | `collisionAnimationFrame` | Yes | |
| `Map<``Integer``, `[ParticleAnimationFrame](ParticleAnimationFrame.md)`>` | `animationFrames` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 133 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 141 |
| `MAX_SIZE` | 270,336,151 |

Binary layout: 1 null-bit byte + 133 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static Particle deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `Particle` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `Particle` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `Particle` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ParticleAnimationFrame](ParticleAnimationFrame.md)
- [ParticleScaleRatioConstraint](ParticleScaleRatioConstraint.md)
- [ParticleUVOption](ParticleUVOption.md)
- [Size](Size.md)
- [SoftParticle](SoftParticle.md)
