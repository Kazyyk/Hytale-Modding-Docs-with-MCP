# ArrayVoxelSpace

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.voxelspace | Extends: java.lang.Object | Implements: VoxelSpace<T>

public class ArrayVoxelSpace<T> implements VoxelSpace<T>

An array-backed VoxelSpace implementation. Stores voxel data in a flat array indexed by position within bounds.

Also in this package: BatchTransfer, MaskVoxelSpace, NullSpace, RotationVoxelSpace, VoxelSpace, VoxelSpaceUtil, WindowVoxelSpace

Complete API:
  public void offset(Vector3i vector)
  public void offsetOpposite(Vector3i vector)
  public void set(T content, int x, int y, int z)
  public void set(T content, Vector3i position)
  public void setAll(T content)
  public T get(int x, int y, int z)
  public T get(Vector3i position)
  public Bounds3i getBounds()

Fields:
private final Bounds3i bounds
private final T[] contents
