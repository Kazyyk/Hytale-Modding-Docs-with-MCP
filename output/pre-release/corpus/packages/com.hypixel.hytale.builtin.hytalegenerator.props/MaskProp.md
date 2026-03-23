# MaskProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: Prop

public class MaskProp extends Prop

A prop wrapper that applies a `BlockMask` to the write space, filtering which blocks the child prop is allowed to place or replace.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Prop prop
private final MaskVoxelSpace maskVoxelSpace
private final Prop.Context rChildContext
