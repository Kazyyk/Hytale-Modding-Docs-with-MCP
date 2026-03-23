# EmptyProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: Prop

public class EmptyProp extends Prop

A no-op prop that always returns true from generate(). Singleton accessed via `INSTANCE`.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
public static final EmptyProp INSTANCE
