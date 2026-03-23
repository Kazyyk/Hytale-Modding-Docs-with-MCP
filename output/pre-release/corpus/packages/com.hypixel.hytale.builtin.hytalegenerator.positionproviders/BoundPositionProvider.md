# BoundPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class BoundPositionProvider extends PositionProvider

Provider supplying BoundPosition values based on context.

## Fields

- @Nonnull private final PositionProvider positionProvider
- private final Bounds3d bounds

## Methods

- public BoundPositionProvider(@Nonnull PositionProvider positionProvider, @Nonnull Bounds3d bounds)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private final PositionProvider positionProvider
private final Bounds3d bounds
private final PositionProvider.Context rChildContext
