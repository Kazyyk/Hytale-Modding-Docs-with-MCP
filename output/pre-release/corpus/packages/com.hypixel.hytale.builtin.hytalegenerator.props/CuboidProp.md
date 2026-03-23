# CuboidProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: Prop

public class CuboidProp extends Prop

A prop that fills a cuboid region with material from a material provider.

Also in this package: Block, Context, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Bounds3i bounds
private final MaterialProvider<Material> materialProvider
private final Bounds3i rIntersectingBounds
private final MaterialProvider.Context rContext
