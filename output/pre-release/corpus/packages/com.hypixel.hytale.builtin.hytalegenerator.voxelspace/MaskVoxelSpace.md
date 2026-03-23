# MaskVoxelSpace

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.voxelspace | Extends: java.lang.Object | Implements: VoxelSpace<Material>

public class MaskVoxelSpace implements VoxelSpace<Material>

A VoxelSpace wrapper that applies a `BlockMask` to all write operations, filtering which blocks can be placed or replaced.

Also in this package: ArrayVoxelSpace, BatchTransfer, NullSpace, RotationVoxelSpace, VoxelSpace, VoxelSpaceUtil, WindowVoxelSpace

Complete API:
  public void setSource(VoxelSpace<Material> source)
  public void set(Material content, int x, int y, int z)
  public void set(Material content, Vector3i position)
  public void setAll(Material content)
  public Material get(int x, int y, int z)
  public Material get(Vector3i position)
  public Bounds3i getBounds()

Fields:
private final BlockMask mask
private VoxelSpace<Material> source
