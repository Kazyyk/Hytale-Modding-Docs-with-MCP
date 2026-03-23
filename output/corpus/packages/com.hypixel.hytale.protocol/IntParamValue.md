# IntParamValue

Type: class | Package: com.hypixel.hytale.protocol | Extends: ParamValue

public class IntParamValue extends ParamValue

A typed parameter value (type ID 3) carrying an integer.

## Fields

- int value

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 4
- MAX_SIZE | 4

Binary layout: 4 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static IntParamValue deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `IntParamValue` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `IntParamValue` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `IntParamValue` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BoolParamValue
- DoubleParamValue
