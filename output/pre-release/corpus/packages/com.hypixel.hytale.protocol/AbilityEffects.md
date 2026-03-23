# AbilityEffects

Type: class | Package: com.hypixel.hytale.protocol

public class AbilityEffects

Defines which interaction types are disabled for an ability effect. Used to selectively block interaction triggers while an entity effect is active.

## Fields

- InteractionType`[] disabled

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 4,096,006

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AbilityEffects deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AbilityEffects` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AbilityEffects` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AbilityEffects` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionType
- ApplicationEffects

Also in this package: AOECircleSelector, AOECylinderSelector, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot, ApplicationEffects (and 381 more)

Complete API:
  public static AbilityEffects deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public AbilityEffects clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public InteractionType[] disabled
