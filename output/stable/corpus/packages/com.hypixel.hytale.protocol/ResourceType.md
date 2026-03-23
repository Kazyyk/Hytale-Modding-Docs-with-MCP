# ResourceType

Type: class | Package: com.hypixel.hytale.protocol

public class ResourceType

Protocol data structure in the Block/Connected Block Rules group.

## Fields

- String id
- String icon

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 1
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 32,768,019

Binary layout: 1 null-bit byte + 1 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ResourceType deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ResourceType` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ResourceType` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ResourceType` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
