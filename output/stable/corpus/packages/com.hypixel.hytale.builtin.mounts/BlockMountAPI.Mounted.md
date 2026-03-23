# BlockMountAPI.Mounted

Type: record | Package: com.hypixel.hytale.builtin.mounts | Implements: BlockMountAPI.BlockMountResult

public record Mounted(BlockType blockType, MountedComponent component) implements BlockMountAPI.BlockMountResult

Success result returned by BlockMountAPI.mountOnBlock() when an entity is successfully seated on a block.

## Record Components

- blockType | BlockType | The block type the entity was mounted onto.
- component | MountedComponent | The `MountedComponent` that was added to the entity.

## Related Types

- BlockMountAPI -- enclosing class
- BlockMountAPI.BlockMountResult -- sealed parent interface
