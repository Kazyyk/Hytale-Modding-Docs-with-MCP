# FloatRange

Type: class | Package: com.hypixel.hytale.protocol

public class FloatRange

Defines an inclusive floating-point range with min and max bounds.

## Fields

- float inclusiveMin
- float inclusiveMax

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 8

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static FloatRange deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `FloatRange` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `FloatRange` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `FloatRange` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ClampConfig
