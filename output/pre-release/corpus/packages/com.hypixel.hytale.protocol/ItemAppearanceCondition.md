# ItemAppearanceCondition

Type: class | Package: com.hypixel.hytale.protocol

public class ItemAppearanceCondition

Defines conditional visual overrides for an item based on a stat/value condition range, including model, texture, particles, and VFX replacements.

## Fields

- ModelParticle`[] particles
- ModelParticle`[] firstPersonParticles
- String model
- String texture
- String modelVFXId
- FloatRange condition
- ValueType conditionValueType
- int localSoundEventId
- int worldSoundEventId

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 18
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 38
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 18 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemAppearanceCondition deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemAppearanceCondition` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemAppearanceCondition` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemAppearanceCondition` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- FloatRange
- ItemBase

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ItemAppearanceCondition deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ItemAppearanceCondition clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public ModelParticle[] particles
public ModelParticle[] firstPersonParticles
public String model
public String texture
public String modelVFXId
public FloatRange condition
public ValueType conditionValueType
public int localSoundEventId
public int worldSoundEventId
