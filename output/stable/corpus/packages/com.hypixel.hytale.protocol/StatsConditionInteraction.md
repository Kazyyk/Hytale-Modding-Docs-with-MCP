# StatsConditionInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class StatsConditionInteraction extends SimpleInteraction

An interaction type that extends `SimpleInteraction` with chain pointers. Part of the interaction/ability system (type ID 14).

## Fields

- Map<``Integer``, ``Float``> costs
- boolean lessThan
- boolean lenient
- ValueType valueType

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 22
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 46
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 22 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static StatsConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `StatsConditionInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `StatsConditionInteraction` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `StatsConditionInteraction` into the given buffer. Returns bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Interaction
- SimpleInteraction
- ValueType
