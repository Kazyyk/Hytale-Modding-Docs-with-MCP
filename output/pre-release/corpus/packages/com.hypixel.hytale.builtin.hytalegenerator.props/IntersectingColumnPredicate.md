# PrefabProp.IntersectingColumnPredicate

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: java.lang.Object | Implements: IPrefabBuffer.ColumnPredicate<T>

private static class IntersectingColumnPredicate<T> implements IPrefabBuffer.ColumnPredicate<T>

Column predicate used by PrefabProp to filter prefab iteration to columns intersecting the write space bounds.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean test(int x, int z, int blocks, T o)

Fields:
public Bounds3i bounds
