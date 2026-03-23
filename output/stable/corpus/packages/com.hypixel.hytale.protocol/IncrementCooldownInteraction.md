# IncrementCooldownInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class IncrementCooldownInteraction extends SimpleInteraction

An interaction (type ID 38) that adds time to an existing cooldown. Extends SimpleInteraction.

## Fields

- String cooldownId
- float cooldownIncrementTime
- int cooldownIncrementCharge
- float cooldownIncrementChargeTime
- boolean cooldownIncrementInterrupt

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 32
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 56
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 32 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static IncrementCooldownInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `IncrementCooldownInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `IncrementCooldownInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `IncrementCooldownInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionCooldown
- Interaction
