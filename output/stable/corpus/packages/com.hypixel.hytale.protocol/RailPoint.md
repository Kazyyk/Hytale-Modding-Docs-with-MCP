# RailPoint

Type: class | Package: com.hypixel.hytale.protocol

public class RailPoint

Protocol data structure in the Rail System group.

## Fields

- Vector3f point
- Vector3f normal

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 25
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 25
- MAX_SIZE | 25

Binary layout: 1 null-bit byte + 25 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RailPoint deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RailPoint` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RailPoint` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `RailPoint` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Vector3f

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static RailPoint deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public RailPoint clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public Vector3f point
public Vector3f normal
