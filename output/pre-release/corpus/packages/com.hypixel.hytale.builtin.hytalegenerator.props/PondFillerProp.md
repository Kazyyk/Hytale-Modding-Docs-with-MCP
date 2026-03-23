# PondFillerProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: Prop

public class PondFillerProp extends Prop

A prop that identifies enclosed basins using flood-fill and fills non-leaking areas with fluid material.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()
  private static boolean isTraversed(int maskValue)
  private static boolean isLeaks(int maskValue)
  private static boolean isSolid(int maskValue)
  private static boolean isStacked(int maskValue)

Fields:
private static final int TRAVERSED
private static final int LEAKS
private static final int SOLID
private static final int STACKED
private final Bounds3i bounds
private final MaterialProvider<Material> fillerMaterialProvider
private final MaterialSet solidSet
private final Bounds3i rLocalBounds
private final Bounds3i rLocalWriteBounds
private final ArrayVoxelSpace<Integer> rMask
private final MaterialProvider.Context rMaterialProviderContext
