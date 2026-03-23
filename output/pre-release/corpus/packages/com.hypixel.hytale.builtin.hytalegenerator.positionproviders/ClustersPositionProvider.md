# ClustersPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class ClustersPositionProvider extends PositionProvider

A position provider that generates clustered groups of positions. Uses a distributor provider to determine cluster center locations and a cluster provider to generate positions within each cluster.

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private final PositionProvider clusterPositions
private final PositionProvider distributorPositions
private final Bounds3d clusterBounds
private final Bounds3d clusterBoundsFlipped
private final Bounds3d rDistributionBounds
private final PositionProvider.Context rDistributionContext
private final Bounds3d rClusterBounds
private final PositionProvider.Context rClusterContext
private PositionProvider.Context rContext
private Control rControl
private final Pipe.One<Vector3d> rDistributionPipe
private final Pipe.One<Vector3d> rClusterPipe
