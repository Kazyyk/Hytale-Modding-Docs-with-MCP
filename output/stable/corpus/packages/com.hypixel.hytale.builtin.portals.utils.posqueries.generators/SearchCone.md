# SearchCone

Type: class | Package: com.hypixel.hytale.builtin.portals.utils.posqueries.generators | Implements: SpatialQuery

public class SearchCone implements SpatialQuery

## Fields

- private final Vector3d direction
- private final double minRadius
- private final double maxRadius
- private final double maxDegrees
- private final int attempts

## Methods

- @Nonnull @Override public Stream<Vector3d> createCandidates(World world, Vector3d origin, SpatialQueryDebug debug)

Also in this package: SearchBelow, SearchCircular

Complete API:
  public Stream<Vector3d> createCandidates(World world, Vector3d origin, SpatialQueryDebug debug)

Fields:
private final Vector3d direction
private final double minRadius
private final double maxRadius
private final double maxDegrees
private final int attempts
