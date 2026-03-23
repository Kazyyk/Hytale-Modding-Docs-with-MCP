# VoxelSpaceUtil.BatchTransfer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.voxelspace | Extends: java.lang.Object | Implements: Runnable

private static class BatchTransfer<T> implements Runnable

A Runnable that copies voxel data from a source VoxelSpace to a destination VoxelSpace within a specified region.

Also in this package: ArrayVoxelSpace, MaskVoxelSpace, NullSpace, RotationVoxelSpace, VoxelSpace, VoxelSpaceUtil, WindowVoxelSpace

Complete API:
  public void run()

Fields:
private final VoxelSpace<T> source
private final VoxelSpace<T> destination
private final int minX
private final int minY
private final int minZ
private final int maxX
private final int maxY
private final int maxZ
