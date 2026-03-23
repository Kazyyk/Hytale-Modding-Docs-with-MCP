# SoundSet

Type: class | Package: com.hypixel.hytale.protocol

public class SoundSet

Protocol data structure in the Sound/Audio group.

## Fields

- String id
- Map<``String``, ``Integer``> sounds
- SoundCategory category

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 2
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 10
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 2 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SoundSet deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SoundSet` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SoundSet` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `SoundSet` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- SoundCategory
