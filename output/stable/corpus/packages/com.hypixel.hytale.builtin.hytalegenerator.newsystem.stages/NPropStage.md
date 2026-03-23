# NPropStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages | Implements: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage

public class NPropStage implements NStage

Places props (vegetation, structures, objects) into the material and entity buffers. Iterates biomes in the input area, evaluates position providers to generate candidate positions, checks biome ownership and edge distance, then scans and places each prop.

## Methods

- public void run(@Nonnull NStage.Context context)
- @Nonnull public Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull public List<NBufferType> getOutputTypes()
- @Nonnull public String getName()

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeWeights, ColumnData, Context, Entry, NBiomeDistanceStage, NBiomeStage, NEnvironmentStage, NStage, NTerrainStage, NTestPropStage, NTestTerrainStage, NTintStage

Complete API:
  public void run(NStage.Context context)
  public Map<NBufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<NBufferType> getOutputTypes()
  public String getName()

Fields:
public static final double DEFAULT_BACKGROUND_DENSITY
public static final Class<NCountedPixelBuffer> biomeBufferClass
public static final Class<Integer> biomeClass
public static final Class<NSimplePixelBuffer> biomeDistanceBufferClass
public static final Class<NBiomeDistanceStage.BiomeDistanceEntries> biomeDistanceClass
public static final Class<NVoxelBuffer> materialBufferClass
public static final Class<Material> materialClass
public static final Class<NEntityBuffer> entityBufferClass
private final NParametrizedBufferType biomeInputBufferType
private final NParametrizedBufferType biomeDistanceInputBufferType
private final NParametrizedBufferType materialInputBufferType
private final NBufferType entityInputBufferType
private final NParametrizedBufferType materialOutputBufferType
private final NBufferType entityOutputBufferType
private final Bounds3i inputBounds_bufferGrid
private final Bounds3i inputBounds_voxelGrid
private final String stageName
private final MaterialCache materialCache
private final WorkerIndexer.Data<WorldStructure> worldStructure_workerData
private final int runtimeIndex
