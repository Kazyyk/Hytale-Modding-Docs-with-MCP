# FloatContainer3d

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.containers

public class FloatContainer3d

A bounded 3D container of float values backed by a flat array. Returns a configurable out-of-bounds value for positions outside the container's bounds. Used by `TerrainStage` to store computed density values during terrain generation. Supports repositioning the bounds via `moveMinTo` without reallocating the backing array.

## Fields

- @Nonnull private final Bounds3i bounds_voxelGrid
- @Nonnull private final Vector3i size_voxelGrid
- @Nonnull private final float[] data
- private final float outOfBoundsValue

## Constructors

- public FloatContainer3d(@Nonnull Bounds3i bounds_voxelGrid, float outOfBoundsValue)

## Methods

- public float get(@Nonnull Vector3i position_voxelGrid)
- @Nonnull public Bounds3i getBounds_voxelGrid()
- public void set(@Nonnull Vector3i position_voxelGrid, float value)
- public void moveMinTo(@Nonnull Vector3i min_voxelGrid)
