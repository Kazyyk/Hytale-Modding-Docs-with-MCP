# ItemWithAllMetadata

Type: class | Package: com.hypixel.hytale.protocol

public class ItemWithAllMetadata

Pairs an item ID with arbitrary metadata string. Used in inventory slots and equipment references.

## Fields

- String itemId
- int quantity
- double durability
- double maxDurability
- boolean overrideDroppedItemAnimation
- String metadata

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 22
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 30
- MAX_SIZE | 32,768,040

Binary layout: 1 null-bit byte + 22 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemWithAllMetadata deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemWithAllMetadata` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemWithAllMetadata` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemWithAllMetadata` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ItemUpdate
- InventorySection
- `Equipment`

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ItemWithAllMetadata deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ItemWithAllMetadata clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String itemId
public int quantity
public double durability
public double maxDurability
public boolean overrideDroppedItemAnimation
public String metadata
