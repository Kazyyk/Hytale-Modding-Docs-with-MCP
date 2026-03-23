# ChainFlagInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class ChainFlagInteraction extends SimpleInteraction

An interaction (type ID 37) that sets a flag on an interaction chain. Extends SimpleInteraction.

## Fields

- String chainId
- String flag

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 19
- VARIABLE_FIELD_COUNT | 7
- VARIABLE_BLOCK_START | 47
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 19 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ChainFlagInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ChainFlagInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ChainFlagInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ChainFlagInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ChainingInteraction
- Interaction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ChainFlagInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ChainFlagInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String chainId
public String flag
