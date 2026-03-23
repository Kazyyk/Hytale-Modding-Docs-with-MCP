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
