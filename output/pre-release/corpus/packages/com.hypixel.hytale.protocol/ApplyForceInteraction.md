# ApplyForceInteraction

Type: class | Package: com.hypixel.hytale.protocol | Extends: SimpleInteraction

public class ApplyForceInteraction extends SimpleInteraction

An interaction (type ID 26) that applies directional forces to entities over a duration, optionally waiting for ground contact. Extends SimpleInteraction.

## Fields

- VelocityConfig velocityConfig
- ChangeVelocityType changeVelocityType
- AppliedForce`[] forces
- float duration
- FloatRange verticalClamp
- boolean waitForGround
- boolean waitForCollision
- float groundCheckDelay
- float collisionCheckDelay
- int groundNext
- int collisionNext
- float raycastDistance
- float raycastHeightOffset
- RaycastMode raycastMode

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 80
- VARIABLE_FIELD_COUNT | 6
- VARIABLE_BLOCK_START | 104
- MAX_SIZE | 1,677,721,600

Binary layout: 1 null-bit byte + 80 bytes of fixed fields + 6 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ApplyForceInteraction deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ApplyForceInteraction` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ApplyForceInteraction` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ApplyForceInteraction` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- AppliedForce
- ApplyForceState
- Interaction

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static ApplyForceInteraction deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public int serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ApplyForceInteraction clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public VelocityConfig velocityConfig
public ChangeVelocityType changeVelocityType
public AppliedForce[] forces
public float duration
public FloatRange verticalClamp
public boolean waitForGround
public boolean waitForCollision
public float groundCheckDelay
public float collisionCheckDelay
public int groundNext
public int collisionNext
public float raycastDistance
public float raycastHeightOffset
public RaycastMode raycastMode
