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
