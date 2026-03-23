# InteractionCooldown

Type: class | Package: com.hypixel.hytale.protocol

public class InteractionCooldown

Defines cooldown parameters for an interaction including ID, duration, click bypass, and charge time thresholds.

## Fields

- String cooldownId
- float cooldown
- boolean clickBypass
- float``[] chargeTimes
- boolean skipCooldownReset
- boolean interruptRecharge

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 8
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 16
- MAX_SIZE | 32,768,026

Binary layout: 1 null-bit byte + 8 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InteractionCooldown deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InteractionCooldown` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InteractionCooldown` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `InteractionCooldown` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- CooldownConditionInteraction
- IncrementCooldownInteraction
