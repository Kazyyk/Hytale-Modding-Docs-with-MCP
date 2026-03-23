# ServerCameraSettings

Type: class | Package: com.hypixel.hytale.protocol

public class ServerCameraSettings

Protocol data structure in the Camera/View group.

## Fields

- float positionLerpSpeed
- float rotationLerpSpeed
- float distance
- float speedModifier
- boolean allowPitchControls
- boolean displayCursor
- boolean displayReticle
- MouseInputTargetType mouseInputTargetType
- boolean sendMouseMotion
- boolean skipCharacterPhysics
- boolean isFirstPerson
- MovementForceRotationType movementForceRotationType
- Direction movementForceRotation
- AttachedToType attachedToType
- int attachedToEntityId
- boolean eyeOffset
- PositionDistanceOffsetType positionDistanceOffsetType
- Position positionOffset
- Direction rotationOffset
- PositionType positionType
- Position position
- RotationType rotationType
- Direction rotation
- CanMoveType canMoveType
- ApplyMovementType applyMovementType
- Vector3f movementMultiplier
- ApplyLookType applyLookType
- Vector2f lookMultiplier
- MouseInputType mouseInputType
- Vector3f planeNormal

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 1
- FIXED_BLOCK_SIZE | 154
- VARIABLE_FIELD_COUNT | 0
- VARIABLE_BLOCK_START | 154
- MAX_SIZE | 154

Binary layout: 1 null-bit byte + 154 bytes of fixed fields. All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static ServerCameraSettings deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `ServerCameraSettings` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `ServerCameraSettings` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `ServerCameraSettings` into the given buffer.


@Override
public int computeSize()

Returns the serialized size in bytes.

## Related Types

- ApplyLookType
- ApplyMovementType
- AttachedToType
- CanMoveType
- Direction
- MouseInputTargetType
- MouseInputType
- MovementForceRotationType
- Position
- PositionDistanceOffsetType
- PositionType
- RotationType
- Vector2f
- Vector3f

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 378 more)

Complete API:
  public static ServerCameraSettings deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public ServerCameraSettings clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public float positionLerpSpeed
public float rotationLerpSpeed
public float distance
public float speedModifier
public boolean allowPitchControls
public boolean displayCursor
public boolean displayReticle
public MouseInputTargetType mouseInputTargetType
public boolean sendMouseMotion
public boolean skipCharacterPhysics
public boolean isFirstPerson
public MovementForceRotationType movementForceRotationType
public Direction movementForceRotation
public AttachedToType attachedToType
public int attachedToEntityId
public boolean eyeOffset
public PositionDistanceOffsetType positionDistanceOffsetType
public Position positionOffset
public Direction rotationOffset
public PositionType positionType
public Position position
public RotationType rotationType
public Direction rotation
public CanMoveType canMoveType
public ApplyMovementType applyMovementType
public Vector3f movementMultiplier
public ApplyLookType applyLookType
public Vector2f lookMultiplier
public MouseInputType mouseInputType
public Vector3f planeNormal
