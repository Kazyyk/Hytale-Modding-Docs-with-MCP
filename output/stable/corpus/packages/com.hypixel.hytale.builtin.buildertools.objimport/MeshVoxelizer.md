# MeshVoxelizer

Type: class | Package: com.hypixel.hytale.builtin.buildertools.objimport

public final class MeshVoxelizer

Converts an OBJ triangle mesh into a 3D voxel grid. Scales the mesh to a target height, rasterizes triangle edges and surfaces, optionally fills the interior via flood fill, and supports per-voxel block ID assignment from UV-mapped textures or material-to-block mappings. The constructor is private; all access is through static `voxelize` methods.

## Methods

- voxelize(ObjMesh, int, boolean) | VoxelResult | Voxelizes a mesh at target height with optional solid fill.
- voxelize(ObjMesh, int, boolean, Map<String, Integer>) | VoxelResult | Adds material-to-block ID mapping.
- voxelize(ObjMesh, int, boolean, Map<String, Integer>, int) | VoxelResult | Adds a default block ID for unmapped materials.
- voxelize(ObjMesh, int, boolean, Map<String, BufferedImage>, Map<String, Integer>, BlockColorIndex, int) | VoxelResult | Full overload with texture sampling and color index lookup.
- voxelize(ObjMesh, int, boolean, Map<String, BufferedImage>, Map<String, Integer>, BlockColorIndex, int, boolean) | VoxelResult | Adds `preserveOrigin` flag to maintain mesh coordinate origin.

## Inner Types

### VoxelResult (record)

Result of the voxelization process.

- voxels | boolean[][][] | 3D occupancy grid.
- blockIds | int[][][] | Per-voxel block IDs (null if not using material mapping).
- sizeX | int | Grid size along X.
- sizeY | int | Grid size along Y.
- sizeZ | int | Grid size along Z.

- countSolid() | int | Returns the number of occupied voxels.
- getBlockId(int, int, int) | int | Returns the block ID at a coordinate, or 0 if out of bounds or no ID array.

## See Also

- ObjParser
- TextureSampler

Also in this package: MeshRotation, MtlMaterial, MtlParser, ObjImportCommand, ObjImportPage, ObjMesh, ObjParseException, ObjParser, Origin, PageData, TextureSampler, VoxelResult, WeightedBlock

Complete API:
  public static MeshVoxelizer.VoxelResult voxelize(ObjParser.ObjMesh mesh, int targetHeight, boolean fillSolid)
  public static MeshVoxelizer.VoxelResult voxelize(ObjParser.ObjMesh mesh, int targetHeight, boolean fillSolid, Map<String,Integer> materialToBlockId)
  public static MeshVoxelizer.VoxelResult voxelize(ObjParser.ObjMesh mesh, int targetHeight, boolean fillSolid, Map<String,Integer> materialToBlockId, int defaultBlockId)
  public static MeshVoxelizer.VoxelResult voxelize(ObjParser.ObjMesh mesh, int targetHeight, boolean fillSolid, Map<String,BufferedImage> materialTextures, Map<String,Integer> materialToBlockId, BlockColorIndex colorIndex, int defaultBlockId)
  public static MeshVoxelizer.VoxelResult voxelize(ObjParser.ObjMesh mesh, int targetHeight, boolean fillSolid, Map<String,BufferedImage> materialTextures, Map<String,Integer> materialToBlockId, BlockColorIndex colorIndex, int defaultBlockId, boolean preserveOrigin)
  private static int resolveIndex(int index, int count)
  private static void rasterizeSurface(boolean[][][] voxels, int[][][] blockIds, float[][] vertices, ObjParser.ObjMesh mesh, Map<String,BufferedImage> materialTextures, Map<String,Integer> materialToBlockId, BlockColorIndex colorIndex, int defaultBlockId, int sizeX, int sizeY, int sizeZ)
  private static void rasterizeLine(boolean[][][] voxels, int[][][] blockIds, float[] a, float[] b, float[] uvA, float[] uvB, BufferedImage texture, BlockColorIndex colorIndex, int fallbackBlockId, int sizeX, int sizeY, int sizeZ)
  private static float[] interpolateUv(float[] uvA, float[] uvB, float t)
  private static int sampleBlockId(float[] uv, BufferedImage texture, BlockColorIndex colorIndex, int fallbackBlockId)
  private static void setVoxel(boolean[][][] voxels, int[][][] blockIds, int x, int y, int z, int blockId, int sizeX, int sizeY, int sizeZ)
  private static void rasterizeTriangle(boolean[][][] voxels, int[][][] blockIds, float[] v0, float[] v1, float[] v2, float[] uv0, float[] uv1, float[] uv2, BufferedImage texture, BlockColorIndex colorIndex, int fallbackBlockId, int sizeX, int sizeY, int sizeZ)
  private static float[] barycentric(float px, float py, float pz, float[] v0, float[] v1, float[] v2)
  private static boolean pointNearTriangle(float px, float py, float pz, float[] v0, float[] v1, float[] v2, float threshold)
  private static boolean pointInTriangleWithTolerance(float px, float py, float pz, float[] v0, float[] v1, float[] v2, float tolerance)
  private static boolean[][][] floodFillSolid(boolean[][][] shell, int sizeX, int sizeY, int sizeZ)
  private static boolean tryEnqueue(boolean[][][] shell, int sizeX, int sizeY, int sizeZ, boolean[] visited, int[] queue, int ex, int ey, int ez, int dx, int plane, int writeIndex)
  private static MeshVoxelizer.VoxelResult cropToSolidBounds(boolean[][][] voxels, int[][][] blockIds, int sizeX, int sizeY, int sizeZ)
  private static void fillInteriorBlockIds(boolean[][][] solid, boolean[][][] shell, int[][][] blockIds, int defaultBlockId, int sizeX, int sizeY, int sizeZ)
  private static int findNearestSurfaceBlockId(int[][][] blockIds, boolean[][][] shell, int cx, int cy, int cz, int sizeX, int sizeY, int sizeZ)
