# DensityProp

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.props

public class DensityProp

Prop that places material based on a density field evaluation at each voxel position.

Also in this package: Block, Context, CuboidProp, DensitySelectorProp, EmptyProp, IntersectingColumnPredicate, LocatorProp, ManualProp, MaskProp, OffsetProp, OrienterProp, PickedScanResult, PondFillerProp, PrefabProp, Prop, QueueProp, SelectionMode, StaticRotatorProp, UnionProp, WeightedProp

Complete API:
  public boolean generate(Prop.Context context)
  public Bounds3i getReadBounds_voxelGrid()
  public Bounds3i getWriteBounds_voxelGrid()

Fields:
private final Density density
private final MaterialProvider<Material> materialProvider
private final Bounds3i writeBounds
private final Bounds3i solidityBufferBounds
private final Bounds3i rIntersectingWriteBounds
private final ArrayVoxelSpace<Boolean> rSolidityBuffer
private final Density.Context rDensityContext
private final MaterialProvider.Context rMaterialProviderContext
private final Vector3i rPosition
private final int[] rDepthIntoCeiling
private final int[] rDepthIntoFloor
private final int[] rSpaceBelowCeiling
private final int[] rSpaceAboveFloor
