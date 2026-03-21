---
title: "ParticleSpawnerGroup"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleSpawnerGroup"
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
public class ParticleSpawnerGroup
```

Protocol data structure in the Particle/VFX System group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `spawnerId` | Yes | |
| [Vector3f](Vector3f.md) | `positionOffset` | Yes | |
| [Direction](Direction.md) | `rotationOffset` | Yes | |
| `boolean` | `fixedRotation` | No | |
| `float` | `startDelay` | No | |
| [Rangef](Rangef.md) | `spawnRate` | Yes | |
| [Rangef](Rangef.md) | `waveDelay` | Yes | |
| `int` | `totalSpawners` | No | |
| `int` | `maxConcurrent` | No | |
| [InitialVelocity](InitialVelocity.md) | `initialVelocity` | Yes | |
| [RangeVector3f](RangeVector3f.md) | `emitOffset` | Yes | |
| [Rangef](Rangef.md) | `lifeSpan` | Yes | |
| [ParticleAttractor](ParticleAttractor.md)`[]` | `attractors` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 2 |
| `FIXED_BLOCK_SIZE` | 113 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 121 |
| `MAX_SIZE` | 364,544,131 |

Binary layout: 2 null-bit bytes + 113 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ParticleSpawnerGroup deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ParticleSpawnerGroup` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ParticleSpawnerGroup` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ParticleSpawnerGroup` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Direction](Direction.md)
- [InitialVelocity](InitialVelocity.md)
- [ParticleAttractor](ParticleAttractor.md)
- [RangeVector3f](RangeVector3f.md)
- [Rangef](Rangef.md)
- [Vector3f](Vector3f.md)
