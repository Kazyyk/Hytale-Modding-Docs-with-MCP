# BlockGathering

Type: class | Package: com.hypixel.hytale.protocol

public class BlockGathering

Groups the different ways a block can be gathered: standard breaking, harvesting, and soft-block collection.

## Fields

- BlockBreaking breaking
- Harvesting harvest
- SoftBlock soft

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 13
- MAX_SIZE | 114,688,092

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockGathering deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockGathering` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockGathering` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockGathering` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockBreaking
- Harvesting
- BlockType

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static BlockGathering deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BlockGathering clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public BlockBreaking breaking
public Harvesting harvest
public SoftBlock soft
