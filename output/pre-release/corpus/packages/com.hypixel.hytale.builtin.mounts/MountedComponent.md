# MountedComponent

Type: class | Package: com.hypixel.hytale.builtin.mounts | Implements: Component<EntityStore>

public class MountedComponent implements Component<EntityStore>

An `EntityStore` ECS component that marks an entity as mounted. Supports two mount targets: another entity (for NPC/entity mounts) or a chunk-store block reference (for block seats and beds). Tracks the attachment offset, controller type, block mount type, mount start time, and a dirty flag for network synchronization.

## Component Type


public static ComponentType<EntityStore, MountedComponent> getComponentType()

Delegates to `MountPlugin.getInstance().getMountedComponentType()`.

## Constructors

### Entity mount


public MountedComponent(Ref<EntityStore> mountedToEntity, Vector3f attachmentOffset, MountController controller)

Creates a component for mounting to another entity. Records the current system time as the mount start.

### Block mount


public MountedComponent(Ref<ChunkStore> mountedToBlock, Vector3f attachmentOffset, BlockMountType blockMountType)

Creates a component for mounting to a block. Sets the controller to `MountController.BlockMount` and records the block mount type.

## Accessors

- getMountedToEntity() | @Nullable Ref<EntityStore> | The entity being ridden, or `null` for block mounts.
- getMountedToBlock() | @Nullable Ref<ChunkStore> | The block chunk reference, or `null` for entity mounts.
- getAttachmentOffset() | Vector3f | Position offset from the mount point.
- getControllerType() | MountController | The controller type determining input handling behavior.
- getBlockMountType() | BlockMountType | The block mount type (`Seat` or `Bed`), only set for block mounts.
- getMountedDurationMs() | long | Milliseconds since the mount began, computed from `System.currentTimeMillis()`.

### consumeNetworkOutdated


public boolean consumeNetworkOutdated()

Returns `true` the first time called after the component is created, then returns `false` on subsequent calls. Used by MountSystems.TrackerUpdate to determine whether a full network update is needed.

## Clone


@Nonnull
@Override
public Component<EntityStore> clone()

Returns a copy sharing the same entity reference, offset, and controller. Does not copy block mount state.

## Related Types

- MountedByComponent -- tracks passengers on the mount target
- MountSystems -- systems reacting to this component
- BlockMountAPI -- creates block-mount instances
- MountInteraction -- creates entity-mount instances
