# BlockRotation

Type: class | Package: com.hypixel.hytale.protocol

public class BlockRotation

Defines the rotation state of a placed block around yaw, pitch, and roll axes.

## Fields

- Rotation rotationYaw
- Rotation rotationPitch
- Rotation rotationRoll

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 3
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 3
- MAX_SIZE | 3

Binary layout: 3 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BlockRotation deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BlockRotation` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BlockRotation` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BlockRotation` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- BlockType
