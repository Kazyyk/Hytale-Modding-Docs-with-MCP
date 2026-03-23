# LongParamValue

Type: class | Package: com.hypixel.hytale.protocol | Extends: ParamValue

public class LongParamValue extends ParamValue

A typed parameter value that extends `ParamValue`. Part of the parameter system (type ID 4).

## Fields

- long value

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 8
- MAX_SIZE | 8

Binary layout: 8 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static LongParamValue deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `LongParamValue` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `LongParamValue` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `LongParamValue` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ParamValue
