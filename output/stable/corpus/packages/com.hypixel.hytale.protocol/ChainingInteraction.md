# ChainingInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: Interaction

public class ChainingInteraction extends Interaction

An interaction (type ID 11) that links interactions into chains with configurable timing allowance and next-interaction options. Extends Interaction directly.

## Fields

- String chainId
- float chainingAllowance
- int``[] chainingNext
- Map<``String``, ``Integer``> flags

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 15
- VARIABLE_FIELD_COUNT | 8
- VARIABLE_BLOCK_START | 47
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 15 bytes of fixed fields + 8 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ChainingInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ChainingInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ChainingInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ChainingInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- CancelChainInteraction
- ChainFlagInteraction
- ForkedChainId
- Interaction
