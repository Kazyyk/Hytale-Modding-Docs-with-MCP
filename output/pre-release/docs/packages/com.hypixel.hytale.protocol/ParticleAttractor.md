---
title: "ParticleAttractor"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleAttractor"
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
public class ParticleAttractor
```

Protocol data structure in the Particle/VFX System group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [Vector3f](Vector3f.md) | `position` | Yes | |
| [Vector3f](Vector3f.md) | `radialAxis` | Yes | |
| `float` | `trailPositionMultiplier` | No | |
| `float` | `radius` | No | |
| `float` | `radialAcceleration` | No | |
| `float` | `radialTangentAcceleration` | No | |
| [Vector3f](Vector3f.md) | `linearAcceleration` | Yes | |
| `float` | `radialImpulse` | No | |
| `float` | `radialTangentImpulse` | No | |
| [Vector3f](Vector3f.md) | `linearImpulse` | Yes | |
| [Vector3f](Vector3f.md) | `dampingMultiplier` | Yes | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 85 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 85 |
| `MAX_SIZE` | 85 |

Binary layout: 1 null-bit byte + 85 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ParticleAttractor deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ParticleAttractor` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ParticleAttractor` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ParticleAttractor` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Vector3f](Vector3f.md)
