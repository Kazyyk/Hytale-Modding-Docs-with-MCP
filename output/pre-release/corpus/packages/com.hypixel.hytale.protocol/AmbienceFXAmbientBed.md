# AmbienceFXAmbientBed

Type: class | Package: com.hypixel.hytale.protocol

public class AmbienceFXAmbientBed

Defines an ambient bed (continuous background audio loop) within an ambience effect, including the audio track, volume, and transition behavior.

## Fields

- String track
- float volume
- AmbienceTransitionSpeed transitionSpeed

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 6
- MAX_SIZE | 16,384,011

Binary layout: 1 null-bit byte + 6 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AmbienceFXAmbientBed deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AmbienceFXAmbientBed` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AmbienceFXAmbientBed` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AmbienceFXAmbientBed` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AmbienceTransitionSpeed
- AmbienceFX
