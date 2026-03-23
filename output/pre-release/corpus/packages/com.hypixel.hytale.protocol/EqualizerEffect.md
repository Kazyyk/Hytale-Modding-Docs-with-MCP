# EqualizerEffect

Type: class | Package: com.hypixel.hytale.protocol

public class EqualizerEffect

Audio equalizer preset with 10-band gain and frequency parameters.

## Fields

- String id
- float lowGain
- float lowCutOff
- float lowMidGain
- float lowMidCenter
- float lowMidWidth
- float highMidGain
- float highMidCenter
- float highMidWidth
- float highGain
- float highCutOff

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 41
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 41
- MAX_SIZE | 16,384,046

Binary layout: 1 null-bit byte + 41 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EqualizerEffect deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EqualizerEffect` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EqualizerEffect` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EqualizerEffect` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AmbienceFXSoundEffect

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static EqualizerEffect deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public EqualizerEffect clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public float lowGain
public float lowCutOff
public float lowMidGain
public float lowMidCenter
public float lowMidWidth
public float highMidGain
public float highMidCenter
public float highMidWidth
public float highGain
public float highCutOff
