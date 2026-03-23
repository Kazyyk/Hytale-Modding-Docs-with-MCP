# Viewport

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class Viewport

Represents a region of chunks that can be refreshed during world generation. Computes the set of affected chunk indices from voxel-grid bounds and provides an async `refresh()` method that requests chunk references with priority 9.

Also in this package: ArrayUtil, BiOperation3i, BlockMask, EntityPlacementData, FutureUtils, GridUtils, LoggerUtil, MaterialSet, NakedOperation3i, Operation3i, PropRuntime, Registry, Retriever, ReusableList, VectorUtil, WeightedMap

Complete API:
  public void refresh()

Fields:
private final World world
private final CommandSender sender
private final LongSet affectedChunkIndices
