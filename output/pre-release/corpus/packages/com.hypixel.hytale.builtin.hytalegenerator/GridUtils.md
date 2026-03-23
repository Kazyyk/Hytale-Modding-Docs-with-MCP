# GridUtils

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator

public class GridUtils

Utility class providing coordinate conversions between voxel grid, buffer grid, and chunk grid coordinate systems used by the Hytale world generator. Handles bit-shift-based conversions, bounds creation, and index calculations.

Also in this package: ArrayUtil, BiOperation3i, BlockMask, EntityPlacementData, FutureUtils, LoggerUtil, MaterialSet, NakedOperation3i, Operation3i, PropRuntime, Registry, Retriever, ReusableList, VectorUtil, Viewport, WeightedMap

Complete API:
  public static void toBufferGrid_fromVoxelGridOverlap(Bounds3i bounds_voxelGrid)
  public static Bounds3i createColumnBounds_voxelGrid(Vector3i position_bufferGrid, int minY_voxelSpace, int maxY_voxelSpace)
  public static Bounds3i createBufferBoundsInclusive_fromVoxelBounds(Bounds3i bounds_voxelGrid)
  public static Bounds3i createColumnBounds_bufferGrid(Vector3i position_bufferGrid, int minY_bufferGrid, int maxY_bufferGrid)
  public static Bounds3i createChunkBounds_voxelGrid(int x_chunkGrid, int z_chunkGrid)
  public static Bounds3i createUnitBounds3i(Vector3i position)
  public static Bounds3i createBounds_fromRadius_originVoxelInclusive(int radius)
  public static Bounds3i createBounds_fromVector_originVoxelInclusive(Vector3i range)
  public static Bounds3i createChunkBounds_bufferGrid(int x_chunkGrid, int z_chunkGrid)
  public static void toVoxelGrid_fromBufferGrid(Bounds3i bounds_bufferGrid)
  public static void toVoxelGrid_fromBufferGrid(Vector3i position_voxelGrid)
  public static int toBufferGrid_fromVoxelGrid(int worldPosition_voxelGrid)
  public static void toBufferGrid_fromVoxelGrid(Vector3i worldPosition_voxelGrid)
  public static int toBufferDistanceInclusive_fromVoxelDistance(int distance_voxelGrid)
  public static Vector3i toIntegerGrid_fromDecimalGrid(Vector3d worldPosition_decimalGrid)
  public static int toXVoxelGridInsideBuffer_fromWorldGrid(int x_voxelGrid)
  public static int toYVoxelGridInsideBuffer_fromWorldGrid(int y_voxelGrid)
  public static int toZVoxelGridInsideBuffer_fromWorldGrid(int z_voxelGrid)
  public static void toVoxelGridInsideBuffer_fromWorldGrid(Vector3i worldPosition_voxelGrid)
  public static int toIndexFromPositionYXZ(int x, int y, int z, Bounds3i bounds)
  public static int toIndexFromPositionYXZ(Vector3i position, Bounds3i bounds)
  public static void setBoundsYToWorldHeight_bufferGrid(Bounds3i bounds_bufferGrid)
  public static void setBoundsYToWorldHeight_voxelGrid(Bounds3i bounds_voxelGrid)
  public static void toVoxelPosition_fromChunkPosition(Vector3i chunkPosition_voxelGrid)

Fields:
public static final int BUFFER_COUNT_IN_CHUNK_Y
