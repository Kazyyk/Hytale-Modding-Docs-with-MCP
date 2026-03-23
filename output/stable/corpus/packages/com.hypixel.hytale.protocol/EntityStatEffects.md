# EntityStatEffects

Type: class | Package: com.hypixel.hytale.protocol

public class EntityStatEffects

Defines effects triggered when an entity stat reaches its min or max value, including sound and particles.

## Fields

- boolean triggerAtZero
- int soundEventIndex
- ModelParticle`[] particles

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 6
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EntityStatEffects deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EntityStatEffects` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EntityStatEffects` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EntityStatEffects` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EntityStatType

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static EntityStatEffects deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public EntityStatEffects clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public boolean triggerAtZero
public int soundEventIndex
public ModelParticle[] particles
