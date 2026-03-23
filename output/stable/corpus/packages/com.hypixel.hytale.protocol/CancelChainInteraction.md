# CancelChainInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class CancelChainInteraction extends SimpleInteraction

An interaction (type ID 39) that cancels an active interaction chain by ID. Extends SimpleInteraction.

## Fields

- String chainId

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 19
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 43
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 19 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static CancelChainInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `CancelChainInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `CancelChainInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `CancelChainInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ChainingInteraction
- Interaction
