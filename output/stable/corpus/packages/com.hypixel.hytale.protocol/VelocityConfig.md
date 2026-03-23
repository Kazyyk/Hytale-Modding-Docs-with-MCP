# VelocityConfig

Type: class | Package: com.hypixel.hytale.protocol

public class VelocityConfig

Protocol data structure in the Movement/Physics group.

## Fields

- float groundResistance
- float groundResistanceMax
- float airResistance
- float airResistanceMax
- float threshold
- VelocityThresholdStyle style

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 21
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 21
- MAX_SIZE | 21

Binary layout: 21 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static VelocityConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `VelocityConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `VelocityConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `VelocityConfig` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- VelocityThresholdStyle

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static VelocityConfig deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public VelocityConfig clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float groundResistance
public float groundResistanceMax
public float airResistance
public float airResistanceMax
public float threshold
public VelocityThresholdStyle style
