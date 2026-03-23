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
