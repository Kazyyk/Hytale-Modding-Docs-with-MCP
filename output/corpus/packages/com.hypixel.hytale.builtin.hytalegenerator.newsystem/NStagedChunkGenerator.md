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
