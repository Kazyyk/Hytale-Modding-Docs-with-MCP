# AmbienceFXSoundEffect

Type: class | Package: com.hypixel.hytale.protocol

public class AmbienceFXSoundEffect

Defines audio processing effects (reverb and equalizer) applied to ambience sounds.

## Fields

- int reverbEffectIndex
- int equalizerEffectIndex
- boolean isInstant

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 9

Binary layout: 9 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AmbienceFXSoundEffect deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AmbienceFXSoundEffect` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AmbienceFXSoundEffect` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AmbienceFXSoundEffect` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EqualizerEffect
- AmbienceFX

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot, ApplicationEffects (and 381 more)

Complete API:
  public static AmbienceFXSoundEffect deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AmbienceFXSoundEffect clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int reverbEffectIndex
public int equalizerEffectIndex
public boolean isInstant
