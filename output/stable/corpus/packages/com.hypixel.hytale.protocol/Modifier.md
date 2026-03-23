# Modifier

Type: class | Package: com.hypixel.hytale.protocol

public class Modifier

Protocol data structure in the Modifier System group.

## Fields

- ModifierTarget target
- CalculationType calculationType
- float amount

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 6
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 6
- MAX_SIZE | 6

Binary layout: 6 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Modifier deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Modifier` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Modifier` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Modifier` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- CalculationType
- ModifierTarget
