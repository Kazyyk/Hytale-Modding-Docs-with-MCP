# RequiredBlockFaceSupport

Type: class | Package: com.hypixel.hytale.protocol

public class RequiredBlockFaceSupport

Protocol data structure in the Block/Connected Block Rules group.

## Fields

- String faceType
- String selfFaceType
- String blockSetId
- int blockTypeId
- int tagIndex
- int fluidId
- SupportMatch support
- SupportMatch matchSelf
- boolean allowSupportPropagation
- boolean rotate
- Vector3i`[] filler

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 17
- VARIABLE_FIELD_COUNT | 4
- VARIABLE_BLOCK_START | 33
- MAX_SIZE | 98,304,053

Binary layout: 1 null-bit byte + 17 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static RequiredBlockFaceSupport deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `RequiredBlockFaceSupport` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `RequiredBlockFaceSupport` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `RequiredBlockFaceSupport` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- SupportMatch
- Vector3i
