# ModelAttachment

Type: class | Package: com.hypixel.hytale.protocol

public class ModelAttachment

Protocol data structure in the Model/Rendering group.

## Fields

- String model
- String texture
- String gradientSet
- String gradientId

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 4
- VARIABLE_BLOCK_START | 17
- MAX_SIZE | 65,536,037

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ModelAttachment deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ModelAttachment` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ModelAttachment` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ModelAttachment` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
