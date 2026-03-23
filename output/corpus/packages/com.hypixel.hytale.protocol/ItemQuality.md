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
