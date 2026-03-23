# SquareGrid2dPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class SquareGrid2dPositionProvider extends PositionProvider

Generates positions on a regular 2D square grid (unit spacing) at Y=0. Only emits positions within the provided bounds.

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private static final double Y
private final Vector3d rPosition
private final Bounds3d rGridBounds
private final Control rControl
