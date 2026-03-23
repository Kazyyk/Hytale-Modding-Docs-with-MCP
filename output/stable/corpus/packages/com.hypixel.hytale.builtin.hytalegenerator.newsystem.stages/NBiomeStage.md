# NBiomeStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages | Implements: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage

public class NBiomeStage implements NStage

Assigns biome IDs to a counted pixel buffer by sampling the world structure's biome map at each (x, z) position. Has no input buffer dependencies; writes biome output only.

## Methods

- public void run(@Nonnull NStage.Context context)
- @Nonnull public Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull public List<NBufferType> getOutputTypes()
- @Nonnull public String getName()

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeWeights, ColumnData, Context, Entry, NBiomeDistanceStage, NEnvironmentStage, NPropStage, NStage, NTerrainStage, NTestPropStage, NTestTerrainStage, NTintStage

Complete API:
  public void run(NStage.Context context)
  public Map<NBufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<NBufferType> getOutputTypes()
  public String getName()

Fields:
public static final Class<NCountedPixelBuffer> bufferClass
public static final Class<Integer> biomeClass
private final NParametrizedBufferType biomeOutputBufferType
private final String stageName
private final WorkerIndexer.Data<WorldStructure> worldStructure_workerData
