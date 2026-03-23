# StagedChunkGenerator.Builder

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.chunkgenerator

public static class StagedChunkGenerator.Builder

Fluent builder for constructing a StagedChunkGenerator. Stages are appended in execution order. The builder computes stage dependency graphs and output bounds, creates the `BufferBundle` with appropriately sized grids, and wires together the executor, material cache, and performance instrumentation.

## Fields

- @Nonnull public final ParametrizedBufferType MATERIAL_OUTPUT_BUFFER_TYPE
- @Nonnull public final ParametrizedBufferType TINT_OUTPUT_BUFFER_TYPE
- @Nonnull public final ParametrizedBufferType ENVIRONMENT_OUTPUT_BUFFER_TYPE
- @Nonnull public final BufferType ENTITY_OUTPUT_BUFFER_TYPE
- private List<Stage> stages
- private ExecutorService concurrentExecutor
- private MaterialCache materialCache
- private WorkerIndexer workerIndexer
- private String statsHeader
- private Set<Integer> statsCheckpoints
- private PositionProvider spawnPositions
- private double bufferCapacityFactor
- private double targetViewDistance
- private double targetPlayerCount

## Methods

- @Nonnull public StagedChunkGenerator build()
- @Nonnull public StagedChunkGenerator.Builder withStats(@Nonnull String statsHeader, @Nonnull Set<Integer> statsCheckpoints)
- @Nonnull public StagedChunkGenerator.Builder withSpawnPositions(@Nonnull PositionProvider spawnPositions)
- @Nonnull public StagedChunkGenerator.Builder withConcurrentExecutor(@Nonnull ExecutorService executor, @Nonnull WorkerIndexer workerIndexer)
- @Nonnull public StagedChunkGenerator.Builder withMaterialCache(@Nonnull MaterialCache materialCache)
- @Nonnull public StagedChunkGenerator.Builder withBufferCapacity(double factor, double targetViewDistance, double targetPlayerCount)
- @Nonnull public StagedChunkGenerator.Builder appendStage(@Nonnull Stage stage)
- @Nonnull private List<Integer> createStagesThatReadFrom(int stageIndex)
- @Nonnull private Map<Integer, Set<Integer>> createStageDependencyMap()
- private int resolveBufferCapacity(@Nonnull BufferType bufferType, @Nonnull Bounds3i[] stagesOutputBounds)
- private static int calculateCapacityFromBounds(@Nonnull Bounds3i bounds, double factor, double viewDistance_voxelGrid, double playerCount)
- private void createTotalOutputBoundsForStage(int stageIndex, @Nonnull Map<Integer, Set<Integer>> stageDependencyMap, @Nonnull Bounds3i[] totalOutputBoundsPerStage_bufferGrid)
- @Nonnull private Bounds3i[] createTotalOutputBoundsArray(@Nonnull Map<Integer, Set<Integer>> stageDependencyMap)
- @Nonnull private Set<BufferType> createListOfAllBufferTypes()
- @Nonnull private static Bounds3i getEncompassingBounds(@Nonnull Collection<Bounds3i> set)
- private boolean isGeneratorOutputBufferType(@Nonnull BufferType bufferType)
