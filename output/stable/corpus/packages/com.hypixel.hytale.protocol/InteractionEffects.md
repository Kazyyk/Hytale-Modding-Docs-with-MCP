# InteractionEffects

Type: class | Package: com.hypixel.hytale.protocol

public class InteractionEffects

Visual and audio effects triggered during interaction execution: particles, trails, animations, camera shake, movement, and sound.

## Fields

- ModelParticle`[] particles
- ModelParticle`[] firstPersonParticles
- int worldSoundEventIndex
- int localSoundEventIndex
- ModelTrail`[] trails
- boolean waitForAnimationToFinish
- String itemPlayerAnimationsId
- String itemAnimationId
- boolean clearAnimationOnFinish
- boolean clearSoundEventOnFinish
- CameraShakeEffect cameraShake
- MovementEffects movementEffects
- float startDelay

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 32
- VARIABLE_FIELD_COUNT | 5
- VARIABLE_BLOCK_START | 52
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 32 bytes of fixed fields + 5 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InteractionEffects deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InteractionEffects` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InteractionEffects` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `InteractionEffects` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- CameraShake
- Interaction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static InteractionEffects deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public InteractionEffects clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public ModelParticle[] particles
public ModelParticle[] firstPersonParticles
public int worldSoundEventIndex
public int localSoundEventIndex
public ModelTrail[] trails
public boolean waitForAnimationToFinish
public String itemPlayerAnimationsId
public String itemAnimationId
public boolean clearAnimationOnFinish
public boolean clearSoundEventOnFinish
public CameraShakeEffect cameraShake
public MovementEffects movementEffects
public float startDelay
