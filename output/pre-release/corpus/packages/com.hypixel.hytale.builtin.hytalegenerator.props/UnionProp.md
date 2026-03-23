# UnionProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class UnionProp

Prop that combines multiple child props, executing all that produce valid scan results.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final List<Prop> props
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
