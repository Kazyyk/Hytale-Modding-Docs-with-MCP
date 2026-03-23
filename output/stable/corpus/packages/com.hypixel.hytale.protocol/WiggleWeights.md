# WiggleWeights

Type: class | Package: com.hypixel.hytale.protocol

public class WiggleWeights

Protocol data structure in the Camera/View group.

## Fields

- float x
- float xDeceleration
- float y
- float yDeceleration
- float z
- float zDeceleration
- float roll
- float rollDeceleration
- float pitch
- float pitchDeceleration

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 40
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 40
- MAX_SIZE | 40

Binary layout: 40 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static WiggleWeights deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `WiggleWeights` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `WiggleWeights` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `WiggleWeights` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.
