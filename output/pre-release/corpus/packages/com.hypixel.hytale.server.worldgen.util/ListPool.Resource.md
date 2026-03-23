# ListPool.Resource

Type: class | Package: com.hypixel.hytale.server.worldgen.util | Extends: it.unimi.dsi.fastutil.objects.ObjectArrayList | Implements: java.lang.AutoCloseable

public static class Resource<T> extends ObjectArrayList<T> implements AutoCloseable

Inner class of `ListPool`. An `ObjectArrayList` that implements `AutoCloseable` for use in try-with-resources blocks. On close, returns itself to the parent pool. The `toArray()` method uses the pool's empty array prototype for type safety.

Known implementors: AStarNodePoolProviderSimple, AmbienceResource, Blackboard, BlockCounter, BlockMapMarkersResource, BlockStateInfoNeedRebuild, ChunkStorage, ChunkSuppressionQueue, CombatDataPool, Data, Data, Data, Data, DisabledFluidResource, FloodFillEntryPoolProviderSimple, IndexedStorageCache, InstanceDataResource, KillTrackerResource, LocalSpawnState, PortalWorld, PrefabEditSession, QueueResource, QueueResource, QueueResource, QueueResource, QueueResource, RandomTick, ReputationDataResource, RoleChangeQueue, SaveDataResource, SnapshotWorldInfo, SortBufferProviderResource, SpatialResource, SpawnSuppressionController, SprintStaminaRegenDelay, TimeResource, VoidInvasionData, WeatherResource, WorldMarkersResource, WorldPathData, WorldSomnolence, WorldSpawnData, WorldTimeResource

Also in this package: ArrayUtli, BlockArray, BlockFluidEntry, ChunkThreadPoolExecutor, ChunkWorker, ChunkWorkerThreadFactory, ConstantNoiseProperty, Entry, ListPool, LogUtil, NoiseBlockArray, ObjectPool, ResolvedBlockArray

Complete API:
  public T[] toArray()
  public void close()

Fields:
private final ListPool<T> pool
