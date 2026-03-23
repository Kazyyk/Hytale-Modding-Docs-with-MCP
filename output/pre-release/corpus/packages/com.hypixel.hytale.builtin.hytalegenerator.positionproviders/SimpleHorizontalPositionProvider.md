# SimpleHorizontalPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class SimpleHorizontalPositionProvider extends PositionProvider

Provider supplying SimpleHorizontalPosition values based on context.

## Fields

- @Nonnull private final RangeDouble rangeY
- @Nonnull private final PositionProvider positionProvider

## Methods

- public SimpleHorizontalPositionProvider(@Nonnull RangeDouble rangeY, @Nonnull PositionProvider positionProvider)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private final RangeDouble rangeY
private final PositionProvider positionProvider
private final PositionProvider.Context rChildContext
private PositionProvider.Context rContext
private final Pipe.One<Vector3d> rChildPipe
