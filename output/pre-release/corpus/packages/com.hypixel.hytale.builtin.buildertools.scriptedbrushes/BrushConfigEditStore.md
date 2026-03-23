# BrushConfigEditStore

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes

public class BrushConfigEditStore

Tracks block and fluid modifications during a scripted brush execution. Maintains three selection layers: `before` (original world state), `previous` (accumulated edits from completed iterations), and `current` (edits from the active iteration). Enforces history mask, density, and block mask constraints before applying modifications.

## Constructors


public BrushConfigEditStore(LongOpenHashSet packedPlacedBlockPositions, @Nonnull BrushConfig brushConfig, World world)

## Instance Methods


public BrushConfigChunkAccessor getAccessor()


public int getOriginalBlock(int x, int y, int z)

Returns the unmodified world block at the given position.


public int getBlock(int x, int y, int z)

Returns the block considering previous edits, falling back to original.


public int getBlockIncludingCurrent(int x, int y, int z)

Returns the block considering current and previous edits.


public boolean setBlock(int x, int y, int z, int blockId)

Attempts to place a block, respecting history mask, density, and block mask. Returns true if the block was set.


public boolean setMaterial(int x, int y, int z, @Nonnull Material material)

Sets a block or fluid material at the given position.


public int getFluid(int x, int y, int z)


public BuilderToolsPlugin.BuilderState.BlocksSampleData getBlockSampledataIncludingPreviousStages(int x, int y, int z, int radius)

Samples blocks in a cubic radius to determine the most common block and most common non-air block.


public void flushCurrentEditsToPrevious()

Merges the current iteration's edits into the previous layer and resets the current layer.


public BlockSelection getAfter()

Returns the accumulated edits (previous layer).


public BlockSelection getBefore()

Returns the original world state snapshot.
