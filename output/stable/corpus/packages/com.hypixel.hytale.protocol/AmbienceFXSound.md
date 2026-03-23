# AmbienceFXSound

Type: class | Package: com.hypixel.hytale.protocol

public class AmbienceFXSound

Defines a sound event within an ambience effect, including playback mode (2D/3D), altitude positioning, frequency, and radius.

## Fields

- int soundEventIndex
- AmbienceFXSoundPlay3D play3D
- int blockSoundSetIndex
- AmbienceFXAltitude altitude
- Rangef frequency
- Range radius

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 27
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 27
- MAX_SIZE | 27

Binary layout: 1 null-bit byte + 27 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AmbienceFXSound deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AmbienceFXSound` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AmbienceFXSound` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AmbienceFXSound` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AmbienceFXSoundPlay3D
- AmbienceFXAltitude
- AmbienceFX
