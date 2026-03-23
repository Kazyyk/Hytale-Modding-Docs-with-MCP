# ObjectiveTask

Type: class | Package: com.hypixel.hytale.protocol

public class ObjectiveTask

Protocol data structure in the Objectives/UI group.

## Fields

- FormattedMessage taskDescriptionKey
- int currentCompletion
- int completionNeeded

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 9
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 9
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 9 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ObjectiveTask deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ObjectiveTask` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ObjectiveTask` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ObjectiveTask` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- FormattedMessage
