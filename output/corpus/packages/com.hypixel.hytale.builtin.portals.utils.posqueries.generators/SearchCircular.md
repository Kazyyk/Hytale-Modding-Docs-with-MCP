# SearchCircular

Type: class | Package: com.hypixel.hytale.builtin.portals.utils.posqueries.generators | Implements: SpatialQuery

public class SearchCircular implements SpatialQuery

## Fields

- private final double minRadius
- private final double maxRadius
- private final int attempts

## Methods

- @Nonnull @Override public Stream<Vector3d> createCandidates(World world, Vector3d origin, SpatialQueryDebug debug)
