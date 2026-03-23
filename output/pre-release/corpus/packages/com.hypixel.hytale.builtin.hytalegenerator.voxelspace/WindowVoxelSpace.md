# WindowVoxelSpace

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.voxelspace | Extends: java.lang.Object | Implements: VoxelSpace<T>

public class WindowVoxelSpace<T> implements VoxelSpace<T>

A VoxelSpace wrapper that restricts reads and writes to a configurable sub-region (window) of a source space.

Also in this package: ArrayVoxelSpace, BatchTransfer, MaskVoxelSpace, NullSpace, RotationVoxelSpace, VoxelSpace, VoxelSpaceUtil

Complete API:
  public void setBounds(Bounds3i bounds)
  public void setBounds(int minX, int minY, int minZ, int maxX, int maxY, int maxZ)
  public VoxelSpace<T> getSourceVoxelSpace()
  public void set(T content, int x, int y, int z)
  public void set(T content, Vector3i position)
  public void setAll(T content)
  public T get(int x, int y, int z)
  public T get(Vector3i position)
  public Bounds3i getBounds()

Fields:
private final VoxelSpace<T> source
private final Bounds3i bounds
