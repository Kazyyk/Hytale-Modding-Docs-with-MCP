---
title: "MovementSettings"
kind: "class"
package: "com.hypixel.hytale.protocol"
fqcn: "com.hypixel.hytale.protocol.MovementSettings"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "protocol"
  - "networking"
  - "movement"
---

**Package:** `com.hypixel.hytale.protocol`

```java
public class MovementSettings
```

Protocol data structure in the Movement/Physics group.

## Fields

| Type | Name | Nullable | Description |
|---|---|---|---|
| `float` | `mass` | No | |
| `float` | `dragCoefficient` | No | |
| `boolean` | `invertedGravity` | No | |
| `float` | `velocityResistance` | No | |
| `float` | `jumpForce` | No | |
| `float` | `swimJumpForce` | No | |
| `float` | `jumpBufferDuration` | No | |
| `float` | `jumpBufferMaxYVelocity` | No | |
| `float` | `acceleration` | No | |
| `float` | `airDragMin` | No | |
| `float` | `airDragMax` | No | |
| `float` | `airDragMinSpeed` | No | |
| `float` | `airDragMaxSpeed` | No | |
| `float` | `airFrictionMin` | No | |
| `float` | `airFrictionMax` | No | |
| `float` | `airFrictionMinSpeed` | No | |
| `float` | `airFrictionMaxSpeed` | No | |
| `float` | `airSpeedMultiplier` | No | |
| `float` | `airControlMinSpeed` | No | |
| `float` | `airControlMaxSpeed` | No | |
| `float` | `airControlMinMultiplier` | No | |
| `float` | `airControlMaxMultiplier` | No | |
| `float` | `comboAirSpeedMultiplier` | No | |
| `float` | `baseSpeed` | No | |
| `float` | `climbSpeed` | No | |
| `float` | `climbSpeedLateral` | No | |
| `float` | `climbUpSprintSpeed` | No | |
| `float` | `climbDownSprintSpeed` | No | |
| `float` | `horizontalFlySpeed` | No | |
| `float` | `verticalFlySpeed` | No | |
| `float` | `maxSpeedMultiplier` | No | |
| `float` | `minSpeedMultiplier` | No | |
| `float` | `wishDirectionGravityX` | No | |
| `float` | `wishDirectionGravityY` | No | |
| `float` | `wishDirectionWeightX` | No | |
| `float` | `wishDirectionWeightY` | No | |
| `boolean` | `canFly` | No | |
| `float` | `collisionExpulsionForce` | No | |
| `float` | `forwardWalkSpeedMultiplier` | No | |
| `float` | `backwardWalkSpeedMultiplier` | No | |
| `float` | `strafeWalkSpeedMultiplier` | No | |
| `float` | `forwardRunSpeedMultiplier` | No | |
| `float` | `backwardRunSpeedMultiplier` | No | |
| `float` | `strafeRunSpeedMultiplier` | No | |
| `float` | `forwardCrouchSpeedMultiplier` | No | |
| `float` | `backwardCrouchSpeedMultiplier` | No | |
| `float` | `strafeCrouchSpeedMultiplier` | No | |
| `float` | `forwardSprintSpeedMultiplier` | No | |
| `float` | `variableJumpFallForce` | No | |
| `float` | `fallEffectDuration` | No | |
| `float` | `fallJumpForce` | No | |
| `float` | `fallMomentumLoss` | No | |
| `float` | `autoJumpObstacleSpeedLoss` | No | |
| `float` | `autoJumpObstacleSprintSpeedLoss` | No | |
| `float` | `autoJumpObstacleEffectDuration` | No | |
| `float` | `autoJumpObstacleSprintEffectDuration` | No | |
| `float` | `autoJumpObstacleMaxAngle` | No | |
| `boolean` | `autoJumpDisableJumping` | No | |
| `float` | `minSlideEntrySpeed` | No | |
| `float` | `slideExitSpeed` | No | |
| `float` | `minFallSpeedToEngageRoll` | No | |
| `float` | `maxFallSpeedToEngageRoll` | No | |
| `float` | `rollStartSpeedModifier` | No | |
| `float` | `rollExitSpeedModifier` | No | |
| `float` | `rollTimeToComplete` | No | |

## Serialization Layout

| Constant | Value |
|---|---|
| `NULLABLE_BIT_FIELD_SIZE` | 0 |
| `FIXED_BLOCK_SIZE` | 251 |
| `VARIABLE_FIELD_COUNT` | 0 |
| `VARIABLE_BLOCK_START` | 251 |
| `MAX_SIZE` | 251 |

Binary layout: 251 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods

```java
@Nonnull
public static MovementSettings deserialize(@Nonnull ByteBuf buf, int offset)
```

Deserializes a `MovementSettings` from the given buffer at the specified offset.

```java
public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)
```

Returns the total number of bytes consumed by this `MovementSettings` starting at the given offset.

```java
public void serialize(@Nonnull ByteBuf buf)
```

Serializes this `MovementSettings` into the given buffer.

```java
@Override
public int computeSize()
```

Returns the serialized size in bytes.
