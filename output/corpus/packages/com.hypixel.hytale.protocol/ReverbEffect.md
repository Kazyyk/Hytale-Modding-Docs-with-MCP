# ReverbEffect

Type: class | Package: com.hypixel.hytale.protocol

public class ReverbEffect

Protocol data structure in the Sound/Audio group.

## Fields

- String id
- float dryGain
- float modalDensity
- float diffusion
- float gain
- float highFrequencyGain
- float decayTime
- float highFrequencyDecayRatio
- float reflectionGain
- float reflectionDelay
- float lateReverbGain
- float lateReverbDelay
- float roomRolloffFactor
- float airAbsorptionHighFrequencyGain
- boolean limitDecayHighFrequency

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 54
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 54
- MAX_SIZE | 16,384,059

Binary layout: 1 null-bit byte + 54 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ReverbEffect deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ReverbEffect` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ReverbEffect` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ReverbEffect` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
