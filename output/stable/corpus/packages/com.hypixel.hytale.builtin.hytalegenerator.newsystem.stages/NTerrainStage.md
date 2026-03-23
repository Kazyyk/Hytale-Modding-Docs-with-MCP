# NTerrainStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages | Implements: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage

public class NTerrainStage implements NStage

Generates terrain density values with biome-weight interpolation, then assigns materials column-by-column. Computes floor/ceiling depth arrays for material provider context. Uses circle-area weighting for smooth biome transitions.

## Methods

- public void run(@Nonnull NStage.Context context)
- @Nonnull public Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull public List<NBufferType> getOutputTypes()
- @Nonnull public String getName()

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeWeights, ColumnData, Context, Entry, NBiomeDistanceStage, NBiomeStage, NEnvironmentStage, NPropStage, NStage, NTestPropStage, NTestTerrainStage, NTintStage

Complete API:
  public void run(NStage.Context context)
  public Map<NBufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<NBufferType> getOutputTypes()
  public String getName()
  private void generateDensity(FloatContainer3d densityBuffer, NPixelBufferView<Integer> biomeSpace, NPixelBufferView<NBiomeDistanceStage.BiomeDistanceEntries> distanceSpace, Registry<Biome> biomeRegistry)
  private float getOrGenerateDensity(Vector3i position_voxelGrid, FloatContainer3d densityBuffer, NPixelBufferView<Integer> biomeSpace, NPixelBufferView<NBiomeDistanceStage.BiomeDistanceEntries> distanceSpace, Registry<Biome> biomeRegistry)
  private float generateDensity(Vector3i position_voxelGrid, NPixelBufferView<Integer> biomeSpace, NPixelBufferView<NBiomeDistanceStage.BiomeDistanceEntries> distanceSpace, Registry<Biome> biomeRegistry)
  private void generateMaterials(NPixelBufferView<Integer> biomeSpace, NPixelBufferView<NBiomeDistanceStage.BiomeDistanceEntries> distanceSpace, FloatContainer3d densityBuffer, NVoxelBufferView<Material> materialSpace, Registry<Biome> biomeRegistry)
  private static NTerrainStage.BiomeWeights createWeights(NBiomeDistanceStage.BiomeDistanceEntries distances, int biomeIdAtOrigin, double interpolationRange)
  private static double areaUnderCircleCurve(double maxX)
  private static double areaUnderCircleCurve(double minX, double maxX, double circleRadius)

Fields:
public static final double DEFAULT_BACKGROUND_DENSITY
public static final double ORIGIN_REACH
public static final double ORIGIN_REACH_HALF
public static final double QUARTER_PI
public static final Class<NCountedPixelBuffer> biomeBufferClass
public static final Class<Integer> biomeClass
public static final Class<NSimplePixelBuffer> biomeDistanceBufferClass
public static final Class<NBiomeDistanceStage.BiomeDistanceEntries> biomeDistanceClass
public static final Class<NVoxelBuffer> materialBufferClass
public static final Class<Material> materialClass
private final NParametrizedBufferType biomeInputBufferType
private final NParametrizedBufferType biomeDistanceInputBufferType
private final NParametrizedBufferType materialOutputBufferType
private final Bounds3i inputBounds_bufferGrid
private final String stageName
private final int maxInterpolationRadius_voxelGrid
private final MaterialCache materialCache
private final WorkerIndexer.Data<FloatContainer3d> densityContainers
private final WorkerIndexer.Data<WorldStructure> worldStructure_workerdata
