# EntityEffect

Type: class | Package: com.hypixel.hytale.protocol

public class EntityEffect

Complete entity effect definition including visual application effects, model overrides, duration, buff/debuff classification, overlap behavior, and value scaling.

## Fields

- String id
- String name
- ApplicationEffects applicationEffects
- int worldRemovalSoundEventIndex
- int localRemovalSoundEventIndex
- ModelOverride modelOverride
- float duration
- boolean infinite
- boolean debuff
- String statusEffectIcon
- OverlapBehavior overlapBehavior
- double damageCalculatorCooldown
- Map<``Integer``, ``Float``> statModifiers
- ValueType valueType

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 25
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 49
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 25 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EntityEffect deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EntityEffect` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EntityEffect` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EntityEffect` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ApplicationEffects
- EntityEffectUpdate
