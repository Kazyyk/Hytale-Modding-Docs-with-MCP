# NEnvironmentStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages | Implements: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage

public class NEnvironmentStage implements NStage

Fills a voxel buffer with environment IDs. For each (x, z) column, looks up the biome from the input pixel buffer and queries its `EnvironmentProvider` for every y level.

## Methods

- public void run(@Nonnull NStage.Context context)
- @Nonnull public Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull public List<NBufferType> getOutputTypes()
- @Nonnull public String getName()

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeWeights, ColumnData, Context, Entry, NBiomeDistanceStage, NBiomeStage, NPropStage, NStage, NTerrainStage, NTestPropStage, NTestTerrainStage, NTintStage

Complete API:
  public void run(NStage.Context context)
  public Map<NBufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<NBufferType> getOutputTypes()
  public String getName()

Fields:
public static final Class<NCountedPixelBuffer> biomeBufferClass
public static final Class<Integer> biomeTypeClass
public static final Class<NVoxelBuffer> environmentBufferClass
public static final Class<Integer> environmentClass
private final NParametrizedBufferType biomeInputBufferType
private final NParametrizedBufferType environmentOutputBufferType
private final Bounds3i inputBounds_bufferGrid
private final String stageName
private final WorkerIndexer.Data<WorldStructure> worldStructure_workerData
