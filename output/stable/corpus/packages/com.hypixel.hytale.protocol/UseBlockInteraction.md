# UseBlockInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleBlockInteraction

public class UseBlockInteraction extends SimpleBlockInteraction

A block-targeting interaction type that extends `SimpleBlockInteraction`. Part of the interaction/ability system (type ID 33).

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 20
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 40
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 20 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static UseBlockInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `UseBlockInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `UseBlockInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `UseBlockInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction
- SimpleBlockInteraction
- SimpleInteraction
