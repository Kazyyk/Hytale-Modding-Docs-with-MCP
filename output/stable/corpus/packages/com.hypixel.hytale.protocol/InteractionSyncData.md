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
