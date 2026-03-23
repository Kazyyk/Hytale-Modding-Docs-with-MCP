# InteractionRules

Type: class | Package: com.hypixel.hytale.protocol

public class InteractionRules

Defines interaction blocking and interruption relationships with other interaction types.

## Fields

- InteractionType`[] blockedBy
- InteractionType`[] blocking
- InteractionType`[] interruptedBy
- InteractionType`[] interrupting
- int blockedByBypassIndex
- int blockingBypassIndex
- int interruptedByBypassIndex
- int interruptingBypassIndex

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 17
- VARIABLE_FIELD_COUNT | 4
- VARIABLE_BLOCK_START | 33
- MAX_SIZE | 16,384,053

Binary layout: 1 null-bit byte + 17 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InteractionRules deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InteractionRules` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InteractionRules` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `InteractionRules` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionType
- Interaction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static InteractionRules deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public InteractionRules clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public InteractionType[] blockedBy
public InteractionType[] blocking
public InteractionType[] interruptedBy
public InteractionType[] interrupting
public int blockedByBypassIndex
public int blockingBypassIndex
public int interruptedByBypassIndex
public int interruptingBypassIndex
