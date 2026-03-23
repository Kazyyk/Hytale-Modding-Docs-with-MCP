# OffsetProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class OffsetProp

Wrapper prop that offsets a child prop's placement by a fixed vector.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Vector3i offset
private final Prop childProp
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
private final Vector3i rChildPosition
private final Prop.Context rChildContext
