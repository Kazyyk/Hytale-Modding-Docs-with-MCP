# CameraShakeConfig

Type: class | Package: com.hypixel.hytale.protocol

public class CameraShakeConfig

Detailed camera shake parameters including duration, timing, easing curves, and noise generators for offset and rotation.

## Fields

- float duration
- float startTime
- boolean continuous
- EasingConfig easeIn
- EasingConfig easeOut
- OffsetNoise offset
- RotationNoise rotation

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 20
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 28
- MAX_SIZE | 565,248,084

Binary layout: 1 null-bit byte + 20 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static CameraShakeConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `CameraShakeConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `CameraShakeConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `CameraShakeConfig` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EasingConfig
- CameraShake

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static CameraShakeConfig deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public CameraShakeConfig clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float duration
public float startTime
public boolean continuous
public EasingConfig easeIn
public EasingConfig easeOut
public OffsetNoise offset
public RotationNoise rotation
