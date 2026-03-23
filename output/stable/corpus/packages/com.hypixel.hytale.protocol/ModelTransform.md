# ModelTransform

Type: class | Package: com.hypixel.hytale.protocol

public class ModelTransform

Protocol data structure in the Spatial/Math Primitives group.

## Fields

- Position position
- Direction bodyOrientation
- Direction lookOrientation

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 49
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 49
- MAX_SIZE | 49

Binary layout: 1 null-bit byte + 49 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ModelTransform deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ModelTransform` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ModelTransform` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ModelTransform` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Direction
- Position
