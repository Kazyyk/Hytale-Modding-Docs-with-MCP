# BlockChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk | Implements: Component<ChunkStore>

public class BlockChunk implements Component<ChunkStore>

ECS component storing the block data for a chunk column: block IDs across 10 vertical sections (32x32x32 each, totaling 32x320x32), heightmap, tint map, environment data, ticking block tracking, and lighting data caches. Serialized via a versioned binary codec (current version 3).

## Constants

- VERSION | int | 3 | Current serialization version.
- SEND_LOCAL_LIGHTING_DATA | boolean | true | Whether local lighting is sent to clients.
- SEND_GLOBAL_LIGHTING_DATA | boolean | false | Whether global lighting is sent to clients.

## Static Methods


public static ComponentType<ChunkStore, BlockChunk> getComponentType()

## Constructors


public BlockChunk(int x, int z)

Creates a new block chunk at the given chunk coordinates with default palettes and sections.

## Instance Methods -- Position


public long getIndex()


public int getX()


public int getZ()

## Instance Methods -- Block Data


public int getBlock(int x, int y, int z)

Returns the block type index at chunk-local coordinates. Returns 0 for out-of-range Y.


public boolean setBlock(int x, int y, int z, int blockId, int rotation, int filler)

Sets a block in the section palette, invalidates the section cache, and marks needs-saving.


public boolean contains(int blockId)


public int count(int blockId)


@Nonnull
public Int2IntMap blockCounts()

Returns a map of block type index to count across all sections.


@Nonnull
public IntSet blocks()

Returns the set of distinct block type indexes present in this chunk.

## Instance Methods -- Heightmap


public short getHeight(int x, int z)


public void setHeight(int x, int z, short height)


public short updateHeight(int x, int z)

Recalculates the heightmap entry by scanning downward for the first non-transparent block.

## Instance Methods -- Environment & Tint


public int getEnvironment(int x, int y, int z)


public void setEnvironment(int x, int y, int z, int environment)


public int getTint(int x, int z)


public void setTint(int x, int z, int tint)

## Instance Methods -- Lighting


public byte getRedBlockLight(int x, int y, int z)


public byte getGreenBlockLight(int x, int y, int z)


public byte getBlueBlockLight(int x, int y, int z)


public short getBlockLight(int x, int y, int z)


public byte getSkyLight(int x, int y, int z)

## Instance Methods -- Sections


@Deprecated(forRemoval = false)
public BlockSection getSectionAtBlockY(int y)


@Deprecated(forRemoval = false)
public BlockSection getSectionAtIndex(int index)


public int getSectionCount()

## Instance Methods -- Ticking


public boolean setTicking(int x, int y, int z, boolean ticking)


public boolean isTicking(int x, int y, int z)


public int getTickingBlocksCount()


public <T, V> int forEachTicking(T t, V v, ObjectPositionBlockFunction<T, V, BlockTickStrategy> acceptor)

Iterates over all ticking blocks, invoking the acceptor for each.

## Inner Classes

- `LoadBlockChunkPacketSystem` -- Sends heightmap, tintmap, environments, and section data packets to clients on chunk load.

Also in this package: AbstractCachedAccessor, BlockComponentChunk, BlockComponentChunkLoadingSystem, BlockRotationUtil, ChunkColumn, ChunkFlag, EntityChunk, EntityChunkLoadingSystem, LoadBlockChunkPacketSystem, LoadBlockComponentPacketSystem, UnloadBlockComponentPacketSystem, WorldChunk

Complete API:
  public static ComponentType<ChunkStore,BlockChunk> getComponentType()
  public void load(int x, int z)
  public Component<ChunkStore> clone()
  public Component<ChunkStore> cloneSerializable()
  public long getIndex()
  public int getX()
  public int getZ()
  public EnvironmentChunk getEnvironmentChunk()
  public void setEnvironmentChunk(EnvironmentChunk environmentChunk)
  public short getHeight(int x, int z)
  public short getHeight(int index)
  public void setHeight(int x, int z, short height)
  public void updateHeightmap()
  public short updateHeight(int x, int z)
  public short updateHeight(int x, int z, short startY)
  public void loadFromHolder(Holder<ChunkStore> holder)
  public BlockSection getSectionAtIndex(int index)
  public BlockSection getSectionAtBlockY(int y)
  public BlockSection[] getChunkSections()
  public int getSectionCount()
  public int getTint(int x, int z)
  public void setTint(int x, int z, int tint)
  public int getEnvironment(Vector3d position)
  public int getEnvironment(Vector3i position)
  public int getEnvironment(int x, int y, int z)
  public EnvironmentColumn getEnvironmentColumn(int x, int z)
  public void setEnvironment(int x, int y, int z, int environment)
  public byte getRedBlockLight(int x, int y, int z)
  public byte getGreenBlockLight(int x, int y, int z)
  public byte getBlueBlockLight(int x, int y, int z)
  public short getBlockLight(int x, int y, int z)
  public byte getSkyLight(int x, int y, int z)
  public byte getBlockLightIntensity(int x, int y, int z)
  public int getBlock(int x, int y, int z)
  public boolean setBlock(int x, int y, int z, int blockId, int rotation, int filler)
  public boolean contains(int blockId)
  public int count(int blockId)
  public Int2IntMap blockCounts()
  public IntSet blocks()
  public int blockCount()
  public void preTick(Instant gameTime)
  public int forEachTicking(T t, V v, ObjectPositionBlockFunction<T,V,BlockTickStrategy> acceptor)
  public void mergeTickingBlocks()
  public boolean setTicking(int x, int y, int z, boolean ticking)
  public boolean isTicking(int x, int y, int z)
  public int getTickingBlocksCount()
  public boolean setNeighbourBlocksTicking(int x, int y, int z)
  public void markNeedsSaving()
  public boolean getNeedsSaving()
  public boolean consumeNeedsSaving()
  public void markNeedsPhysics()
  public boolean consumeNeedsPhysics()
  public void invalidateChunkSection(int sectionIndex)
  public BlockSection[] takeMigratedSections()
  public BlockSection[] getMigratedSections()
  private byte[] serialize(ExtraInfo extraInfo)
  private void deserialize(byte[] bytes, ExtraInfo extraInfo)
  private CompletableFuture<CachedPacket<SetChunkHeightmap>> getCachedHeightmapPacket()
  private CompletableFuture<CachedPacket<SetChunkTintmap>> getCachedTintsPacket()
  private CompletableFuture<CachedPacket<SetChunkEnvironments>> getCachedEnvironmentsPacket()

Fields:
public static final int VERSION
public static final BuilderCodec<BlockChunk> CODEC
private static final HytaleLogger LOGGER
public static boolean SEND_LOCAL_LIGHTING_DATA
public static boolean SEND_GLOBAL_LIGHTING_DATA
private long index
private int x
private int z
private final ShortBytePalette height
private final IntBytePalette tint
private BlockSection[] chunkSections
private BlockSection[] migratedChunkSections
private EnvironmentChunk environments
private boolean needsPhysics
private boolean needsSaving
private transient SoftReference<CompletableFuture<CachedPacket<SetChunkHeightmap>>> cachedHeightmapPacket
private transient SoftReference<CompletableFuture<CachedPacket<SetChunkTintmap>>> cachedTintmapPacket
private transient SoftReference<CompletableFuture<CachedPacket<SetChunkEnvironments>>> cachedEnvironmentsPacket
