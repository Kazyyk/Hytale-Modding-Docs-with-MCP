---
title: "ProjectileConfig"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.ProjectileConfig"
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
public class ProjectileConfig
```

Protocol data structure in the Projectile/Combat group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [PhysicsConfig](PhysicsConfig.md) | `physicsConfig` | Yes | |
| [Model](Model.md) | `model` | Yes | |
| `double` | `launchForce` | No | |
| [Vector3f](Vector3f.md) | `spawnOffset` | Yes | |
| [Direction](Direction.md) | `rotationOffset` | Yes | |
| `Map<`[InteractionType](InteractionType.md)`, ``Integer``>` | `interactions` | Yes | |
| `int` | `launchLocalSoundEventIndex` | No | |
| `int` | `projectileSoundEventIndex` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 1 |
| `FIXED_BLOCK_SIZE` | 163 |
| `VARIABLE_FIELD_COUNT` | 2 |
| `VARIABLE_BLOCK_START` | 171 |
| `MAX_SIZE` | 1,677,721,600 |

Binary layout: 1 null-bit byte + 163 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static ProjectileConfig deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `ProjectileConfig` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `ProjectileConfig` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `ProjectileConfig` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [Direction](Direction.md)
- [InteractionType](InteractionType.md)
- [Model](Model.md)
- [PhysicsConfig](PhysicsConfig.md)
- [Vector3f](Vector3f.md)
