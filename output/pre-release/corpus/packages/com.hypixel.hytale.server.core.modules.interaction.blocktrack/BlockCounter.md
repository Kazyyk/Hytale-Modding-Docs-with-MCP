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

Also in this package: OnAddRemove, TrackedPlacement

Complete API:
  public static ResourceType<ChunkStore,BlockCounter> getResourceType()
  public void trackBlock(String blockName)
  public void untrackBlock(String blockName)
  public int getBlockPlacementCount(String blockName)
  public Resource<ChunkStore> clone()

Fields:
public static final BuilderCodec<BlockCounter> CODEC
private Object2IntMap<String> blockPlacementCounts
