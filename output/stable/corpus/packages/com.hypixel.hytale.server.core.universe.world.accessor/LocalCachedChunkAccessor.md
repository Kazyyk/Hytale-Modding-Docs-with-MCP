# LocalCachedChunkAccessor

Type: class | Package: com.hypixel.hytale.server.core.universe.world.accessor | Implements: OverridableChunkAccessor<WorldChunk>

public class LocalCachedChunkAccessor implements OverridableChunkAccessor<WorldChunk>

## Fields

- private final ChunkAccessor<WorldChunk> delegate
- private final int minX
- private final int minZ
- private final int length
- private final WorldChunk[] chunks

## Methods

- @Nonnull public static LocalCachedChunkAccessor atWorldCoords(ChunkAccessor<WorldChunk> delegate, int centerX, int centerZ, int blockRadius)
- @Nonnull public static LocalCachedChunkAccessor atChunkCoords(ChunkAccessor<WorldChunk> delegate, int centerX, int centerZ, int chunkRadius)
- @Nonnull public static LocalCachedChunkAccessor atChunk(ChunkAccessor<WorldChunk> delegate, @Nonnull WorldChunk chunk, int chunkRadius)
- public ChunkAccessor getDelegate()
- public int getMinX()
- public int getMinZ()
- public int getLength()
- public int getCenterX()
- public int getCenterZ()
- public void cacheChunksInRadius()
- public void overwrite(@Nonnull WorldChunk wc)
- public WorldChunk getChunkIfInMemory(long index)
- @Nullable public WorldChunk getChunkIfInMemory(int x, int z)
- public WorldChunk loadChunkIfInMemory(long index)
- @Nullable public WorldChunk getChunkIfLoaded(long index)
- @Nullable public WorldChunk getChunkIfLoaded(int x, int z)
- @Nullable public WorldChunk getChunkIfNonTicking(long index)
- public WorldChunk getChunk(long index)
- public WorldChunk getNonTickingChunk(long index)

Known subclasses: BrushConfigChunkAccessor

Also in this package: BlockAccessor, ChunkAccessor, EmptyBlockAccessor, IChunkAccessorSync, OverridableChunkAccessor, TestBlockFunction

Complete API:
  public static LocalCachedChunkAccessor atWorldCoords(ChunkAccessor<WorldChunk> delegate, int centerX, int centerZ, int blockRadius)
  public static LocalCachedChunkAccessor atChunkCoords(ChunkAccessor<WorldChunk> delegate, int centerX, int centerZ, int chunkRadius)
  public static LocalCachedChunkAccessor atChunk(ChunkAccessor<WorldChunk> delegate, WorldChunk chunk, int chunkRadius)
  public ChunkAccessor getDelegate()
  public int getMinX()
  public int getMinZ()
  public int getLength()
  public int getCenterX()
  public int getCenterZ()
  public void cacheChunksInRadius()
  public void overwrite(WorldChunk wc)
  public WorldChunk getChunkIfInMemory(long index)
  public WorldChunk getChunkIfInMemory(int x, int z)
  public WorldChunk loadChunkIfInMemory(long index)
  public WorldChunk getChunkIfLoaded(long index)
  public WorldChunk getChunkIfLoaded(int x, int z)
  public WorldChunk getChunkIfNonTicking(long index)
  public WorldChunk getChunk(long index)
  public WorldChunk getNonTickingChunk(long index)

Fields:
private final ChunkAccessor<WorldChunk> delegate
private final int minX
private final int minZ
private final int length
private final WorldChunk[] chunks
