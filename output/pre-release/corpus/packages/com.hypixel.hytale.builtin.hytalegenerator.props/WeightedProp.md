# WeightedProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class WeightedProp

Prop that randomly selects a child prop from a weighted distribution using seed-based randomization.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final WeightedMap<Prop> props
private final Bounds3i readBounds_voxelGrid
private final Bounds3i writeBounds_voxelGrid
private final RngField rngField
private final FastRandom random
