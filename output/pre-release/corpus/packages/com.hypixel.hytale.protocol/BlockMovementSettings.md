# BlockMovementSettings

Type: class | Package: com.hypixel.hytale.protocol

public class BlockMovementSettings

Comprehensive physics configuration for entity movement on/through a block, including climbing, bouncing, drag, friction, speed multipliers, and jump force.

## Fields

- boolean isClimbable
- float climbUpSpeedMultiplier
- float climbDownSpeedMultiplier
- float climbLateralSpeedMultiplier
- boolean isBouncy
- float bounceVelocity
- float drag
- float friction
- float terminalVelocityModifier
- float horizontalSpeedMultiplier
- float acceleration
- float jumpForceMultiplier

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 42
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 42
- MAX_SIZE | 42

Binary layout: 42 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockMovementSettings deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockMovementSettings` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockMovementSettings` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockMovementSettings` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockType

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static BlockMovementSettings deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BlockMovementSettings clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public boolean isClimbable
public float climbUpSpeedMultiplier
public float climbDownSpeedMultiplier
public float climbLateralSpeedMultiplier
public boolean isBouncy
public float bounceVelocity
public float drag
public float friction
public float terminalVelocityModifier
public float horizontalSpeedMultiplier
public float acceleration
public float jumpForceMultiplier
