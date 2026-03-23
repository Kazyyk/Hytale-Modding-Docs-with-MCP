# ApplyEffectInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class ApplyEffectInteraction extends SimpleInteraction

An interaction (type ID 27) that applies an entity effect to a target. Extends SimpleInteraction.

## Fields

- int effectId
- InteractionTarget entityTarget

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 24
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 44
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 24 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ApplyEffectInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ApplyEffectInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ApplyEffectInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ApplyEffectInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionTarget
- EntityEffect
- Interaction
