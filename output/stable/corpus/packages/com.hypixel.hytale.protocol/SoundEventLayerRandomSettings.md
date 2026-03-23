# SoundEventLayerRandomSettings

Type: class | Package: com.hypixel.hytale.protocol

public class SoundEventLayerRandomSettings

Protocol data structure in the Sound/Audio group.

## Fields

- float minVolume
- float maxVolume
- float minPitch
- float maxPitch
- float maxStartOffset

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 20
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 20
- MAX_SIZE | 20

Binary layout: 20 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SoundEventLayerRandomSettings deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SoundEventLayerRandomSettings` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SoundEventLayerRandomSettings` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `SoundEventLayerRandomSettings` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
