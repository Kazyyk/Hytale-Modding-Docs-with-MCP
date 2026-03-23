# BlockMountAPI.DidNotMount

Type: enum | Package: com.hypixel.hytale.builtin.mounts | Implements: BlockMountAPI.BlockMountResult

public static enum DidNotMount implements BlockMountAPI.BlockMountResult

Enum of failure reasons returned by BlockMountAPI.mountOnBlock() when a mount attempt does not succeed.

## Enum Constants

- CHUNK_NOT_FOUND | The world chunk containing the target block is not in memory.
- CHUNK_REF_NOT_FOUND | The chunk reference or `BlockComponentChunk` could not be resolved.
- BLOCK_REF_NOT_FOUND | A new chunk-store entity reference for the block could not be created.
- INVALID_BLOCK | The `BlockType` at the target position is null.
- ALREADY_MOUNTED | The entity already has a `MountedComponent`.
- UNKNOWN_BLOCKMOUNT_TYPE | The block has neither seats nor beds configured.
- NO_MOUNT_POINT_FOUND | No available (unoccupied) mount point exists on the block.

## Related Types

- BlockMountAPI -- enclosing class
- BlockMountAPI.BlockMountResult -- sealed parent interface
