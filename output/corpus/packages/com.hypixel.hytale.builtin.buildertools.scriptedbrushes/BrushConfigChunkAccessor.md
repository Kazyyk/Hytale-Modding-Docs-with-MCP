# BrushConfigChunkAccessor

Type: class | Package: com.hypixel.hytale.builtin.buildertools.scriptedbrushes | Extends: LocalCachedChunkAccessor

public class BrushConfigChunkAccessor extends LocalCachedChunkAccessor

Chunk accessor specialized for scripted brush operations. Overrides block reads to first check the edit store's "after" state (current operation's modifications), falling back to the "before" state and then the actual world chunk data.

## Static Methods


public static BrushConfigChunkAccessor atWorldCoords(BrushConfigEditStore editOperation, ChunkAccessor<WorldChunk> delegate, int centerX, int centerZ, int blockRadius)


public static BrushConfigChunkAccessor atChunkCoords(BrushConfigEditStore editOperation, ChunkAccessor<WorldChunk> delegate, int centerX, int centerZ, int chunkRadius)

## Instance Methods


public int getBlock(@Nonnull Vector3i pos)


public int getBlock(int x, int y, int z)


public int getBlockIgnoringHistory(@Nonnull Vector3i pos)

Returns the block from the before-state or the world, ignoring the current operation's edits.


public int getBlockIgnoringHistory(int x, int y, int z)


public int getFluidId(int x, int y, int z)
