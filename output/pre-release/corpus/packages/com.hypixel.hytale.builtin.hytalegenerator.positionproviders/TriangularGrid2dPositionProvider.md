# TriangularGrid2dPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class TriangularGrid2dPositionProvider extends PositionProvider

Generates positions on a 2D triangular (hexagonal) grid at Y=0. Alternating rows are offset by half a unit for triangular tiling. Only emits positions within bounds.

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)
  private static double toX0(double position)
  private static double toCellGrid(double position)

Fields:
private static final double Y
private static final double SPACING
private static final double HALF_SPACING
private static final double X_HEIGHT
private static final double X_HEIGHT_INVERSE
private final Vector3d rPosition
private final Bounds3d rGridBounds
private final Control rControl
