# Edge

Type: class | Package: com.hypixel.hytale.protocol

public class Edge

Defines a visual edge/outline with color and width.

## Fields

- ColorAlpha color
- float width

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 9

Binary layout: 1 null-bit byte + 9 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Edge deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Edge` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Edge` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Edge` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
