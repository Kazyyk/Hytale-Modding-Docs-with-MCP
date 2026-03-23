# InitialVelocity

Type: class | Package: com.hypixel.hytale.protocol

public class InitialVelocity

Defines randomized initial velocity parameters with ranges for yaw, pitch, and speed.

## Fields

- Rangef yaw
- Rangef pitch
- Rangef speed

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 25
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 25
- MAX_SIZE | 25

Binary layout: 1 null-bit byte + 25 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InitialVelocity deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InitialVelocity` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InitialVelocity` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `InitialVelocity` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
