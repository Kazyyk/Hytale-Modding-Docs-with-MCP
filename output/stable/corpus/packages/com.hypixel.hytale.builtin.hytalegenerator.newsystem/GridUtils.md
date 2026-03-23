# GridUtils

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem

public class GridUtils

Utility methods for converting between voxel grid, buffer grid, and chunk grid coordinate systems in the new world generation system.

## Constants

- int BUFFER_COUNT_IN_CHUNK_Y

## Key Methods

- public static void toBufferGrid_fromVoxelGridOverlap(@Nonnull Bounds3i bounds_voxelGrid)
- public static Bounds3i createColumnBounds_voxelGrid(@Nonnull Vector3i position_bufferGrid, int minY_voxelSpace, int maxY_voxelSpace)
- public static Bounds3i createBufferBoundsInclusive_fromVoxelBounds(@Nonnull Bounds3i bounds_voxelGrid)
- public static Bounds3i createColumnBounds_bufferGrid(@Nonnull Vector3i position_bufferGrid, int minY_bufferGrid, int maxY_bufferGrid)
- public static Bounds3i createChunkBounds_voxelGrid(int x_chunkGrid, int z_chunkGrid)
- public static Bounds3i createUnitBounds3i(@Nonnull Vector3i position)
- public static Bounds3i createBounds_fromRadius_originVoxelInclusive(int radius)
- public static Bounds3i createBounds_fromVector_originVoxelInclusive(@Nonnull Vector3i range)
- public static Bounds3i createChunkBounds_bufferGrid(int x_chunkGrid, int z_chunkGrid)
- public static void toVoxelGrid_fromBufferGrid(@Nonnull Bounds3i bounds_bufferGrid)
- public static void toVoxelGrid_fromBufferGrid(@Nonnull Vector3i position_voxelGrid)
- public static void toBufferGrid_fromVoxelGrid(@Nonnull Vector3i worldPosition_voxelGrid)
- public static int toBufferDistanceInclusive_fromVoxelDistance(int distance_voxelGrid)
- public static Vector3i toIntegerGrid_fromDecimalGrid(@Nonnull Vector3d worldPosition_decimalGrid)
- public static void toVoxelGridInsideBuffer_fromWorldGrid(@Nonnull Vector3i worldPosition_voxelGrid)
- public static int toIndexFromPositionYXZ(@Nonnull Vector3i position, @Nonnull Bounds3i bounds)
- public static void setBoundsYToWorldHeight_bufferGrid(@Nonnull Bounds3i bounds_bufferGrid)
- public static void setBoundsYToWorldHeight_voxelGrid(@Nonnull Bounds3i bounds_voxelGrid)
- public static void toVoxelPosition_fromChunkPosition(@Nonnull Vector3i chunkPosition_voxelGrid)

Also in this package: Builder, NStagedChunkGenerator, NViewport, TerrainDensityProvider

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
  public static void toBufferGrid_fromVoxelGrid(Vector3i worldPosition_voxelGrid)
  public static int toBufferDistanceInclusive_fromVoxelDistance(int distance_voxelGrid)
  public static Vector3i toIntegerGrid_fromDecimalGrid(Vector3d worldPosition_decimalGrid)
  public static void toVoxelGridInsideBuffer_fromWorldGrid(Vector3i worldPosition_voxelGrid)
  public static int toIndexFromPositionYXZ(Vector3i position, Bounds3i bounds)
  public static void setBoundsYToWorldHeight_bufferGrid(Bounds3i bounds_bufferGrid)
  public static void setBoundsYToWorldHeight_voxelGrid(Bounds3i bounds_voxelGrid)
  public static void toVoxelPosition_fromChunkPosition(Vector3i chunkPosition_voxelGrid)

Fields:
public static final int BUFFER_COUNT_IN_CHUNK_Y
