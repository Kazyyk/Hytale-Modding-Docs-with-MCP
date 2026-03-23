# SpatialQuery

Type: interface | Package: com.hypixel.hytale.builtin.portals.utils.posqueries

public interface SpatialQuery

## Methods

- @Nonnull Stream<Vector3d> createCandidates(World var1, Vector3d var2, SpatialQueryDebug var3)
- @Nonnull default SpatialQuery then(SpatialQuery expand)
- @Nonnull default SpatialQuery filter(PositionPredicate predicate)
- @Nonnull default Optional<Vector3d> execute(World world, Vector3d origin)
- @Nonnull default Optional<Vector3d> debug(World world, Vector3d origin)
