# SelectedHitEntity

Type: class | Package: com.hypixel.hytale.protocol

public class SelectedHitEntity

Protocol data structure in the Projectile/Combat group.

## Fields

- int networkId
- Vector3f hitLocation
- Position position
- Direction bodyRotation

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 53
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 53
- MAX_SIZE | 53

Binary layout: 1 null-bit byte + 53 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SelectedHitEntity deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SelectedHitEntity` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SelectedHitEntity` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `SelectedHitEntity` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Direction
- Position
- Vector3f
