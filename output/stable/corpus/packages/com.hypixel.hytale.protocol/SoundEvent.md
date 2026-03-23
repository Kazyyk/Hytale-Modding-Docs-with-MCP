# SoundEvent

Type: class | Package: com.hypixel.hytale.protocol

public class SoundEvent

Protocol data structure in the Sound/Audio group.

## Fields

- String id
- float volume
- float pitch
- float musicDuckingVolume
- float ambientDuckingVolume
- int maxInstance
- boolean preventSoundInterruption
- float startAttenuationDistance
- float maxDistance
- SoundEventLayer`[] layers
- int audioCategory

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 34
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 42
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 34 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SoundEvent deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SoundEvent` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SoundEvent` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `SoundEvent` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- SoundEventLayer

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static SoundEvent deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public SoundEvent clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public float volume
public float pitch
public float musicDuckingVolume
public float ambientDuckingVolume
public int maxInstance
public boolean preventSoundInterruption
public float startAttenuationDistance
public float maxDistance
public SoundEventLayer[] layers
public int audioCategory
