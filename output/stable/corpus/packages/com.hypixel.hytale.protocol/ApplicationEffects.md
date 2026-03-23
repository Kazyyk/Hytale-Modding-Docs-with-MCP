# ApplicationEffects

Type: class | Package: com.hypixel.hytale.protocol

public class ApplicationEffects

Comprehensive effect configuration applied when an entity effect is active. Controls visual tints, animations, particles, screen effects, sound, model VFX, movement modifications, mouse sensitivity, and ability restrictions.

## Fields

- Color entityBottomTint
- Color entityTopTint
- String entityAnimationId
- ModelParticle`[] particles
- ModelParticle`[] firstPersonParticles
- String screenEffect
- float horizontalSpeedMultiplier
- int soundEventIndexLocal
- int soundEventIndexWorld
- String modelVFXId
- MovementEffects movementEffects
- float mouseSensitivityAdjustmentTarget
- float mouseSensitivityAdjustmentDuration
- AbilityEffects abilityEffects

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 2
- FIXED_BLOCK_SIZE | 35
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 59
- MAX_SIZE | 1,677,721,600

Binary layout: 2 null-bit bytes + 35 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ApplicationEffects deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ApplicationEffects` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ApplicationEffects` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ApplicationEffects` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- Color
- AbilityEffects
- EntityEffect

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static ApplicationEffects deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ApplicationEffects clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public Color entityBottomTint
public Color entityTopTint
public String entityAnimationId
public ModelParticle[] particles
public ModelParticle[] firstPersonParticles
public String screenEffect
public float horizontalSpeedMultiplier
public int soundEventIndexLocal
public int soundEventIndexWorld
public String modelVFXId
public MovementEffects movementEffects
public float mouseSensitivityAdjustmentTarget
public float mouseSensitivityAdjustmentDuration
public AbilityEffects abilityEffects
