# EntityStatsUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class EntityStatsUpdate extends ComponentUpdate

A component update (type ID 8) that synchronizes entity stat changes, organized by stat index.

## Fields

- Map``<``Integer, EntityStatUpdate[]``> entityStatUpdates

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 0
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 0
- MAX_SIZE | 1,677,721,600

Binary layout: 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EntityStatsUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EntityStatsUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EntityStatsUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `EntityStatsUpdate` into the given buffer. Returns the number of bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EntityStatUpdate
- ComponentUpdate
- EntityUpdate
