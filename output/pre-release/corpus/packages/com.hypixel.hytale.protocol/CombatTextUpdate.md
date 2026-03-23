# CombatTextUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class CombatTextUpdate extends ComponentUpdate

A component update (type ID 2) that displays combat/damage text on an entity with directional hit angle.

## Fields

- float hitAngleDeg
- String text

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 4
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 4
- MAX_SIZE | 16,384,009

Binary layout: 4 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static CombatTextUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `CombatTextUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `CombatTextUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `CombatTextUpdate` into the given buffer. Returns the number of bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate
- ComponentUpdateType
- EntityUpdate
