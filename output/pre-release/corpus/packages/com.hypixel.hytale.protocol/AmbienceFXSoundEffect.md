# AmbienceFXSoundEffect

Type: class | Package: com.hypixel.hytale.protocol

public class AmbienceFXSoundEffect

Defines audio processing effects (reverb and equalizer) applied to ambience sounds.

## Fields

- int reverbEffectIndex
- int equalizerEffectIndex
- boolean isInstant

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 9

Binary layout: 9 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AmbienceFXSoundEffect deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AmbienceFXSoundEffect` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AmbienceFXSoundEffect` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AmbienceFXSoundEffect` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EqualizerEffect
- AmbienceFX
