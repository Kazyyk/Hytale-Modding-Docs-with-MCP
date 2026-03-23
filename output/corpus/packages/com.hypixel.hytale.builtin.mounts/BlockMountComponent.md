# BlockMountComponent

Type: class | Package: com.hypixel.hytale.builtin.mounts | Implements: Component<ChunkStore>

public class BlockMountComponent implements Component<ChunkStore>

A `ChunkStore` ECS component that tracks entities seated on a block-based mount point (seat or bed). Maintains bidirectional maps between `BlockMountPoint` instances and seated entity references. Created by BlockMountAPI.mountOnBlock() when an entity first sits on a block.

## Component Type


public static ComponentType<ChunkStore, BlockMountComponent> getComponentType()

Delegates to `MountPlugin.getInstance().getBlockMountComponentType()`.

## Constructors


public BlockMountComponent()

Default constructor.


public BlockMountComponent(BlockMountType type, Vector3i blockPos, BlockType expectedBlockType, int expectedRotation)

Constructs a component with the mount type, block position, expected block type, and rotation index.

## Accessors

- getType() | BlockMountType | The mount type (`Seat` or `Bed`).
- getBlockPos() | Vector3i | The world-space block position.
- getExpectedBlockType() | BlockType | The block type at mount creation time.
- getExpectedRotation() | int | The block rotation index at mount creation time.

## Seat Management

### isDead


public boolean isDead()

Returns `true` if no entities are seated after cleaning invalid references. Used by MountSystems.TrackedMounted to determine whether the component should be removed.

### putSeatedEntity


public void putSeatedEntity(@Nonnull BlockMountPoint mountPoint, @Nonnull Ref<EntityStore> seatedEntity)

Records that the given entity is seated at the specified mount point.

### removeSeatedEntity


public void removeSeatedEntity(@Nonnull Ref<EntityStore> seatedEntity)

Removes the entity from the seat tracking maps.

### getSeatBlockBySeatedEntity


@Nullable
public BlockMountPoint getSeatBlockBySeatedEntity(Ref<EntityStore> seatedEntity)

Returns the `BlockMountPoint` occupied by the given entity, or `null`.

### getSeatedEntities


@Nonnull
public Collection<? extends Ref<EntityStore>> getSeatedEntities()

Returns all currently seated entity references.

### findAvailableSeat


@Nullable
public BlockMountPoint findAvailableSeat(@Nonnull Vector3i targetBlock, @Nonnull BlockMountPoint[] choices, @Nonnull Vector3f whereWasClicked)

Finds the closest unoccupied mount point to the click position. Cleans invalid references first, then iterates all choices computing squared distance to `whereWasClicked` in world space. Returns the closest available seat, or `null` if all are occupied.

## Clone


@Nonnull
@Override
public Component<ChunkStore> clone()

Returns a shallow copy with cloned seat maps.

## Related Types

- BlockMountAPI -- creates and populates this component
- MountSystems.RemoveBlockSeat -- dismounts seated entities when this chunk entity is removed
- MountSystems.TrackerUpdate -- reads this component for network updates
