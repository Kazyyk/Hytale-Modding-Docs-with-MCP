# BlockMountAPI

Type: class | Package: com.hypixel.hytale.builtin.mounts

public final class BlockMountAPI

Static utility class for mounting entities onto block-based seats and beds. The class has a private constructor and exposes a single static method. It resolves the target block's type, locates an available mount point, positions the entity, and attaches a MountedComponent to the entity.

## Methods

### mountOnBlock


@Nonnull
public static BlockMountAPI.BlockMountResult mountOnBlock(
    @Nonnull Ref<EntityStore> entity, @Nonnull CommandBuffer<EntityStore> commandBuffer, @Nonnull Vector3i targetBlock, @Nonnull Vector3f interactPos
)

Attempts to mount the given entity onto a block at the specified position. The method:

1. Checks the entity does not already have a `MountedComponent` (returns `ALREADY_MOUNTED` if so).
2. Resolves the world chunk and chunk reference for the target block.
3. Looks up the `BlockType` at the target position.
4. Determines whether the block has seats or beds; selects the corresponding `BlockMountType`.
5. Ensures a BlockMountComponent exists on the chunk store for the block.
6. Calls `findAvailableSeat()` to pick the closest unoccupied mount point to the interaction position.
7. Positions the entity's `TransformComponent` at the mount point's world-space position and rotation.
8. Adds a `MountedComponent` to the entity and records the seated entity on the `BlockMountComponent`.

Returns a BlockMountResult: either a Mounted record on success or a DidNotMount enum value on failure.

## Inner Types

- BlockMountResult -- sealed result interface
- DidNotMount -- failure enum
- Mounted -- success record

## Related Types

- BlockMountComponent -- chunk-store component tracking block seats
- MountedComponent -- entity-store component marking an entity as mounted
- SeatingInteraction -- block interaction that calls `mountOnBlock`
