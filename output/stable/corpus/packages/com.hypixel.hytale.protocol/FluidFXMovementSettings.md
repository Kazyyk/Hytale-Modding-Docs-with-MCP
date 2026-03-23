# FluidFXMovementSettings

Type: class | Package: com.hypixel.hytale.protocol

public class FluidFXMovementSettings

Physics parameters for entity movement while submerged in a fluid.

## Fields

- float swimUpSpeed
- float swimDownSpeed
- float sinkSpeed
- float horizontalSpeedMultiplier
- float fieldOfViewMultiplier
- float entryVelocityMultiplier

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 24
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 24
- MAX_SIZE | 24

Binary layout: 24 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static FluidFXMovementSettings deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `FluidFXMovementSettings` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `FluidFXMovementSettings` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `FluidFXMovementSettings` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- FluidFX
