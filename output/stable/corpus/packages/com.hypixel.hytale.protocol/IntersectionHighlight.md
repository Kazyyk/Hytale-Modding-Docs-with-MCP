# IntersectionHighlight

Type: class | Package: com.hypixel.hytale.protocol

public class IntersectionHighlight

Defines highlight rendering for entity/block intersection with threshold and color.

## Fields

- float highlightThreshold
- Color highlightColor

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 8

Binary layout: 1 null-bit byte + 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static IntersectionHighlight deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `IntersectionHighlight` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `IntersectionHighlight` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `IntersectionHighlight` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Color
