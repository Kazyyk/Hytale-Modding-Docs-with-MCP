# SimpleBlockInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class SimpleBlockInteraction extends SimpleInteraction

Adds useLatestTarget boolean for block-targeting interactions.

## Fields

- boolean useLatestTarget

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 20
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 40
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 20 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static SimpleBlockInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `SimpleBlockInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `SimpleBlockInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `SimpleBlockInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction
- SimpleInteraction
