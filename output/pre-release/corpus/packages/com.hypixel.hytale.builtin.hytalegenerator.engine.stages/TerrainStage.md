# TerrainStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.stages | Implements: Stage

public class TerrainStage implements Stage

A Stage that generates terrain density and material data. Reads biome and biome-distance buffers as input and writes a `VoxelBuffer<Material>` output. The two-phase process first computes density values per voxel (blending multiple biome densities weighted by distance), then assigns materials per voxel using the biome's `MaterialProvider` with contextual data including depth-into-floor, space-above-floor, and distance-to-biome-edge. Biome blending uses circle-curve area weighting within a configurable interpolation radius.

## Inner Types

- TerrainStage.BiomeWeights | class | Weighted biome entries for density blending
- TerrainStage.ColumnData | class | Per-column depth and space metrics

## Fields

- public static final double DEFAULT_BACKGROUND_DENSITY
- public static final double ORIGIN_REACH
- public static final double ORIGIN_REACH_HALF
- public static final double QUARTER_PI
- @Nonnull public static final Class<CountedPixelBuffer> biomeBufferClass
- @Nonnull public static final Class<Integer> biomeClass
- @Nonnull public static final Class<SimplePixelBuffer> biomeDistanceBufferClass
- @Nonnull public static final Class<BiomeDistanceStage.BiomeDistanceEntries> biomeDistanceClass
- @Nonnull public static final Class<VoxelBuffer> materialBufferClass
- @Nonnull public static final Class<Material> materialClass
- @Nonnull private final ParametrizedBufferType biomeInputBufferType
- @Nonnull private final ParametrizedBufferType biomeDistanceInputBufferType
- @Nonnull private final ParametrizedBufferType materialOutputBufferType
- @Nonnull private final Bounds3i inputBounds_bufferGrid
- @Nonnull private final String stageName
- private final int maxInterpolationRadius_voxelGrid
- @Nonnull private final MaterialCache materialCache
- @Nonnull private final WorkerIndexer.Data<FloatContainer3d> densityContainers
- @Nonnull private final WorkerIndexer.Data<WorldStructure> worldStructure_workerdata

## Constructors

- public TerrainStage(@Nonnull String stageName, @Nonnull ParametrizedBufferType biomeInputBufferType, @Nonnull ParametrizedBufferType biomeDistanceInputBufferType, @Nonnull ParametrizedBufferType materialOutputBufferType, int maxInterpolationRadius_voxelGrid, @Nonnull MaterialCache materialCache, @Nonnull WorkerIndexer workerIndexer, @Nonnull WorkerIndexer.Data<WorldStructure> worldStructure_workerdata)

## Methods

- @Override public void run(@Nonnull Stage.Context context)
- @Nonnull @Override public Map<BufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull @Override public List<BufferType> getOutputTypes()
- @Nonnull @Override public String getName()
- private void generateDensity(@Nonnull FloatContainer3d densityBuffer, @Nonnull PixelBufferView<Integer> biomeSpace, @Nonnull PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, @Nonnull Registry<Biome> biomeRegistry)
- private float getOrGenerateDensity(@Nonnull Vector3i position_voxelGrid, @Nonnull FloatContainer3d densityBuffer, @Nonnull PixelBufferView<Integer> biomeSpace, @Nonnull PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, @Nonnull Registry<Biome> biomeRegistry)
- private float generateDensity(@Nonnull Vector3i position_voxelGrid, @Nonnull PixelBufferView<Integer> biomeSpace, @Nonnull PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, @Nonnull Registry<Biome> biomeRegistry)
- private void generateMaterials(@Nonnull PixelBufferView<Integer> biomeSpace, @Nonnull PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, @Nonnull FloatContainer3d densityBuffer, @Nonnull VoxelBufferView<Material> materialSpace, @Nonnull Registry<Biome> biomeRegistry)
- @Nonnull private static TerrainStage.BiomeWeights createWeights(@Nonnull BiomeDistanceStage.BiomeDistanceEntries distances, int biomeIdAtOrigin, double interpolationRange)
- private static double areaUnderCircleCurve(double maxX)
- private static double areaUnderCircleCurve(double minX, double maxX, double circleRadius)

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeDistanceStage, BiomeStage, BiomeWeights, ColumnData, Context, Entry, EnvironmentStage, PropStage, Stage, TintStage

Complete API:
  public void run(Stage.Context context)
  public Map<BufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<BufferType> getOutputTypes()
  public String getName()
  private void generateDensity(FloatContainer3d densityBuffer, PixelBufferView<Integer> biomeSpace, PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, Registry<Biome> biomeRegistry)
  private float getOrGenerateDensity(Vector3i position_voxelGrid, FloatContainer3d densityBuffer, PixelBufferView<Integer> biomeSpace, PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, Registry<Biome> biomeRegistry)
  private float generateDensity(Vector3i position_voxelGrid, PixelBufferView<Integer> biomeSpace, PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, Registry<Biome> biomeRegistry)
  private void generateMaterials(PixelBufferView<Integer> biomeSpace, PixelBufferView<BiomeDistanceStage.BiomeDistanceEntries> distanceSpace, FloatContainer3d densityBuffer, VoxelBufferView<Material> materialSpace, Registry<Biome> biomeRegistry)
  private static TerrainStage.BiomeWeights createWeights(BiomeDistanceStage.BiomeDistanceEntries distances, int biomeIdAtOrigin, double interpolationRange)
  private static double areaUnderCircleCurve(double maxX)
  private static double areaUnderCircleCurve(double minX, double maxX, double circleRadius)

Fields:
public static final double DEFAULT_BACKGROUND_DENSITY
public static final double ORIGIN_REACH
public static final double ORIGIN_REACH_HALF
public static final double QUARTER_PI
public static final Class<CountedPixelBuffer> biomeBufferClass
public static final Class<Integer> biomeClass
public static final Class<SimplePixelBuffer> biomeDistanceBufferClass
public static final Class<BiomeDistanceStage.BiomeDistanceEntries> biomeDistanceClass
public static final Class<VoxelBuffer> materialBufferClass
public static final Class<Material> materialClass
private final ParametrizedBufferType biomeInputBufferType
private final ParametrizedBufferType biomeDistanceInputBufferType
private final ParametrizedBufferType materialOutputBufferType
private final Bounds3i inputBounds_bufferGrid
private final String stageName
private final int maxInterpolationRadius_voxelGrid
private final MaterialCache materialCache
private final WorkerIndexer.Data<FloatContainer3d> densityContainers
private final WorkerIndexer.Data<WorldStructure> worldStructure_workerdata
