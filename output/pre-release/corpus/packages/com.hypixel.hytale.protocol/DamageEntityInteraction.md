# DamageEntityInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: Interaction

public class DamageEntityInteraction extends Interaction

An interaction (type ID 21) that deals damage to entities with directional angle-based effects and branching outcomes. Extends Interaction directly.

## Fields

- int next
- int failed
- int blocked
- DamageEffects damageEffects
- AngledDamage`[] angledDamage
- Map<``String``, `TargetedDamage`> targetedDamage
- EntityStatOnHit`[] entityStatsOnHit

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 2
- FIXED_BLOCK_SIZE | 24
- VARIABLE_FIELD_COUNT | 9
- VARIABLE_BLOCK_START | 60
- MAX_SIZE | 1,677,721,600

Binary layout: 2 null-bit bytes + 24 bytes of fixed fields + 9 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static DamageEntityInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `DamageEntityInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `DamageEntityInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `DamageEntityInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- DamageEffects
- AngledDamage
- Interaction
