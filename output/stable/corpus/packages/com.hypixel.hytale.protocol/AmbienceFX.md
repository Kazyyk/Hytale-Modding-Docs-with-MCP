# AmbienceFX

Type: class | Package: com.hypixel.hytale.protocol

public class AmbienceFX

Defines a complete ambience effect configuration including trigger conditions, sounds, music, ambient beds, and audio processing effects. Ambience effects are selected based on environmental conditions.

## Fields

- String id
- AmbienceFXConditions conditions
- AmbienceFXSound`[] sounds
- AmbienceFXMusic music
- AmbienceFXAmbientBed ambientBed
- AmbienceFXSoundEffect soundEffect
- int priority
- int``[] blockedAmbienceFxIndices
- int audioCategoryIndex

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 18
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 42
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 18 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AmbienceFX deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AmbienceFX` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AmbienceFX` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AmbienceFX` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AmbienceFXConditions
- AmbienceFXSound
- AmbienceFXMusic
- AmbienceFXAmbientBed
- AmbienceFXSoundEffect

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot, ApplicationEffects (and 378 more)

Complete API:
  public static AmbienceFX deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AmbienceFX clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public AmbienceFXConditions conditions
public AmbienceFXSound[] sounds
public AmbienceFXMusic music
public AmbienceFXAmbientBed ambientBed
public AmbienceFXSoundEffect soundEffect
public int priority
public int[] blockedAmbienceFxIndices
public int audioCategoryIndex
