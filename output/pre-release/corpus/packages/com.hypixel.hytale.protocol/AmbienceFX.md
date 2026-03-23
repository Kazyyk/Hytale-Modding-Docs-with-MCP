# AmbienceFX

Type: class | Package: com.hypixel.hytale.protocol

public class AmbienceFX

Defines a complete ambience effect configuration including trigger conditions, sounds, music, ambient beds, and audio processing effects. Ambience effects are selected based on environmental conditions.

## Fields

- String id
- AmbienceFXConditions conditions
- AmbienceFXSound`[] sounds
- AmbienceFXMusic music
- AmbienceFXAmbientBed ambientBed
- AmbienceFXSoundEffect soundEffect
- int priority
- int``[] blockedAmbienceFxIndices
- int audioCategoryIndex

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 18
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 42
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 18 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AmbienceFX deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AmbienceFX` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AmbienceFX` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AmbienceFX` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AmbienceFXConditions
- AmbienceFXSound
- AmbienceFXMusic
- AmbienceFXAmbientBed
- AmbienceFXSoundEffect
