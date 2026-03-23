# SoundEventLayer

Type: class | Package: com.hypixel.hytale.protocol

public class SoundEventLayer

Protocol data structure in the Sound/Audio group.

## Fields

- float volume
- float startDelay
- boolean looping
- int probability
- float probabilityRerollDelay
- int roundRobinHistorySize
- SoundEventLayerRandomSettings randomSettings
- String``[] files

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 42
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 42
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 42 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SoundEventLayer deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SoundEventLayer` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SoundEventLayer` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `SoundEventLayer` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- SoundEventLayerRandomSettings
