# BlockEntity

Type: class | Package: com.hypixel.hytale.server.core.modules.block

public class BlockEntity

Utility class for placing and removing block entities in the chunk store. The static `setBlockEntity` method handles both ticking and non-ticking chunk stores, dispatches `BlockReplaceEvent` to existing block entities at the target position and filler block positions, and manages `BlockStateInfo` component setup.

## Static Methods

- public static void setBlockEntity(ComponentAccessor<ChunkStore> accessor, Ref<ChunkStore> chunkRef, BlockComponentChunk componentChunk, int x, int y, int z, BlockType blockType, int rotation, Holder<ChunkStore> holder)

## Relationships

- Dispatches BlockReplaceEvent
- Works with BlockModule and `BlockComponentChunk`
