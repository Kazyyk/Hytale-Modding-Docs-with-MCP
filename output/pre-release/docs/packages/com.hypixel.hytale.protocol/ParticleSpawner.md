---
title: "ParticleSpawner"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleSpawner"
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
public class ParticleSpawner
```

Protocol data structure in the Particle/VFX System group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes | |
| [Particle](Particle.md) | `particle` | Yes | |
| [EmitShape](EmitShape.md) | `shape` | No | Default: `EmitShape.Sphere`. |
| [RangeVector3f](RangeVector3f.md) | `emitOffset` | Yes | |
| `float` | `cameraOffset` | No | |
| `boolean` | `useEmitDirection` | No | |
| `float` | `lifeSpan` | No | |
| [Rangef](Rangef.md) | `spawnRate` | Yes | |
| `boolean` | `spawnBurst` | No | |
| [Rangef](Rangef.md) | `waveDelay` | Yes | |
| [Range](Range.md) | `totalParticles` | Yes | |
| `int` | `maxConcurrentParticles` | No | |
| [InitialVelocity](InitialVelocity.md) | `initialVelocity` | Yes | |
| `float` | `velocityStretchMultiplier` | No | |
| [ParticleRotationInfluence](ParticleRotationInfluence.md) | `particleRotationInfluence` | No | Default: `ParticleRotationInfluence.None`. |
| `boolean` | `particleRotateWithSpawner` | No | |
| `boolean` | `isLowRes` | No | |
| `float` | `trailSpawnerPositionMultiplier` | No | |
| `float` | `trailSpawnerRotationMultiplier` | No | |
| [ParticleCollision](ParticleCollision.md) | `particleCollision` | Yes | |
| [FXRenderMode](FXRenderMode.md) | `renderMode` | No | Default: `FXRenderMode.BlendLinear`. |
| `float` | `lightInfluence` | No | |
| `boolean` | `linearFiltering` | No | |
| [Rangef](Rangef.md) | `particleLifeSpan` | Yes | |
| [UVMotion](UVMotion.md) | `uvMotion` | Yes | |
| [ParticleAttractor](ParticleAttractor.md)`[]` | `attractors` | Yes | |
| [IntersectionHighlight](IntersectionHighlight.md) | `intersectionHighlight` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 2 |
| `FIXED_BLOCK_SIZE` | 131 |
| `VARIABLE_FIELD_COUNT` | 4 |
| `VARIABLE_BLOCK_START` | 147 |
| `MAX_SIZE` | 651,264,332 |

Binary layout: 2 null-bit bytes + 131 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ParticleSpawner deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ParticleSpawner` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ParticleSpawner` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ParticleSpawner` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [EmitShape](EmitShape.md)
- [FXRenderMode](FXRenderMode.md)
- [InitialVelocity](InitialVelocity.md)
- [IntersectionHighlight](IntersectionHighlight.md)
- [Particle](Particle.md)
- [ParticleAttractor](ParticleAttractor.md)
- [ParticleCollision](ParticleCollision.md)
- [ParticleRotationInfluence](ParticleRotationInfluence.md)
- [Range](Range.md)
- [RangeVector3f](RangeVector3f.md)
- [Rangef](Rangef.md)
- [UVMotion](UVMotion.md)
