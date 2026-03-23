# Prop.Context

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: java.lang.Object

public static class Context

Mutable context object for prop generation. Carries position, read/write voxel spaces, entity buffer, and distance to biome edge.

Also in this package: Block, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public void assign(Prop.Context other)

Fields:
public Vector3i position
public VoxelSpace<Material> materialReadSpace
public VoxelSpace<Material> materialWriteSpace
public EntityFunnel entityWriteBuffer
public double distanceToBiomeEdge
