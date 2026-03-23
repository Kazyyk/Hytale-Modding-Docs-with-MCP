# PhysicsConfig

Type: class | Package: com.hypixel.hytale.protocol

public class PhysicsConfig

Protocol data structure in the Movement/Physics group.

## Fields

- PhysicsType type
- double density
- double gravity
- double bounciness
- int bounceCount
- double bounceLimit
- boolean sticksVertically
- boolean computeYaw
- boolean computePitch
- RotationMode rotationMode
- double moveOutOfSolidSpeed
- double terminalVelocityAir
- double densityAir
- double terminalVelocityWater
- double densityWater
- double hitWaterImpulseLoss
- double rotationForce
- float speedRotationFactor
- double swimmingDampingFactor
- boolean allowRolling
- double rollingFrictionFactor
- float rollingSpeed

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 0
- FIXED_BLOCK_SIZE | 122
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 122
- MAX_SIZE | 122

Binary layout: 122 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static PhysicsConfig deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `PhysicsConfig` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `PhysicsConfig` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `PhysicsConfig` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- PhysicsType
- RotationMode

Known implementors: StandardPhysicsConfig

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static PhysicsConfig deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public PhysicsConfig clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public PhysicsType type
public double density
public double gravity
public double bounciness
public int bounceCount
public double bounceLimit
public boolean sticksVertically
public boolean computeYaw
public boolean computePitch
public RotationMode rotationMode
public double moveOutOfSolidSpeed
public double terminalVelocityAir
public double densityAir
public double terminalVelocityWater
public double densityWater
public double hitWaterImpulseLoss
public double rotationForce
public float speedRotationFactor
public double swimmingDampingFactor
public boolean allowRolling
public double rollingFrictionFactor
public float rollingSpeed
