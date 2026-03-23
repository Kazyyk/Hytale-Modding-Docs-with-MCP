# CooldownConditionInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class CooldownConditionInteraction extends SimpleInteraction

An interaction (type ID 36) that checks whether a cooldown is active. Extends SimpleInteraction.

## Fields

- String cooldownId

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 19
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 43
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 19 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static CooldownConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `CooldownConditionInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `CooldownConditionInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `CooldownConditionInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionCooldown
- Interaction
