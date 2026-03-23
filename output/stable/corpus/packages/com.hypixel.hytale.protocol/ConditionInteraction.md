# ConditionInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class ConditionInteraction extends SimpleInteraction

An interaction (type ID 12) that checks player state conditions (game mode, jumping, swimming, crouching, running, flying). Extends SimpleInteraction.

## Fields

- GameMode requiredGameMode
- Boolean jumping
- Boolean swimming
- Boolean crouching
- Boolean running
- Boolean flying

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 2
- FIXED_BLOCK_SIZE | 26
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 46
- MAX_SIZE | 1,677,721,600

Binary layout: 2 null-bit bytes + 26 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ConditionInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ConditionInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ConditionInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- GameMode
- Interaction
