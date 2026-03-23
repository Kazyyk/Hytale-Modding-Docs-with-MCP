# EnvironmentStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.stages | Implements: Stage

public class EnvironmentStage implements Stage

A Stage that generates per-voxel environment IDs. Reads biome IDs from a `CountedPixelBuffer<Integer>` input and writes environment values into a `VoxelBuffer<Integer>` output. For each (x, z) column, looks up the biome from the registry and queries its `EnvironmentProvider` for every Y level.

## Fields

- @Nonnull public static final Class<CountedPixelBuffer> biomeBufferClass
- @Nonnull public static final Class<Integer> biomeTypeClass
- @Nonnull public static final Class<VoxelBuffer> environmentBufferClass
- @Nonnull public static final Class<Integer> environmentClass
- @Nonnull private final ParametrizedBufferType biomeInputBufferType
- @Nonnull private final ParametrizedBufferType environmentOutputBufferType
- @Nonnull private final Bounds3i inputBounds_bufferGrid
- @Nonnull private final String stageName
- @Nonnull private final WorkerIndexer.Data<WorldStructure> worldStructure_workerData

## Constructors

- public EnvironmentStage(@Nonnull String stageName, @Nonnull ParametrizedBufferType biomeInputBufferType, @Nonnull ParametrizedBufferType environmentOutputBufferType, @Nonnull WorkerIndexer.Data<WorldStructure> worldStructure_workerData)

## Methods

- @Override public void run(@Nonnull Stage.Context context)
- @Nonnull @Override public Map<BufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull @Override public List<BufferType> getOutputTypes()
- @Nonnull @Override public String getName()
