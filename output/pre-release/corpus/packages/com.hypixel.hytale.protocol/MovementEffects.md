# MovementEffects

Type: class | Package: com.hypixel.hytale.protocol

public class MovementEffects

Protocol data structure in the Movement/Physics group.

## Fields

- boolean disableForward
- boolean disableBackward
- boolean disableLeft
- boolean disableRight
- boolean disableSprint
- boolean disableJump
- boolean disableCrouch

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 7
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 7
- MAX_SIZE | 7

Binary layout: 7 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static MovementEffects deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `MovementEffects` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `MovementEffects` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `MovementEffects` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static MovementEffects deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public MovementEffects clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public boolean disableForward
public boolean disableBackward
public boolean disableLeft
public boolean disableRight
public boolean disableSprint
public boolean disableJump
public boolean disableCrouch
