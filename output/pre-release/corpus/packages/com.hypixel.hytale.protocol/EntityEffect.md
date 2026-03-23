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

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static EntityEffect deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public EntityEffect clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public String id
public String name
public ApplicationEffects applicationEffects
public int worldRemovalSoundEventIndex
public int localRemovalSoundEventIndex
public ModelOverride modelOverride
public float duration
public boolean infinite
public boolean debuff
public String statusEffectIcon
public OverlapBehavior overlapBehavior
public double damageCalculatorCooldown
public Map<Integer,Float> statModifiers
public ValueType valueType
