# ParticleAnimationFrame

Type: class | Package: com.hypixel.hytale.protocol

public class ParticleAnimationFrame

Protocol data structure in the Particle/VFX System group.

## Fields

- Range frameIndex
- RangeVector2f scale
- RangeVector3f rotation
- Color color
- float opacity

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 58
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 58
- MAX_SIZE | 58

Binary layout: 1 null-bit byte + 58 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ParticleAnimationFrame deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ParticleAnimationFrame` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ParticleAnimationFrame` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ParticleAnimationFrame` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Color
- Range
- RangeVector2f
- RangeVector3f

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ParticleAnimationFrame deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ParticleAnimationFrame clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public Range frameIndex
public RangeVector2f scale
public RangeVector3f rotation
public Color color
public float opacity
