# Objective

Type: class | Package: com.hypixel.hytale.protocol

public class Objective

Protocol data structure in the Objectives/UI group.

## Fields

- UUID objectiveUuid
- FormattedMessage objectiveTitleKey
- FormattedMessage objectiveDescriptionKey
- String objectiveLineId
- ObjectiveTask`[] tasks

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 17
- VARIABLE_FIELD_COUNT | 4
- VARIABLE_BLOCK_START | 33
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 17 bytes of fixed fields + 4 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static Objective deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `Objective` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `Objective` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `Objective` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- FormattedMessage
- ObjectiveTask
