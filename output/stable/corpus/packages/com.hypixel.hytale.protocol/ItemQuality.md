# ItemQuality

Type: class | Package: com.hypixel.hytale.protocol

public class ItemQuality

Defines an item quality tier with visual styling (tooltip texture, text color, localization).

## Fields

- String id
- String itemTooltipTexture
- String itemTooltipArrowTexture
- String slotTexture
- String blockSlotTexture
- String specialSlotTexture
- Color textColor
- String localizationKey
- boolean visibleQualityLabel
- boolean renderSpecialSlot
- boolean hideFromSearch

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 7
- VARIABLE_FIELD_COUNT | 7
- VARIABLE_BLOCK_START | 35
- MAX_SIZE | 114,688,070

Binary layout: 1 null-bit byte + 7 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ItemQuality deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ItemQuality` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ItemQuality` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ItemQuality` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Color

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static ItemQuality deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ItemQuality clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public String itemTooltipTexture
public String itemTooltipArrowTexture
public String slotTexture
public String blockSlotTexture
public String specialSlotTexture
public Color textColor
public String localizationKey
public boolean visibleQualityLabel
public boolean renderSpecialSlot
public boolean hideFromSearch
