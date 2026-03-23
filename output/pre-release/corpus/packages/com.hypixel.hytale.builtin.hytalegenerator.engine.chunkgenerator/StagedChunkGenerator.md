# StagedChunkGenerator

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator | Implements: ChunkGenerator

public class StagedChunkGenerator implements ChunkGenerator

The primary ChunkGenerator implementation. Generates chunks by executing a sequence of `Stage` instances (biome, terrain, environment, tint, prop) against a shared `BufferBundle`. Each stage reads from and writes to typed buffer grids. Stages are executed concurrently using a `WorkerIndexer` and `ExecutorService`. After all stages complete, buffer contents are transferred into a `GeneratedChunk` (blocks, block states, tints, environments, entities) in parallel. Supports a buffer caching system that skips re-generation of buffer columns already computed for a given stage. Constructed via StagedChunkGenerator.Builder.

## Inner Types

- StagedChunkGenerator.Builder | class | Fluent builder for assembling a StagedChunkGenerator

## Fields

- public static final int WORLD_MIN_Y_BUFFER_GRID
- public static final int WORLD_MAX_Y_BUFFER_GRID
- public static final int WORLD_HEIGHT_BUFFER_GRID
- @Nonnull public static final Bounds3i CHUNK_BOUNDS_BUFFER_GRID
- @Nonnull public static final Bounds3i SINGLE_BUFFER_TILE_BOUNDS_BUFFER_GRID
- private BufferType materialOutput_bufferType
- private BufferType tintOutput_bufferType
- private BufferType environmentOutput_bufferType
- private BufferType entityOutput_bufferType
- private Stage[] stages
- private Bounds3i[] stagesOutputBounds_bufferGrid
- private BufferBundle bufferBundle
- private ExecutorService concurrentExecutor
- private MaterialCache materialCache
- private WorkerIndexer workerIndexer
- private PositionProvider spawnPositions
- private TimeInstrument timeInstrument
- private Set<Integer> statsCheckpoints
- private int generatedChunkCount
- private long totalCacheBufferRequests
- private long missedCacheBufferRequests

## Constructors

- private StagedChunkGenerator()

## Methods

- @Nullable @Override public GeneratedChunk generate(@Nonnull ChunkRequest.Arguments arguments)
- @Override public PositionProvider getSpawnPositions()
- @Nonnull private Map<BufferType, BufferBundle.Access> createAccesses(@Nonnull Bounds3i localChunkBounds_bufferGrid)
- @Nonnull private Runnable createTileTask(int stageIndex, @Nonnull Vector3i position_bufferTileGrid, @Nonnull WorkerIndexer.Id workerId, @Nonnull Map<BufferType, BufferBundle.Access> accessMap)
- @Nonnull private CompletableFuture<Void> transferBlockStates(@Nonnull ChunkRequest.Arguments arguments, @Nonnull GeneratedBlockStateChunk blockStateChunk, @Nonnull TimeInstrument.Probe transfer_timeProbe)
- @Nonnull private CompletableFuture<Void> transferMaterials(@Nonnull ChunkRequest.Arguments arguments, @Nonnull GeneratedChunk generatedChunk, @Nonnull TimeInstrument.Probe transfer_timeProbe)
- @Nonnull private CompletableFuture<Void> transferTints(@Nonnull ChunkRequest.Arguments arguments, @Nonnull GeneratedChunk generatedChunk, @Nonnull TimeInstrument.Probe transfer_timeProbe)
- @Nonnull private CompletableFuture<Void> transferEnvironments(@Nonnull ChunkRequest.Arguments arguments, @Nonnull GeneratedChunk generatedChunk, @Nonnull TimeInstrument.Probe transfer_timeProbe)
- @Nonnull private CompletableFuture<Void> transferEntities(@Nonnull ChunkRequest.Arguments arguments, @Nonnull GeneratedChunk generatedChunk, @Nonnull TimeInstrument.Probe transfer_timeProbe)
- @Nonnull private String createBufferRequestCacheReport()
- @Nonnull private String createContextDependencyReport(int indentation)
- private static void setSupport(@Nonnull GeneratedChunk chunk, int x, int y, int z, int blockId, int supportValue)
- private static void setBoundsToWorldHeight_bufferGrid(@Nonnull Bounds3i bounds_bufferGrid)
- private static boolean isColumnCached(@Nonnull BufferBundle.Access access, @Nonnull Vector3i position_bufferGrid, int stageIndex)
- private static void updateTrackersForColumn(int stageIndex, @Nonnull BufferBundle.Access.View access, @Nonnull Vector3i position_bufferGrid)
