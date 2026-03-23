# DensitySelectorProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: Prop

public class DensitySelectorProp extends Prop

A prop that evaluates a density field at the placement position and delegates to a child prop based on which delimiter range the density value falls into.

Also in this package: Block, Context, CuboidProp, DensityProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final List<DelimiterDouble<Prop>> propDelimiters
private final Density density
private final Bounds3i readBounds
private final Bounds3i writeBounds
private final Density.Context rDensityContext
