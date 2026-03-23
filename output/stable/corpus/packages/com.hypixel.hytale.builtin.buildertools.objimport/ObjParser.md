# ObjParser

Type: class | Package: com.hypixel.hytale.builtin.buildertools.objimport

public final class ObjParser

Parses Wavefront OBJ files into an `ObjMesh` record. Supports vertices (`v`), UV coordinates (`vt`), faces (`f`) with automatic triangulation of quads and N-gons, material library references (`mtllib`), and material assignments (`usemtl`). Handles negative vertex indices. The constructor is private; access is through the static `parse` method.

## Methods

- parse(Path) | ObjMesh | Parses an OBJ file. Throws `ObjParseException` on invalid data, `IOException` on read failure.

## Inner Types

### ObjMesh (record)

Parsed mesh data.

- vertices | List<float[]> | Vertex positions (x, y, z).
- uvCoordinates | List<float[]> | UV texture coordinates (u, v).
- faces | List<int[]> | Triangulated face vertex indices.
- faceUvIndices | List<int[]> | Per-face UV indices (null entries for faces without UVs).
- faceMaterials | List<String> | Per-face material name (null if no material assigned).
- mtlLib | String | Material library filename, or null.

- getBounds() | float[] | Returns [minX, minY, minZ, maxX, maxY, maxZ].
- getHeight() | float | Returns the mesh height (maxY - minY).
- hasMaterials() | boolean | Whether the mesh references materials.
- hasUvCoordinates() | boolean | Whether the mesh has UV coordinates.
- transformZUpToYUp() | void | Swaps Y and Z axes (Z-up to Y-up).
- transformXUpToYUp() | void | Swaps X and Y axes (X-up to Y-up).

### ObjParseException (class)

Checked exception for OBJ parsing errors.

## See Also

- MeshVoxelizer
- MtlParser
