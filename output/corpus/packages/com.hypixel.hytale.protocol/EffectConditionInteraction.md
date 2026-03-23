# EffectConditionInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class EffectConditionInteraction extends SimpleInteraction

An interaction (type ID 25) that checks whether specific entity effects are active on a target. Extends SimpleInteraction.

## Fields

- int``[] entityEffects
- Match match
- InteractionTarget entityTarget

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 21
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 45
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 21 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EffectConditionInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EffectConditionInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EffectConditionInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EffectConditionInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionTarget
- Interaction
