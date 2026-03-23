# ChargingInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: Interaction

public class ChargingInteraction extends Interaction

An interaction (type ID 9) that implements charge-up mechanics with configurable delay and hold behavior. Extends Interaction directly.

## Fields

- int failed
- boolean allowIndefiniteHold
- boolean displayProgress
- boolean cancelOnOtherClick
- boolean failOnDamage
- float mouseSensitivityAdjustmentTarget
- float mouseSensitivityAdjustmentDuration
- Map<``Float``, ``Integer``> chargedNext
- Map<`InteractionType`, ``Integer``> forks
- ChargingDelay chargingDelay

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 47
- VARIABLE_FIELD_COUNT | 7
- VARIABLE_BLOCK_START | 75
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 47 bytes of fixed fields + 7 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ChargingInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ChargingInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ChargingInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ChargingInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ChargingDelay
- Interaction
