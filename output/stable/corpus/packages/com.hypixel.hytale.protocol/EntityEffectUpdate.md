# EntityEffectUpdate

Type: class | Package: com.hypixel.hytale.protocol

public class EntityEffectUpdate

Individual entity effect state change, carrying the operation type, effect ID, remaining time, and display properties.

## Fields

- EffectOp type
- int id
- float remainingTime
- boolean infinite
- boolean debuff
- String statusEffectIcon

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 12
- VARIABLE_FIELD_COUNT | 1
- VARIABLE_BLOCK_START | 12
- MAX_SIZE | 16,384,017

Binary layout: 1 null-bit byte + 12 bytes of fixed fields + 1 variable-length field (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static EntityEffectUpdate deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `EntityEffectUpdate` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `EntityEffectUpdate` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `EntityEffectUpdate` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- EffectOp
- EntityEffect
- EntityEffectsUpdate

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static EntityEffectUpdate deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public EntityEffectUpdate clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public EffectOp type
public int id
public float remainingTime
public boolean infinite
public boolean debuff
public String statusEffectIcon
