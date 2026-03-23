# EntityStatUpdate

Type: class | Package: com.hypixel.hytale.protocol

public class EntityStatUpdate

Individual stat operation carrying the op type, predictability flag, value, and optional modifier data.

## Fields

- EntityStatOp op
- boolean predictable
- float value
- Map<``String``, `Modifier`> modifiers
- String modifierKey
- Modifier modifier

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 13
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 21
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 13 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EntityStatUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EntityStatUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EntityStatUpdate` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EntityStatUpdate` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EntityStatOp
- EntityStatsUpdate
