# UnionPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class UnionPositionProvider extends PositionProvider

Provider supplying UnionPosition values based on context.

## Fields

- @Nonnull private final List<PositionProvider> positionProviders

## Methods

- public UnionPositionProvider(@Nonnull List<PositionProvider> positionProviders)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private final List<PositionProvider> positionProviders
