# SoundEvent

Type: class | Package: com.hypixel.hytale.protocol

public class SoundEvent

Protocol data structure in the Sound/Audio group.

## Fields

- String id
- float volume
- float pitch
- float musicDuckingVolume
- float ambientDuckingVolume
- int maxInstance
- boolean preventSoundInterruption
- float startAttenuationDistance
- float maxDistance
- SoundEventLayer`[] layers
- int audioCategory

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 34
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 42
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 34 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SoundEvent deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SoundEvent` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SoundEvent` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `SoundEvent` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- SoundEventLayer
