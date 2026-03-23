# InteractionSyncData

Type: class | Package: com.hypixel.hytale.protocol

public class InteractionSyncData

Comprehensive interaction synchronization payload carrying progress, operation state, spatial data, hit entities, and force state.

## Fields

- InteractionState state
- float progress
- int operationCounter
- int rootInteraction
- int totalForks
- int entityId
- int enteredRootInteraction
- BlockPosition blockPosition
- BlockFace blockFace
- BlockRotation blockRotation
- int placedBlockId
- float chargeValue
- Map<`InteractionType`, ``Integer``> forkCounts
- int chainingIndex
- int flagIndex
- SelectedHitEntity`[] hitEntities
- Position attackerPos
- Direction attackerRot
- Position raycastHit
- float raycastDistance
- Vector3f raycastNormal
- MovementDirection movementDirection
- ApplyForceState applyForceState
- int nextLabel
- UUID generatedUUID

## Serialization Layout

- NULLABLE_BIT_FIELD_SIZE | 2
- FIXED_BLOCK_SIZE | 157
- VARIABLE_FIELD_COUNT | 2
- VARIABLE_BLOCK_START | 165
- MAX_SIZE | 237,568,175

Binary layout: 2 null-bit bytes + 157 bytes of fixed fields + 2 variable-length fields (4-byte offset slots). All multi-byte primitives use little-endian encoding.

## Methods


@Nonnull
public static InteractionSyncData deserialize(@Nonnull ByteBuf buf, int offset)

Deserializes a `InteractionSyncData` from the given buffer at the specified offset.


public static int computeBytesConsumed(@Nonnull ByteBuf buf, int offset)

Returns the total number of bytes consumed by this `InteractionSyncData` starting at the given offset.


public void serialize(@Nonnull ByteBuf buf)

Serializes this `InteractionSyncData` into the given buffer.


public int computeSize()

Returns the serialized size in bytes.

## Related Types

- InteractionState
- BlockPosition
- BlockFace
- Direction
- ApplyForceState

Also in this package: AOECircleSelector, AOECylinderSelector, AbilityEffects, AccumulationMode, ActiveAnimationsUpdate, AmbienceFX, AmbienceFXAltitude, AmbienceFXAmbientBed, AmbienceFXBlockSoundSet, AmbienceFXConditions, AmbienceFXMusic, AmbienceFXSound, AmbienceFXSoundEffect, AmbienceFXSoundPlay3D, AmbienceTransitionSpeed, AngledDamage, AngledWielding, Animation, AnimationSet, AnimationSlot (and 381 more)

Complete API:
  public static InteractionSyncData deserialize(ByteBuf buf, int offset)
  public static int computeBytesConsumed(ByteBuf buf, int offset)
  public void serialize(ByteBuf buf)
  public int computeSize()
  public static ValidationResult validateStructure(ByteBuf buffer, int offset)
  public InteractionSyncData clone()
  public boolean equals(Object obj)
  public int hashCode()

Fields:
public static final int NULLABLE_BIT_FIELD_SIZE
public static final int FIXED_BLOCK_SIZE
public static final int VARIABLE_FIELD_COUNT
public static final int VARIABLE_BLOCK_START
public static final int MAX_SIZE
public InteractionState state
public float progress
public int operationCounter
public int rootInteraction
public int totalForks
public int entityId
public int enteredRootInteraction
public BlockPosition blockPosition
public BlockFace blockFace
public BlockRotation blockRotation
public int placedBlockId
public float chargeValue
public Map<InteractionType,Integer> forkCounts
public int chainingIndex
public int flagIndex
public SelectedHitEntity[] hitEntities
public Position attackerPos
public Direction attackerRot
public Position raycastHit
public float raycastDistance
public Vector3f raycastNormal
public MovementDirection movementDirection
public ApplyForceState applyForceState
public int nextLabel
public UUID generatedUUID
