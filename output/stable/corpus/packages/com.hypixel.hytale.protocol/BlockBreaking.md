# BlockBreaking

Type: class | Package: com.hypixel.hytale.protocol

public class BlockBreaking

Defines how a block can be broken, including the gather type, health, drop quantity/quality, and specific item/drop list drops.

## Fields

- String gatherType
- float health
- int quantity
- int quality
- String itemId
- String dropListId

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 13
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 25
- MAX_SIZE | 49,152,040

Binary layout: 1 null-bit byte + 13 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockBreaking deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockBreaking` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockBreaking` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockBreaking` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockGathering
- Harvesting

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static BlockBreaking deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public BlockBreaking clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String gatherType
public float health
public int quantity
public int quality
public String itemId
public String dropListId
