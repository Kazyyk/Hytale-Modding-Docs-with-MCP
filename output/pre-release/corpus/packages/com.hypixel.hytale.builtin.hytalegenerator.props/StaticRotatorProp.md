# StaticRotatorProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: Prop

public class StaticRotatorProp extends Prop

A prop wrapper that rotates a child prop by a fixed rotation, transforming both read/write voxel spaces and entity buffer.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Prop prop
private final RotationVoxelSpace readRotationVoxelSpace
private final RotationVoxelSpace writeRotationVoxelSpace
private final RotationEntityFunnel rotationEntityFunnel
private final Bounds3i readBounds
private final Bounds3i writeBounds
private final Prop.Context rChildContext
