# ManualProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: Prop

public class ManualProp extends Prop

A prop that places blocks at explicit relative positions from a predefined list.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final List<ManualProp.Block> blocks
private final Bounds3i bounds
private final Vector3i rPosition
