# ColorLight

Type: class | Package: com.hypixel.hytale.protocol

public class ColorLight

RGB color with a light emission radius. Used for dynamic lighting and colored light sources.

## Fields

- byte radius
- byte red
- byte green
- byte blue

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 4
- MAX_SIZE | 4

Binary layout: 4 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ColorLight deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ColorLight` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ColorLight` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ColorLight` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Color
- DynamicLightUpdate
- BlockType
