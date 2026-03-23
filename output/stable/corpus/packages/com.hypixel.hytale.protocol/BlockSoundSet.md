# BlockSoundSet

Type: class | Package: com.hypixel.hytale.protocol

public class BlockSoundSet

Maps block sound events to sound event indices, defining all sounds a block type produces.

## Fields

- String id
- Map<`BlockSoundEvent`, ``Integer``> soundEventIndices
- FloatRange moveInRepeatRange

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 17
- MAX_SIZE | 36,864,027

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockSoundSet deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockSoundSet` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockSoundSet` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockSoundSet` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockSoundEvent
- FloatRange
- BlockType
