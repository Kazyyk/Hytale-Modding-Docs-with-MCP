# NullSpace

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.voxelspace | Extends: java.lang.Object | Implements: VoxelSpace<V>

public class NullSpace<V> implements VoxelSpace<V>

A no-op VoxelSpace that discards all writes and returns null for all reads. Singleton accessed via `instance()`.

Also in this package: ArrayVoxelSpace, BatchTransfer, MaskVoxelSpace, RotationVoxelSpace, VoxelSpace, VoxelSpaceUtil, WindowVoxelSpace

Complete API:
  public static NullSpace<V> instance()
  public static NullSpace<V> instance(Class<V> clazz)
  public void set(V content, int x, int y, int z)
  public void set(V content, Vector3i position)
  public void setAll(V content)
  public V get(int x, int y, int z)
  public V get(Vector3i position)
  public Bounds3i getBounds()

Fields:
private static final NullSpace INSTANCE
