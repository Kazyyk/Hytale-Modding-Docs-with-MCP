# Position

Type: class | Package: com.hypixel.hytale.protocol

public class Position

Protocol data structure in the Spatial/Math Primitives group.

## Fields

- double x
- double y
- double z

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 24
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 24
- MAX_SIZE | 24

Binary layout: 24 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Position deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Position` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Position` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Position` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static Position deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public Position clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public double x
public double y
public double z
