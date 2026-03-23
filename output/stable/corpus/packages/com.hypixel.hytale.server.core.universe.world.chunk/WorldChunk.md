# WorldChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk | Implements: BlockAccessor, Component<ChunkStore>

public class WorldChunk implements BlockAccessor, Component<ChunkStore>

The primary ECS component representing a loaded chunk column in the world. Wraps references to the underlying BlockChunk, BlockComponentChunk, and EntityChunk. Manages chunk lifecycle flags (via ChunkFlag), keep-alive timers, save tracking, lighting update toggles, and provides the `BlockAccessor` interface for reading/writing blocks, fluids, block states, and support values.

World height range is 0-319 (320 blocks). Chunk dimensions are 32x320x32.

## Constants

- KEEP_ALIVE_DEFAULT | int | 15 | Default keep-alive tick count before a chunk can be unloaded.

## Static Fields

- CODEC | BuilderCodec<WorldChunk> | Codec for serialization (empty builder).

## Static Methods


public static ComponentType<ChunkStore, WorldChunk> getComponentType()

Returns the ECS component type, obtained from `LegacyModule`.

## Constructors


public WorldChunk(World world, Flags<ChunkFlag> state, BlockChunk blockChunk, BlockComponentChunk blockComponentChunk, EntityChunk entityChunk)

Creates a fully initialized chunk with all sub-components.

## Instance Methods -- Flags


public boolean is(@Nonnull ChunkFlag flag)

Thread-safe check whether the given flag is set.


public boolean not(@Nonnull ChunkFlag flag)

Thread-safe check whether the given flag is not set.


public void setFlag(@Nonnull ChunkFlag flag, boolean value)

Sets a chunk flag and triggers associated lifecycle transitions (e.g., `TICKING` starts/stops ticking).


public boolean toggleFlag(@Nonnull ChunkFlag flag)

Toggles a flag and returns the new value.


public void initFlags()

Called after `START_INIT` to apply all flag-triggered behaviors and set `INIT`.

## Instance Methods -- Block Access


@Override
public int getBlock(int x, int y, int z)

Returns the block type index at the given chunk-local coordinates. Returns 0 for out-of-range Y.


@Override
public boolean setBlock(int x, int y, int z, int id, @Nonnull BlockType blockType, int rotation, int filler, int settings)

Sets a block with full control over rotation, filler, and behavior flags. Handles heightmap updates, particle events, block states, lighting invalidation, tick scheduling, filler block propagation, physics, and connected block updates.


@Nullable
@Override
public BlockState getState(int x, int y, int z)

Returns the block state at the given position, or `null` if none exists.


@Override
public void setState(int x, int y, int z, @Nullable BlockState state, boolean notify)

## Instance Methods -- Fluids (Deprecated)


@Deprecated(forRemoval = true)
public int getFluidId(int x, int y, int z)


@Deprecated(forRemoval = true)
public byte getFluidLevel(int x, int y, int z)

## Instance Methods -- Lifecycle


public void markNeedsSaving()


public boolean getNeedsSaving()

Returns `true` if this chunk or any of its sub-components need saving.


public boolean consumeNeedsSaving()

Returns and clears the needs-saving flag for this chunk and all sub-components.


public boolean isSaving()


public void setSaving(boolean saving)

## Instance Methods -- Keep Alive


public int pollKeepAlive(int pollCount)

Decrements and returns the keep-alive counter.


public void resetKeepAlive()


public boolean shouldKeepLoaded()


public void addKeepLoaded()


public void removeKeepLoaded()

## Instance Methods -- Components


@Nullable
public BlockChunk getBlockChunk()


@Nullable
public BlockComponentChunk getBlockComponentChunk()


@Nullable
public EntityChunk getEntityChunk()


public Ref<ChunkStore> getReference()


public World getWorld()


public long getIndex()


@Override
public int getX()


@Override
public int getZ()

## Related Types

