# BaseHeightPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class BaseHeightPositionProvider extends PositionProvider

Provider supplying BaseHeightPosition values based on context.

## Fields

- @Nonnull private final double baseHeight
- private final double maxYInput
- private final double minYInput
- @Nonnull private final PositionProvider positionProvider

## Methods

- public BaseHeightPositionProvider(double baseHeight, @Nonnull PositionProvider positionProvider, double minYInput, double maxYInput)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private final double baseHeight
private final double maxYInput
private final double minYInput
private final PositionProvider positionProvider
private final Vector3d rOffsetPosition
private PositionProvider.Context rContext
private final PositionProvider.Context rChildContext
private final Pipe.One<Vector3d> rChildPipe
