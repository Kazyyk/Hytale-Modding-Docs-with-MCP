# ChunkStore

Type: class | Package: com.hypixel.hytale.server.core.universe.world.storage | Implements: WorldProvider

public class ChunkStore implements WorldProvider

Central manager for chunk-level ECS storage. Owns the `Store<ChunkStore>` and a concurrent map of `ChunkLoadState` entries indexed by chunk coordinate. Handles async chunk loading, world generation, chunk addition/removal, and failure backoff. Integrates with `IChunkLoader`, `IChunkSaver`, and `IWorldGen` for pluggable storage and generation backends.

## Static Fields

- REGISTRY | ComponentRegistry<ChunkStore> | Chunk-level component registry.
- LOAD_PACKETS_DATA_QUERY_SYSTEM_TYPE | SystemType<...> | System type for load packet data queries.
- LOAD_FUTURE_PACKETS_DATA_QUERY_SYSTEM_TYPE | SystemType<...> | System type for future load packet data queries.
- UNLOAD_PACKETS_DATA_QUERY_SYSTEM_TYPE | SystemType<...> | System type for unload packet data queries.
- UNLOAD_RESOURCE | ResourceType<...> | Resource for chunk unloading state.
- SAVE_RESOURCE | ResourceType<...> | Resource for chunk saving state.
- INIT_GROUP | SystemGroup<ChunkStore> | System group for initialization.
- MAX_FAILURE_BACKOFF_NANOS | long | Maximum failure backoff: 10 seconds.
- FAILURE_BACKOFF_NANOS | long | Base backoff increment: 1 millisecond.

## Key Methods

- getWorld() | World | Returns the owning world.
- getStore() | Store<ChunkStore> | Returns the underlying ECS store.
- getLoader() | IChunkLoader | Returns the chunk loader (from storage provider).
- getSaver() | IChunkSaver | Returns the chunk saver (from storage provider).
- getGenerator() | IWorldGen | Returns the world generator (thread-safe via `StampedLock`).
- getChunkReference(long index) | Ref<ChunkStore> | Returns the chunk reference for a coordinate index, using optimistic locking.
- getChunkReferenceAsync(long index, int flags) | CompletableFuture<Ref<ChunkStore>> | Asynchronously loads/generates a chunk with configurable flags.
- getLoadedChunksCount() | int | Returns the number of loaded chunks.
- remove(Ref, RemoveReason) | void | Removes a chunk from the store.
- start(IResourceStorage) | void | Initializes the ECS store.
- shutdown() | void | Shuts down the store and clears chunks.
- waitForLoadingChunks() | void | Blocks until all pending chunk loads complete (up to 5 seconds).

## Inner Types

- ChunkLoaderSaverSetupSystem | Store system that initializes/migrates the chunk storage provider.
- ChunkStore.LoadPacketDataQuerySystem | Abstract system type for load packet queries.
- ChunkStore.LoadFuturePacketDataQuerySystem | Abstract system type for future load packet queries.
- ChunkStore.UnloadPacketDataQuerySystem | Abstract system type for unload packet queries.

Also in this package: BufferChunkLoader, BufferChunkSaver, ChunkLoadState, ChunkLoaderSaverSetupSystem, ChunkStorage, EntityStore, GetChunkFlags, IChunkLoader, IChunkSaver, LoadFuturePacketDataQuerySystem, LoadPacketDataQuerySystem, NetworkIdSystem, UUIDSystem, UnloadPacketDataQuerySystem

Complete API:
  public World getWorld()
  public Store<ChunkStore> getStore()
  public Object getStorageData()
  public IChunkLoader getLoader()
  public IChunkSaver getSaver()
  public IWorldGen getGenerator()
  public void shutdownGenerator()
  public void setGenerator(IWorldGen generator)
  public LongSet getChunkIndexes()
  public int getLoadedChunksCount()
  public int getTotalGeneratedChunksCount()
  public int getTotalLoadedChunksCount()
  public void start(IResourceStorage resourceStorage)
  public void waitForLoadingChunks()
  public void shutdown()
  private Ref<ChunkStore> add(Holder<ChunkStore> holder)
  public void remove(Ref<ChunkStore> reference, RemoveReason reason)
  public Ref<ChunkStore> getChunkReference(long index)
  public Ref<ChunkStore> getChunkSectionReference(int x, int y, int z)
  public Ref<ChunkStore> getChunkSectionReference(ComponentAccessor<ChunkStore> commandBuffer, int x, int y, int z)
  public CompletableFuture<Ref<ChunkStore>> getChunkSectionReferenceAsync(int x, int y, int z)
  public T getChunkComponent(long index, ComponentType<ChunkStore,T> componentType)
  public CompletableFuture<Ref<ChunkStore>> getChunkReferenceAsync(long index)
  public CompletableFuture<Ref<ChunkStore>> getChunkReferenceAsync(long index, int flags)
  private boolean isChunkStillNeeded(long index)
  public boolean isChunkOnBackoff(long index, long maxFailureBackoffNanos)
  private Holder<ChunkStore> preLoadChunkAsync(long index, Holder<ChunkStore> holder, boolean newlyGenerated)
  private Ref<ChunkStore> postLoadChunk(Holder<ChunkStore> holder)

Fields:
public static final HytaleLogger LOGGER
public static final MetricsRegistry<ChunkStore> METRICS_REGISTRY
public static final long MAX_FAILURE_BACKOFF_NANOS
public static final long FAILURE_BACKOFF_NANOS
public static final ComponentRegistry<ChunkStore> REGISTRY
public static final CodecKey<Holder<ChunkStore>> HOLDER_CODEC_KEY
public static final SystemType<ChunkStore,ChunkStore.LoadPacketDataQuerySystem> LOAD_PACKETS_DATA_QUERY_SYSTEM_TYPE
public static final SystemType<ChunkStore,ChunkStore.LoadFuturePacketDataQuerySystem> LOAD_FUTURE_PACKETS_DATA_QUERY_SYSTEM_TYPE
public static final SystemType<ChunkStore,ChunkStore.UnloadPacketDataQuerySystem> UNLOAD_PACKETS_DATA_QUERY_SYSTEM_TYPE
public static final ResourceType<ChunkStore,ChunkUnloadingSystem.Data> UNLOAD_RESOURCE
public static final ResourceType<ChunkStore,ChunkSavingSystems.Data> SAVE_RESOURCE
public static final SystemGroup<ChunkStore> INIT_GROUP
private final World world
private final Long2ObjectConcurrentHashMap<ChunkStore.ChunkLoadState> chunks
private Store<ChunkStore> store
private Object storageData
private IChunkLoader loader
private IChunkSaver saver
private IWorldGen generator
private CompletableFuture<Void> generatorLoaded
private final StampedLock generatorLock
private final AtomicInteger totalGeneratedChunksCount
private final AtomicInteger totalLoadedChunksCount
