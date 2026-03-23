# FloatContainer3d

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.containers

public class FloatContainer3d

Utility type in the `containers` subsystem.

## Accessors

- get(Vector3i position_voxelGrid) | float | Accessor method.
- getBounds_voxelGrid() | Bounds3i | Accessor method.
- set(Vector3i position_voxelGrid, float value) | void | Mutator method.

## Methods

- moveMinTo(Vector3i min_voxelGrid) | void | Instance method.

Complete API:
  public float get(Vector3i position_voxelGrid)
  public Bounds3i getBounds_voxelGrid()
  public void set(Vector3i position_voxelGrid, float value)
  public void moveMinTo(Vector3i min_voxelGrid)

Fields:
private final Bounds3i bounds_voxelGrid
private final Vector3i size_voxelGrid
private final float[] data
private final float outOfBoundsValue
