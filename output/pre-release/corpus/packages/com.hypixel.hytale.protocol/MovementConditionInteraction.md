# MovementConditionInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class MovementConditionInteraction extends SimpleInteraction

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 15).

## Fields

- int forward
- int back
- int left
- int right
- int forwardLeft
- int forwardRight
- int backLeft
- int backRight

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 51
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 71
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 51 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static MovementConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `MovementConditionInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `MovementConditionInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `MovementConditionInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction
- SimpleInteraction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static MovementConditionInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public MovementConditionInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int forward
public int back
public int left
public int right
public int forwardLeft
public int forwardRight
public int backLeft
public int backRight
