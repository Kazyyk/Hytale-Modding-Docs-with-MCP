# Hitbox

Type: class | Package: com.hypixel.hytale.protocol

public class Hitbox

Axis-aligned bounding box defined by min/max corners in 3D space.

## Fields

- float minX
- float minY
- float minZ
- float maxX
- float maxY
- float maxZ

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 24
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 24
- MAX_SIZE | 24

Binary layout: 24 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Hitbox deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Hitbox` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Hitbox` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Hitbox` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- DetailBox
- BlockType
- HitboxCollisionConfig
