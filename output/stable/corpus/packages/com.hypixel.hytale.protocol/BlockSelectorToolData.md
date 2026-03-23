# BlockSelectorToolData

Type: class | Package: com.hypixel.hytale.protocol

public class BlockSelectorToolData

Configuration for block selector tool behavior, including selection modes and visual feedback.

## Fields

- float durabilityLossOnUse

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 4
- MAX_SIZE | 4

Binary layout: 4 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockSelectorToolData deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockSelectorToolData` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockSelectorToolData` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockSelectorToolData` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemBase

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static BlockSelectorToolData deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BlockSelectorToolData clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float durabilityLossOnUse
