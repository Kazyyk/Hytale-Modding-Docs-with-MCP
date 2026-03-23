# MemoriesConditionInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: Interaction

public class MemoriesConditionInteraction extends Interaction

An interaction type that extends `Interaction` directly. Part of the interaction/ability system (type ID 41).

## Fields

- Map<``Integer``, ``Integer``> memoriesNext
- int failed

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 15
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 39
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 15 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static MemoriesConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `MemoriesConditionInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `MemoriesConditionInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `MemoriesConditionInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction
