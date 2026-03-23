# DynamicLightUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class DynamicLightUpdate extends ComponentUpdate

A component update (type ID 13) that synchronizes an entity's dynamic light emission color and radius.

## Fields

- ColorLight dynamicLight

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 4
- MAX_SIZE | 4

Binary layout: 4 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static DynamicLightUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `DynamicLightUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `DynamicLightUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `DynamicLightUpdate` into the given buffer. Returns the number of bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ColorLight
- ComponentUpdate
- EntityUpdate
