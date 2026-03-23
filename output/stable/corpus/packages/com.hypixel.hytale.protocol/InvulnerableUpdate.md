# InvulnerableUpdate

Type: class | Package: com.hypixel.hytale.protocol | Extends: ComponentUpdate

public class InvulnerableUpdate extends ComponentUpdate

A component update (type ID 16) that marks an entity as invulnerable. Has no fields.

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 0
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 0
- MAX_SIZE | 0

## Methods


@Nonnull
public static InvulnerableUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InvulnerableUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InvulnerableUpdate` starting at the given offset.


@Override
public int serialize(@Nonnull ByteBuf buf)

Serializes this `InvulnerableUpdate` into the given buffer. Returns the number of bytes written.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ComponentUpdate
- EntityUpdate
