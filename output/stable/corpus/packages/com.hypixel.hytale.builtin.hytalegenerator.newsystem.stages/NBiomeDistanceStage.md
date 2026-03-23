# NBiomeDistanceStage

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages | Implements: com.hypixel.hytale.builtin.hytalegenerator.newsystem.stages.NStage

public class NBiomeDistanceStage implements NStage

Computes per-pixel minimum distance to the nearest different biome for each position within a configurable radius. Scans surrounding buffers, resolving per-voxel biome IDs when a buffer contains multiple biomes. Produces `BiomeDistanceEntries` objects recording all nearby biome distances.

## Methods

- public void run(@Nonnull NStage.Context context)
- @Nonnull public Map<NBufferType, Bounds3i> getInputTypesAndBounds_bufferGrid()
- @Nonnull public List<NBufferType> getOutputTypes()
- @Nonnull public String getName()

Also in this package: BiomeDistanceCounter, BiomeDistanceEntries, BiomeDistanceEntry, BiomeWeights, ColumnData, Context, Entry, NBiomeStage, NEnvironmentStage, NPropStage, NStage, NTerrainStage, NTestPropStage, NTestTerrainStage, NTintStage

Complete API:
  public void run(NStage.Context context)
  private NBiomeDistanceStage.BiomeDistanceEntries createDistanceTracker(NBufferBundle.Access.View biomeAccess, NPixelBufferView<Integer> biomeSpace, Vector3i targetPosition_voxelGrid)
  public Map<NBufferType,Bounds3i> getInputTypesAndBounds_bufferGrid()
  public List<NBufferType> getOutputTypes()
  public String getName()
  public static double distanceToBuffer_voxelGrid(Vector3i position_voxelGrid, Vector3i position_bufferGrid)
  private static boolean allBiomesAreCountedAndFarther(NBiomeDistanceStage.BiomeDistanceCounter counter, List<Integer> uniqueBiomes, double distanceToBuffer_voxelGrid)

Fields:
private static final double ORIGIN_REACH
private static final double BUFFER_DIAGONAL_VOXEL_GRID
public static final double DEFAULT_DISTANCE_TO_BIOME_EDGE
public static final Class<NCountedPixelBuffer> biomeBufferClass
public static final Class<Integer> biomeClass
public static final Class<NSimplePixelBuffer> biomeDistanceBufferClass
public static final Class<NBiomeDistanceStage.BiomeDistanceEntries> biomeDistanceClass
private final NParametrizedBufferType biomeInputBufferType
private final NParametrizedBufferType biomeDistanceOutputBufferType
private final String stageName
private final double maxDistance_voxelGrid
private final int maxDistance_bufferGrid
private final Bounds3i inputBounds_bufferGrid
