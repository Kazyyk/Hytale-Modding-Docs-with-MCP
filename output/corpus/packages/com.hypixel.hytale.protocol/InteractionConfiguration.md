# InteractionConfiguration

Type: class | Package: com.hypixel.hytale.protocol

public class InteractionConfiguration

Top-level interaction system configuration including outline display, per-game-mode use distances, and per-type priorities.

## Fields

- boolean displayOutlines
- boolean debugOutlines
- Map<`GameMode`, ``Float``> useDistance
- boolean allEntities
- Map<`InteractionType`, `InteractionPriority`> priorities

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 12
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 4 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InteractionConfiguration deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InteractionConfiguration` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InteractionConfiguration` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `InteractionConfiguration` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- GameMode
- InteractionType
- InteractionPriority
