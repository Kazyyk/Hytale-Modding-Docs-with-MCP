# BlockCounter

Type: class | Package: com.hypixel.hytale.server.core.modules.interaction.blocktrack | Implements: Resource<ChunkStore>

public class BlockCounter implements Resource<ChunkStore>

Implementation of `Resource<ChunkStore>`.

## Constructors

- BlockCounter() | Creates a new BlockCounter instance.
- BlockCounter(Object2IntMap<String> blockPlacementCounts) | Creates a new BlockCounter instance.

## Methods

- getResourceType() | ResourceType<ChunkStore, BlockCounter> | static public method.
- trackBlock(String blockName) | void | public method.
- untrackBlock(String blockName) | void | public method.
- getBlockPlacementCount(String blockName) | int | public method.
- clone() | Resource<ChunkStore> | public method.
