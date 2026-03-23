# BlockTextures

Type: class | Package: com.hypixel.hytale.protocol

public class BlockTextures

Per-face texture references for a cube-rendered block. Each face (top, bottom, front, back, left, right) can have an independent texture.

## Fields

- String top
- String bottom
- String front
- String back
- String left
- String right
- float weight

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 5
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 29
- MAX_SIZE | 98,304,059

Binary layout: 1 null-bit byte + 5 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockTextures deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockTextures` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockTextures` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockTextures` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockType
- Fluid