- BlockChunk -- Block data, heightmap, tint, environment, and section management.
- BlockComponentChunk -- ECS entity storage for per-block components (block states).
- EntityChunk -- ECS entity storage for world entities within this chunk.
- ChunkFlag -- Lifecycle flags for chunk state management.
- ChunkColumn -- Section holder managing vertical subdivisions.

Also in this package: AbstractCachedAccessor, BlockChunk, BlockComponentChunk, BlockComponentChunkLoadingSystem, BlockRotationUtil, ChunkColumn, ChunkFlag, EntityChunk, EntityChunkLoadingSystem, LoadBlockChunkPacketSystem, LoadBlockComponentPacketSystem, UnloadBlockComponentPacketSystem

Complete API:
  public static ComponentType<ChunkStore,WorldChunk> getComponentType()
  public Holder<ChunkStore> toHolder()
  public void setReference(Ref<ChunkStore> reference)
  public Ref<ChunkStore> getReference()
  public Component<ChunkStore> clone()
  public boolean is(ChunkFlag flag)
  public boolean not(ChunkFlag flag)
  public void setFlag(ChunkFlag flag, boolean value)
  public boolean toggleFlag(ChunkFlag flag)
  public void loadFromHolder(World world, int x, int z, Holder<ChunkStore> holder)
  public void setBlockComponentChunk(BlockComponentChunk blockComponentChunk)
  public void initFlags()
  private void updateFlag(ChunkFlag flag, boolean value)
  private void startsTicking()
  private void stopsTicking()
  public BlockChunk getBlockChunk()
  public BlockComponentChunk getBlockComponentChunk()
  public EntityChunk getEntityChunk()
  public boolean shouldKeepLoaded()
  public void addKeepLoaded()
  public void removeKeepLoaded()
  public int pollKeepAlive(int pollCount)
  public void resetKeepAlive()
  public int pollActiveTimer(int pollCount)
  public void resetActiveTimer()
  public ChunkAccessor getChunkAccessor()
  public int getBlock(int x, int y, int z)
  public boolean setBlock(int x, int y, int z, int id, BlockType blockType, int rotation, int filler, int settings)
  private void setBlockPhysics(int x, int y, int z, BlockType blockType)
  public int getFiller(int x, int y, int z)
  public int getRotationIndex(int x, int y, int z)
  public boolean setTicking(int x, int y, int z, boolean ticking)
  public boolean isTicking(int x, int y, int z)
  public short getHeight(int x, int z)
  public short getHeight(int index)
  public int getTint(int x, int z)
  public BlockState getState(int x, int y, int z)
  public Ref<ChunkStore> getBlockComponentEntity(int x, int y, int z)
  public Holder<ChunkStore> getBlockComponentHolder(int x, int y, int z)
  public void setState(int x, int y, int z, BlockState state, boolean notify)
  public int getFluidId(int x, int y, int z)
  public byte getFluidLevel(int x, int y, int z)
  public int getSupportValue(int x, int y, int z)
  public void setState(int x, int y, int z, Holder<ChunkStore> holder)
  public void markNeedsSaving()
  public boolean getNeedsSaving()
  public boolean consumeNeedsSaving()
  public boolean isSaving()
  public void setSaving(boolean saving)
  public long getIndex()
  public int getX()
  public int getZ()
  public void setLightingUpdatesEnabled(boolean enableLightUpdates)
  public boolean isLightingUpdatesEnabled()
  public World getWorld()
  public String toString()

Fields:
public static final int KEEP_ALIVE_DEFAULT
public static final BuilderCodec<WorldChunk> CODEC
private static final HytaleLogger LOGGER
private World world
private final StampedLock flagsLock
private final Flags<ChunkFlag> flags
private Ref<ChunkStore> reference
private BlockChunk blockChunk
private BlockComponentChunk blockComponentChunk
private EntityChunk entityChunk
private int keepAlive
private int activeTimer
private boolean needsSaving
private boolean isSaving
private final AtomicInteger keepLoaded
private boolean lightingUpdatesEnabled
public final AtomicLong chunkLightTiming
