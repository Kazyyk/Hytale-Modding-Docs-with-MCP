# PrefabProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props | Extends: Prop

public class PrefabProp extends Prop

A prop that places prefab structures into the voxel world. Picks from a weighted pool of prefabs, places blocks and entities with rotation support.

Also in this package: Block, Context, CuboidProp, DensityProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  private IPrefabBuffer pickPrefab(Random rand)
  private static Bounds3i getWriteBounds(IPrefabBuffer prefab)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Bounds3i writeBounds
private final WeightedMap<List<IPrefabBuffer>> prefabPool
private final MaterialCache materialCache
private final RngField rngField
private final FastRandom random
private final int prefabId
private final Vector3i rPrefabPosition
private final PrefabProp.IntersectingColumnPredicate<PrefabBufferCall> rColumnPredicate
private final Vector3i rWorldPosition
private final Vector3d rEntityWorldPosition
