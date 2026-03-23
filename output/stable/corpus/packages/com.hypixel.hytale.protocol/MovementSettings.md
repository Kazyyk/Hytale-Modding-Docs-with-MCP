# MovementSettings

Type: class | Package: com.hypixel.hytale.protocol

public class MovementSettings

Protocol data structure in the Movement/Physics group.

## Fields

- float mass
- float dragCoefficient
- boolean invertedGravity
- float velocityResistance
- float jumpForce
- float swimJumpForce
- float jumpBufferDuration
- float jumpBufferMaxYVelocity
- float acceleration
- float airDragMin
- float airDragMax
- float airDragMinSpeed
- float airDragMaxSpeed
- float airFrictionMin
- float airFrictionMax
- float airFrictionMinSpeed
- float airFrictionMaxSpeed
- float airSpeedMultiplier
- float airControlMinSpeed
- float airControlMaxSpeed
- float airControlMinMultiplier
- float airControlMaxMultiplier
- float comboAirSpeedMultiplier
- float baseSpeed
- float climbSpeed
- float climbSpeedLateral
- float climbUpSprintSpeed
- float climbDownSprintSpeed
- float horizontalFlySpeed
- float verticalFlySpeed
- float maxSpeedMultiplier
- float minSpeedMultiplier
- float wishDirectionGravityX
- float wishDirectionGravityY
- float wishDirectionWeightX
- float wishDirectionWeightY
- boolean canFly
- float collisionExpulsionForce
- float forwardWalkSpeedMultiplier
- float backwardWalkSpeedMultiplier
- float strafeWalkSpeedMultiplier
- float forwardRunSpeedMultiplier
- float backwardRunSpeedMultiplier
- float strafeRunSpeedMultiplier
- float forwardCrouchSpeedMultiplier
- float backwardCrouchSpeedMultiplier
- float strafeCrouchSpeedMultiplier
- float forwardSprintSpeedMultiplier
- float variableJumpFallForce
- float fallEffectDuration
- float fallJumpForce
- float fallMomentumLoss
- float autoJumpObstacleSpeedLoss
- float autoJumpObstacleSprintSpeedLoss
- float autoJumpObstacleEffectDuration
- float autoJumpObstacleSprintEffectDuration
- float autoJumpObstacleMaxAngle
- boolean autoJumpDisableJumping
- float minSlideEntrySpeed
- float slideExitSpeed
- float minFallSpeedToEngageRoll
- float maxFallSpeedToEngageRoll
- float rollStartSpeedModifier
- float rollExitSpeedModifier
- float rollTimeToComplete

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 251
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 251
- MAX_SIZE | 251

Binary layout: 251 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static MovementSettings deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `MovementSettings` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `MovementSettings` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `MovementSettings` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
