# AOECircleSelector

Type: class | Package: com.hypixel.hytale.protocol | Extends: Selector

public class AOECircleSelector extends Selector

A targeting selector (type ID 0) that selects entities within a circular area defined by range and offset.

## Fields

- float range
- Vector3f offset

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 17
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 17
- MAX_SIZE | 17

Binary layout: 1 null-bit byte + 17 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static AOECircleSelector deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `AOECircleSelector` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `AOECircleSelector` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `AOECircleSelector` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AOECylinderSelector
- HorizontalSelector
