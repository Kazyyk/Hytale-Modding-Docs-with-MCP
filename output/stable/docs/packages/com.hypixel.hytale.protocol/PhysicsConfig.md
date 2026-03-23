---
title: "PhysicsConfig"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.PhysicsConfig"
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
public class PhysicsConfig
```

Protocol data structure in the Movement/Physics group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| [PhysicsType](PhysicsType.md) | `type` | No | Default: `PhysicsType.Standard`. |
| `double` | `density` | No | |
| `double` | `gravity` | No | |
| `double` | `bounciness` | No | |
| `int` | `bounceCount` | No | |
| `double` | `bounceLimit` | No | |
| `boolean` | `sticksVertically` | No | |
| `boolean` | `computeYaw` | No | |
| `boolean` | `computePitch` | No | |
| [RotationMode](RotationMode.md) | `rotationMode` | No | Default: `RotationMode.None`. |
| `double` | `moveOutOfSolidSpeed` | No | |
| `double` | `terminalVelocityAir` | No | |
| `double` | `densityAir` | No | |
| `double` | `terminalVelocityWater` | No | |
| `double` | `densityWater` | No | |
| `double` | `hitWaterImpulseLoss` | No | |
| `double` | `rotationForce` | No | |
| `float` | `speedRotationFactor` | No | |
| `double` | `swimmingDampingFactor` | No | |
| `boolean` | `allowRolling` | No | |
| `double` | `rollingFrictionFactor` | No | |
| `float` | `rollingSpeed` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 122 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 122 |
| `MAX_SIZE` | 122 |

Binary layout: 122 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static PhysicsConfig deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `PhysicsConfig` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `PhysicsConfig` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `PhysicsConfig` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.

## Related Types

- [PhysicsType](PhysicsType.md)
- [RotationMode](RotationMode.md)
