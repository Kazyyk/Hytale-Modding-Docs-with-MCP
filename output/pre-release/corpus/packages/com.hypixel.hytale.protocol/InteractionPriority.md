# InteractionPriority

Type: class | Package: com.hypixel.hytale.protocol

public class InteractionPriority

Defines priority values per slot for interaction type ordering.

## Fields

- Map<`PrioritySlot`, ``Integer``> values

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 1
- MAX_SIZE | 20,480,006

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InteractionPriority deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InteractionPriority` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InteractionPriority` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `InteractionPriority` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionConfiguration
- InteractionType

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static InteractionPriority deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public InteractionPriority clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public Map<PrioritySlot,Integer> values
