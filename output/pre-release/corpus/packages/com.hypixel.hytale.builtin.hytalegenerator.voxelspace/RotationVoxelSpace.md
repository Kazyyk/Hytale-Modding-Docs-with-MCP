# RotationVoxelSpace

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.voxelspace | Extends: java.lang.Object | Implements: VoxelSpace<Material>

public class RotationVoxelSpace implements VoxelSpace<Material>

A VoxelSpace wrapper that transparently rotates coordinates and materials between a view space and a source space.

Also in this package: ArrayVoxelSpace, BatchTransfer, MaskVoxelSpace, NullSpace, VoxelSpace, VoxelSpaceUtil, WindowVoxelSpace

Complete API:
  public void setSource(VoxelSpace<Material> source, Vector3i anchor)
  public void set(Material material, int x, int y, int z)
  public void set(Material material, Vector3i position)
  public void setAll(Material material)
  public Material get(int x, int y, int z)
  public Material get(Vector3i position)
  public Bounds3i getBounds()
  private void loadPosition(int x, int y, int z)

Fields:
private final RotationTuple rotation_fromViewToSource
private final RotationTuple rotation_materialFromSourceToView
private final Bounds3i viewBounds
private final MaterialCache materialCache
private VoxelSpace<Material> source
private final Vector3i anchor
private final Vector3i rPosition
