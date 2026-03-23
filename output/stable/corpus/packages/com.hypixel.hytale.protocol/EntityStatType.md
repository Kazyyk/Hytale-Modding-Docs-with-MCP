# EntityStatType

Type: class | Package: com.hypixel.hytale.protocol

public class EntityStatType

Complete entity stat definition including identifier, value range, UI visibility, boundary effects, and reset behavior.

## Fields

- String id
- float value
- float min
- float max
- EntityStatEffects minValueEffects
- EntityStatEffects maxValueEffects
- EntityStatResetBehavior resetBehavior
- boolean hideFromTooltip

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 15
- VARIABLE_FIELD_COUNT | 3
- VARIABLE_BLOCK_START | 27
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 15 bytes of fixed fields + 3 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EntityStatType deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EntityStatType` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EntityStatType` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EntityStatType` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EntityStatEffects
- EntityStatResetBehavior
