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

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static MovementSettings deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public MovementSettings clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float mass
public float dragCoefficient
public boolean invertedGravity
public float velocityResistance
public float jumpForce
public float swimJumpForce
public float jumpBufferDuration
public float jumpBufferMaxYVelocity
public float acceleration
public float airDragMin
public float airDragMax
public float airDragMinSpeed
public float airDragMaxSpeed
public float airFrictionMin
public float airFrictionMax
public float airFrictionMinSpeed
public float airFrictionMaxSpeed
public float airSpeedMultiplier
public float airControlMinSpeed
public float airControlMaxSpeed
public float airControlMinMultiplier
public float airControlMaxMultiplier
public float comboAirSpeedMultiplier
public float baseSpeed
public float climbSpeed
public float climbSpeedLateral
public float climbUpSprintSpeed
public float climbDownSprintSpeed
public float horizontalFlySpeed
public float verticalFlySpeed
public float maxSpeedMultiplier
public float minSpeedMultiplier
public float wishDirectionGravityX
public float wishDirectionGravityY
public float wishDirectionWeightX
public float wishDirectionWeightY
public boolean canFly
public float collisionExpulsionForce
public float forwardWalkSpeedMultiplier
public float backwardWalkSpeedMultiplier
public float strafeWalkSpeedMultiplier
public float forwardRunSpeedMultiplier
public float backwardRunSpeedMultiplier
public float strafeRunSpeedMultiplier
public float forwardCrouchSpeedMultiplier
public float backwardCrouchSpeedMultiplier
public float strafeCrouchSpeedMultiplier
public float forwardSprintSpeedMultiplier
public float variableJumpFallForce
public float fallEffectDuration
public float fallJumpForce
public float fallMomentumLoss
public float autoJumpObstacleSpeedLoss
public float autoJumpObstacleSprintSpeedLoss
public float autoJumpObstacleEffectDuration
public float autoJumpObstacleSprintEffectDuration
public float autoJumpObstacleMaxAngle
public boolean autoJumpDisableJumping
public float minSlideEntrySpeed
public float slideExitSpeed
public float minFallSpeedToEngageRoll
public float maxFallSpeedToEngageRoll
public float rollStartSpeedModifier
public float rollExitSpeedModifier
public float rollTimeToComplete
