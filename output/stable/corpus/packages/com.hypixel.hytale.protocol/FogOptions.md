# FogOptions

Type: class | Package: com.hypixel.hytale.protocol

public class FogOptions

Global fog rendering configuration with distance and height parameters.

## Fields

- boolean ignoreFogLimits
- float effectiveViewDistanceMultiplier
- float fogFarViewDistance
- float fogHeightCameraOffset
- boolean fogHeightCameraOverriden
- float fogHeightCameraFixed

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 18
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 18
- MAX_SIZE | 18

Binary layout: 18 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static FogOptions deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `FogOptions` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `FogOptions` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `FogOptions` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.
