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

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeDistanceStage, BiomeStage, BiomeWeights, ColumnData, Context, Entry, PropStage, Stage, TerrainStage, TintStage

Complete API:
  public void run(Stage.Context context)
  public Map<BufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<BufferType> getOutputTypes()
  public String getName()

Fields:
public static final Class<CountedPixelBuffer> biomeBufferClass
public static final Class<Integer> biomeTypeClass
public static final Class<VoxelBuffer> environmentBufferClass
public static final Class<Integer> environmentClass
private final ParametrizedBufferType biomeInputBufferType
private final ParametrizedBufferType environmentOutputBufferType
private final Bounds3i inputBounds_bufferGrid
private final String stageName
private final WorkerIndexer.Data<WorldStructure> worldStructure_workerData
