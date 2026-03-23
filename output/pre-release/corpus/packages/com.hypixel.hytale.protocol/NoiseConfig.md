# NoiseConfig

Type: class | Package: com.hypixel.hytale.protocol

public class NoiseConfig

Protocol data structure in the World/Environment group.

## Fields

- int seed
- NoiseType type
- float frequency
- float amplitude
- ClampConfig clamp

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 23
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 23
- MAX_SIZE | 23

Binary layout: 1 null-bit byte + 23 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static NoiseConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `NoiseConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `NoiseConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `NoiseConfig` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ClampConfig
- NoiseType

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static NoiseConfig deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public NoiseConfig clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int seed
public NoiseType type
public float frequency
public float amplitude
public ClampConfig clamp
