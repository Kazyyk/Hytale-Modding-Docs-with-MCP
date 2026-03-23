# QueueProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class QueueProp

Prop that executes a list of child props in sequence at the same position.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final List<Prop> props
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
