# ClearEntityEffectInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class ClearEntityEffectInteraction extends SimpleInteraction

An interaction (type ID 28) that removes an entity effect from a target. Extends SimpleInteraction.

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
public static ClearEntityEffectInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ClearEntityEffectInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ClearEntityEffectInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ClearEntityEffectInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionTarget
- EntityEffect
- Interaction
