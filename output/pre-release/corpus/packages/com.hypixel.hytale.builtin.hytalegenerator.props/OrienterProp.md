# OrienterProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: Prop

public class OrienterProp extends Prop

A prop that tests multiple rotated patterns to determine the best orientation for placement. Supports first-valid, all-valid, and random-valid selection modes.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final List<Prop> props
private final List<Pattern> patterns
private final Scanner scanner
private final OrienterProp.SelectionMode selectionMode
private final RngField rngField
private final Bounds3i readBounds
private final Bounds3i writeBounds
private final FastRandom random
private final Pattern.Context rPatternContext
private final Prop.Context rChildContext
private final boolean[] rHasGenerated
private final List<Integer> rValidPatternIndices
private Prop.Context rContext
private final Pipe.One<Vector3i> rFirstAllValidPipe
private final Pipe.One<Vector3i> rRandomValidPipe
