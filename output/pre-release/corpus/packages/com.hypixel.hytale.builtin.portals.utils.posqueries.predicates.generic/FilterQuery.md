# FilterQuery

Type: class | Package: com.hypixel.hytale.builtin.portals.utils.posqueries.predicates.generic | Implements: SpatialQuery

public class FilterQuery implements SpatialQuery

## Fields

- private final SpatialQuery query
- private final PositionPredicate predicate
- private final boolean failFast

## Methods

- @Nonnull @Override public Stream<Vector3d> createCandidates(World world, Vector3d origin, SpatialQueryDebug debug)

Also in this package: FlatMapQuery

Complete API:
  public Stream<Vector3d> createCandidates(World world, Vector3d origin, SpatialQueryDebug debug)

Fields:
private final SpatialQuery query
private final PositionPredicate predicate
private final boolean failFast
