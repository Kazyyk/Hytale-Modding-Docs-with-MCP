# AnchorPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class AnchorPositionProvider extends PositionProvider

Provider supplying AnchorPosition values based on context.

## Fields

- @Nonnull private final PositionProvider positionProvider
- private final boolean isReversed

## Methods

- public AnchorPositionProvider(@Nonnull PositionProvider positionProvider, boolean isReversed)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private final PositionProvider positionProvider
private final boolean isReversed
private final Bounds3d rOffsetBounds
private final PositionProvider.Context rChildContext
private final Vector3d rNewPosition
private final Vector3d rAnchor
private PositionProvider.Context rContext
private final Pipe.One<Vector3d> rChildPipe
