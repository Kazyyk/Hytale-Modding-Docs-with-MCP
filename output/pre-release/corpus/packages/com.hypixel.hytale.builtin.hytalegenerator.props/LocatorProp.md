# LocatorProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: Prop

public class LocatorProp extends Prop

A prop that uses a scanner to find positions matching a pattern within its scan bounds, then places a child prop at each match (up to a cap).

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Bounds3i readBounds
private final Bounds3i writeBounds
private final Scanner scanner
private final Pattern pattern
private final Prop prop
private final int placementCap
private final Pattern.Context rPatternContext
private final Prop.Context rPropContext
private final int[] rPlacedCount
private final boolean[] rHasGenerated
private Prop.Context rContext
private final Pipe.One<Vector3i> rScannerPipe
