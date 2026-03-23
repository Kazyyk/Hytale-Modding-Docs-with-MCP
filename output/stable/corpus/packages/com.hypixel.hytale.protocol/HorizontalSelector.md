# HorizontalSelector

Type: class | Package: com.hypixel.hytale.protocol | Extends: Selector

public class HorizontalSelector extends Selector

A targeting selector (type ID 3) that selects entities in a horizontal arc defined by direction, extents, yaw length, and distance range.

## Fields

- float extendTop
- float extendBottom
- float yawLength
- float yawStartOffset
- float pitchOffset
- float rollOffset
- float startDistance
- float endDistance
- HorizontalSelectorDirection direction
- boolean testLineOfSight

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 34
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 34
- MAX_SIZE | 34

Binary layout: 34 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static HorizontalSelector deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `HorizontalSelector` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `HorizontalSelector` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `HorizontalSelector` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- HorizontalSelectorDirection
- AOECircleSelector
- AOECylinderSelector
