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

Known subclasses: WieldingInteraction, WieldingInteraction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ChargingInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ChargingInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public int failed
public boolean allowIndefiniteHold
public boolean displayProgress
public boolean cancelOnOtherClick
public boolean failOnDamage
public float mouseSensitivityAdjustmentTarget
public float mouseSensitivityAdjustmentDuration
public Map<Float,Integer> chargedNext
public Map<InteractionType,Integer> forks
public ChargingDelay chargingDelay
