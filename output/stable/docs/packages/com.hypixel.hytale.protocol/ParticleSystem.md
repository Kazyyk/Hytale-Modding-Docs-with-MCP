---
title: "ParticleSystem"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ParticleSystem"
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
public class ParticleSystem
```

Protocol data structure in the Particle/VFX System group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `String` | `id` | Yes | |
| [ParticleSpawnerGroup](ParticleSpawnerGroup.md)`[]` | `spawners` | Yes | |
| `float` | `lifeSpan` | No | |
| `float` | `cullDistance` | No | |
| `float` | `boundingRadius` | No | |
| `boolean` | `isImportant` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 14 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 22 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 14 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ParticleSystem deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ParticleSystem` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ParticleSystem` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ParticleSystem` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [ParticleSpawnerGroup](ParticleSpawnerGroup.md)
