# VoxelSpaceUtil

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures.voxelspace

public class VoxelSpaceUtil

## Fields

- private final VoxelSpace<T> source
- private final VoxelSpace<T> destination
- private final int minX
- private final int minY
- private final int minZ
- private final int maxX
- private final int maxY
- private final int maxZ

## Methods

- public static <V> void parallelCopy(@Nonnull VoxelSpace<V> source, @Nonnull VoxelSpace<V> destination, int concurrency)
- @Override public void run()

## Inner Types

- `VoxelSpaceUtil.BatchTransfer`

Also in this package: BatchTransfer, BooleanVoxelSpace, NullSpace, VoxelConsumer, VoxelCoordinate, VoxelSpace, WindowVoxelSpace

Complete API:
  public static void parallelCopy(VoxelSpace<V> source, VoxelSpace<V> destination, int concurrency)
