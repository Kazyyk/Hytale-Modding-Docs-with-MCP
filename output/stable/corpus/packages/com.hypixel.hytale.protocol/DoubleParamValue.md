# DoubleParamValue

Type: class | Package: com.hypixel.hytale.protocol | Extends: ParamValue

public class DoubleParamValue extends ParamValue

A typed parameter value (type ID 2) carrying a double-precision float.

## Fields

- double value

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 8

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static DoubleParamValue deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `DoubleParamValue` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `DoubleParamValue` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `DoubleParamValue` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BoolParamValue
- IntParamValue

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static DoubleParamValue deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public DoubleParamValue clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public double value
