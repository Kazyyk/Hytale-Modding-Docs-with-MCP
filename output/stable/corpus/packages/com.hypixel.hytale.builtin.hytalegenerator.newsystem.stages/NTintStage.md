# NTintStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages | Implements: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage

public class NTintStage implements NStage

Computes per-pixel tint color values by querying each biome's `TintProvider`. Falls back to `TintProvider.DEFAULT_TINT` when the provider returns no value.

## Methods

- public void run(@Nonnull NStage.Context context)
- @Nonnull public Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull public List<NBufferType> getOutputTypes()
- @Nonnull public String getName()

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeWeights, ColumnData, Context, Entry, NBiomeDistanceStage, NBiomeStage, NEnvironmentStage, NPropStage, NStage, NTerrainStage, NTestPropStage, NTestTerrainStage

Complete API:
  public void run(NStage.Context context)
  public Map<NBufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<NBufferType> getOutputTypes()
  public String getName()

Fields:
public static final Class<NCountedPixelBuffer> biomeBufferClass
public static final Class<Integer> biomeClass
public static final Class<NSimplePixelBuffer> tintBufferClass
public static final Class<Integer> tintClass
private final NParametrizedBufferType biomeInputBufferType
private final NParametrizedBufferType tintOutputBufferType
private final Bounds3i inputBounds_bufferGrid
private final String stageName
private final WorkerIndexer.Data<WorldStructure> worldStructure_workerData
