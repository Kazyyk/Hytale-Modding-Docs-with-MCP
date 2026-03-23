# Direction

Type: class | Package: com.hypixel.hytale.protocol

public class Direction

Euler angle rotation with yaw, pitch, and roll components in floating point.

## Fields

- float yaw
- float pitch
- float roll

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 12
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 12
- MAX_SIZE | 12

Binary layout: 12 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Direction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Direction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Direction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Direction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockPosition
- InteractionCamera
- InteractionSyncData
