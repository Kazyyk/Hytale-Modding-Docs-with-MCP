# BlockMatcher

Type: class | Package: com.hypixel.hytale.protocol

public class BlockMatcher

Composite block matching configuration combining ID matchers with block face requirements.

## Fields

- BlockIdMatcher block
- BlockFace face
- boolean staticFace

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 3
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 3
- MAX_SIZE | 32,768,026

Binary layout: 1 null-bit byte + 3 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockMatcher deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockMatcher` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockMatcher` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockMatcher` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockIdMatcher
- BlockFace
- BlockConditionInteraction
