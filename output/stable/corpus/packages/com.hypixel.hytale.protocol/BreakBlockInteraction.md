# BreakBlockInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleBlockInteraction

public class BreakBlockInteraction extends SimpleBlockInteraction

An interaction (type ID 3) that breaks a targeted block, optionally harvesting drops. Extends SimpleBlockInteraction.

## Fields

- boolean harvest

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 21
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 41
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 21 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static BreakBlockInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `BreakBlockInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `BreakBlockInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `BreakBlockInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction
