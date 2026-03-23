# BiomeDistanceStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.stages | Implements: Stage

public class BiomeDistanceStage implements Stage

A Stage that computes the distance from each voxel column to nearby biome boundaries. Reads biome IDs from a `CountedPixelBuffer<Integer>` input and writes BiomeDistanceStage.BiomeDistanceEntries into a `SimplePixelBuffer` output. Scans within a configurable maximum distance radius, using buffer-level optimization to skip entirely when all biomes in a buffer are already accounted for at a greater distance.

## Inner Types

- BiomeDistanceStage.BiomeDistanceCounter | class | Accumulates closest-distance-per-biome during scanning
- BiomeDistanceStage.BiomeDistanceEntries | class | Result container of biome distance entries for a column
- BiomeDistanceStage.BiomeDistanceEntry | class | Single biome ID and its distance

## Fields

- private static final double ORIGIN_REACH
- private static final double BUFFER_DIAGONAL_VOXEL_GRID
- public static final double DEFAULT_DISTANCE_TO_BIOME_EDGE
- @Nonnull public static final Class<CountedPixelBuffer> biomeBufferClass
- @Nonnull public static final Class<Integer> biomeClass
- @Nonnull public static final Class<SimplePixelBuffer> biomeDistanceBufferClass
- @Nonnull public static final Class<BiomeDistanceStage.BiomeDistanceEntries> biomeDistanceClass
- @Nonnull private final ParametrizedBufferType biomeInputBufferType
- @Nonnull private final ParametrizedBufferType biomeDistanceOutputBufferType
- @Nonnull private final String stageName
- private final double maxDistance_voxelGrid
- private final int maxDistance_bufferGrid
- @Nonnull private final Bounds3i inputBounds_bufferGrid

## Constructors

- public BiomeDistanceStage(@Nonnull String stageName, @Nonnull ParametrizedBufferType biomeInputBufferType, @Nonnull ParametrizedBufferType biomeDistanceOutputBufferType, double maxDistance_voxelGrid)

## Methods

- @Override public void run(@Nonnull Stage.Context context)
- @Nonnull private BiomeDistanceStage.BiomeDistanceEntries createDistanceTracker(@Nonnull BufferBundle.Access.View biomeAccess, @Nonnull PixelBufferView<Integer> biomeSpace, @Nonnull Vector3i targetPosition_voxelGrid)
- @Nonnull @Override public Map<BufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull @Override public List<BufferType> getOutputTypes()
- @Nonnull @Override public String getName()
- public static double distanceToBuffer_voxelGrid(@Nonnull Vector3i position_voxelGrid, @Nonnull Vector3i position_bufferGrid)
- private static boolean allBiomesAreCountedAndFarther(@Nonnull BiomeDistanceStage.BiomeDistanceCounter counter, @Nonnull List<Integer> uniqueBiomes, double distanceToBuffer_voxelGrid)

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeStage, BiomeWeights, ColumnData, Context, Entry, EnvironmentStage, PropStage, Stage, TerrainStage, TintStage

Complete API:
  public void run(Stage.Context context)
  private BiomeDistanceStage.BiomeDistanceEntries createDistanceTracker(BufferBundle.Access.View biomeAccess, PixelBufferView<Integer> biomeSpace, Vector3i targetPosition_voxelGrid)
  public Map<BufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<BufferType> getOutputTypes()
  public String getName()
  public static double distanceToBuffer_voxelGrid(Vector3i position_voxelGrid, Vector3i position_bufferGrid)
  private static boolean allBiomesAreCountedAndFarther(BiomeDistanceStage.BiomeDistanceCounter counter, List<Integer> uniqueBiomes, double distanceToBuffer_voxelGrid)

Fields:
private static final double ORIGIN_REACH
private static final double BUFFER_DIAGONAL_VOXEL_GRID
public static final double DEFAULT_DISTANCE_TO_BIOME_EDGE
public static final Class<CountedPixelBuffer> biomeBufferClass
public static final Class<Integer> biomeClass
public static final Class<SimplePixelBuffer> biomeDistanceBufferClass
public static final Class<BiomeDistanceStage.BiomeDistanceEntries> biomeDistanceClass
private final ParametrizedBufferType biomeInputBufferType
private final ParametrizedBufferType biomeDistanceOutputBufferType
private final String stageName
private final double maxDistance_voxelGrid
private final int maxDistance_bufferGrid
private final Bounds3i inputBounds_bufferGrid
