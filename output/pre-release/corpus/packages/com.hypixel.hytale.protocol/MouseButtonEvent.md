# MouseButtonEvent

Type: class | Package: com.hypixel.hytale.protocol

public class MouseButtonEvent

Protocol data structure in the Input Events group.

## Fields

- MouseButtonType mouseButtonType
- MouseButtonState state
- byte clicks

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 3
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 3
- MAX_SIZE | 3

Binary layout: 3 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static MouseButtonEvent deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `MouseButtonEvent` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `MouseButtonEvent` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `MouseButtonEvent` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- MouseButtonState
- MouseButtonType
