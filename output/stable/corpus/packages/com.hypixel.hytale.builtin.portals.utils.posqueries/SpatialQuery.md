# SpatialQuery

Type: interface | Package: com.hypixel.hytale.builtin.portals.utils.posqueries

public interface SpatialQuery

## Methods

- @Nonnull Stream<Vector3d> createCandidates(World var1, Vector3d var2, SpatialQueryDebug var3)
- @Nonnull default SpatialQuery then(SpatialQuery expand)
- @Nonnull default SpatialQuery filter(PositionPredicate predicate)
- @Nonnull default Optional<Vector3d> execute(World world, Vector3d origin)
- @Nonnull default Optional<Vector3d> debug(World world, Vector3d origin)

Known implementors: FilterQuery, FlatMapQuery, SearchBelow, SearchCircular, SearchCone

Also in this package: PositionPredicate, SpatialQueryDebug

Complete API:
  Stream<Vector3d> createCandidates(World var1, Vector3d var2, SpatialQueryDebug var3)
  default SpatialQuery then(SpatialQuery expand)
  default SpatialQuery filter(PositionPredicate predicate)
  default Optional<Vector3d> execute(World world, Vector3d origin)
  default Optional<Vector3d> debug(World world, Vector3d origin)
