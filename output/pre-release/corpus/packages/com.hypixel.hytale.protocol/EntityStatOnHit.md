# EntityStatOnHit

Type: class | Package: com.hypixel.hytale.protocol

public class EntityStatOnHit

Defines stat modifications applied on hit, with per-entity-count multipliers.

## Fields

- int entityStatIndex
- float amount
- float``[] multipliersPerEntitiesHit
- float multiplierPerExtraEntityHit

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 13
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 13
- MAX_SIZE | 16,384,018

Binary layout: 1 null-bit byte + 13 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EntityStatOnHit deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EntityStatOnHit` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EntityStatOnHit` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EntityStatOnHit` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- DamageEntityInteraction
