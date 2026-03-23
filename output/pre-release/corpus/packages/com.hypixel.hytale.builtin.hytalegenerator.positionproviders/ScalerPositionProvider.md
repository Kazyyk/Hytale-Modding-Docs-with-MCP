# ScalerPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class ScalerPositionProvider extends PositionProvider

Wraps another position provider, scaling its output positions by a 3D scale vector. The child provider operates in inverse-scaled bounds so that emitted positions map back to the original coordinate space after scaling.

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private final Vector3d scale
private final Vector3d inverseScale
private final PositionProvider positionProvider
private final PositionProvider.Context rChildContext
private final Bounds3d rChildBounds
private PositionProvider.Context rContext
private final Pipe.One<Vector3d> rChildPipe
