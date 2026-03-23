# NStagedChunkGenerator

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem | Implements: ChunkGenerator

public class NStagedChunkGenerator implements ChunkGenerator

Multi-stage chunk generator that processes buffer bundles through configurable generation stages with concurrent execution and material/entity/tint/environment transfer.

## Constants

- int WORLD_MIN_Y_BUFFER_GRID
- int WORLD_MAX_Y_BUFFER_GRID
- int WORLD_HEIGHT_BUFFER_GRID
- Bounds3i CHUNK_BOUNDS_BUFFER_GRID
- Bounds3i SINGLE_BUFFER_TILE_BOUNDS_BUFFER_GRID

## Key Methods

- public GeneratedChunk generate(@Nonnull ChunkRequest.Arguments arguments)
- public PositionProvider getSpawnPositions()
- public NStagedChunkGenerator build()
- public NStagedChunkGenerator.Builder withStats(@Nonnull String statsHeader, @Nonnull Set<Integer> statsCheckpoints)
- public NStagedChunkGenerator.Builder withSpawnPositions(@Nonnull PositionProvider spawnPositions)
- public NStagedChunkGenerator.Builder withConcurrentExecutor(@Nonnull ExecutorService executor, @Nonnull WorkerIndexer workerIndexer)
- public NStagedChunkGenerator.Builder withMaterialCache(@Nonnull MaterialCache materialCache)
- public NStagedChunkGenerator.Builder withBufferCapacity(double factor, double targetViewDistance, double targetPlayerCount)
- public NStagedChunkGenerator.Builder appendStage(@Nonnull NStage stage)

Also in this package: Builder, GridUtils, NViewport, TerrainDensityProvider

Complete API:
  public GeneratedChunk generate(ChunkRequest.Arguments arguments)
  public PositionProvider getSpawnPositions()
  private Map<NBufferType,NBufferBundle.Access> createAccesses(Bounds3i localChunkBounds_bufferGrid)
  private Runnable createTileTask(int stageIndex, Vector3i position_bufferTileGrid, WorkerIndexer.Id workerId, Map<NBufferType,NBufferBundle.Access> accessMap)
  private CompletableFuture<Void> transferBlockStates(ChunkRequest.Arguments arguments, GeneratedBlockStateChunk blockStateChunk, TimeInstrument.Probe transfer_timeProbe)
  private CompletableFuture<Void> transferMaterials(ChunkRequest.Arguments arguments, GeneratedChunk generatedChunk, TimeInstrument.Probe transfer_timeProbe)
  private CompletableFuture<Void> transferTints(ChunkRequest.Arguments arguments, GeneratedChunk generatedChunk, TimeInstrument.Probe transfer_timeProbe)
  private CompletableFuture<Void> transferEnvironments(ChunkRequest.Arguments arguments, GeneratedChunk generatedChunk, TimeInstrument.Probe transfer_timeProbe)
  private CompletableFuture<Void> transferEntities(ChunkRequest.Arguments arguments, GeneratedChunk generatedChunk, TimeInstrument.Probe transfer_timeProbe)
  private String createBufferRequestCacheReport()
  private String createContextDependencyReport(int indentation)
  private static void setSupport(GeneratedChunk chunk, int x, int y, int z, int blockId, int supportValue)
  private static void setBoundsToWorldHeight_bufferGrid(Bounds3i bounds_bufferGrid)
  private static boolean isColumnCached(NBufferBundle.Access access, Vector3i position_bufferGrid, int stageIndex)
  private static void updateTrackersForColumn(int stageIndex, NBufferBundle.Access.View access, Vector3i position_bufferGrid)

Fields:
public static final int WORLD_MIN_Y_BUFFER_GRID
public static final int WORLD_MAX_Y_BUFFER_GRID
public static final int WORLD_HEIGHT_BUFFER_GRID
public static final Bounds3i CHUNK_BOUNDS_BUFFER_GRID
public static final Bounds3i SINGLE_BUFFER_TILE_BOUNDS_BUFFER_GRID
private NBufferType materialOutput_bufferType
private NBufferType tintOutput_bufferType
private NBufferType environmentOutput_bufferType
private NBufferType entityOutput_bufferType
private NStage[] stages
private Bounds3i[] stagesOutputBounds_bufferGrid
private NBufferBundle bufferBundle
private ExecutorService concurrentExecutor
private MaterialCache materialCache
private WorkerIndexer workerIndexer
private PositionProvider spawnPositions
private TimeInstrument timeInstrument
private Set<Integer> statsCheckpoints
private int generatedChunkCount
private long totalCacheBufferRequests
private long missedCacheBufferRequests
