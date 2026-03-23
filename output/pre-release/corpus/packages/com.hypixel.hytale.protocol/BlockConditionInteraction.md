# BlockConditionInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleBlockInteraction

public class BlockConditionInteraction extends SimpleBlockInteraction

An interaction (type ID 14) that checks conditions against targeted blocks using block matchers. Extends SimpleBlockInteraction.

## Fields

- BlockMatcher`[] matchers

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 20
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 44
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 20 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockConditionInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockConditionInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockConditionInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockMatcher
- Interaction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static BlockConditionInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BlockConditionInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public BlockMatcher[] matchers
