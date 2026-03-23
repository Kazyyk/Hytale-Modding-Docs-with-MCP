# FieldFunctionPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class FieldFunctionPositionProvider extends PositionProvider

Provider supplying FieldFunctionPosition values based on context.

## Fields

- @Nonnull private final Density field
- @Nonnull private final List<FieldFunctionPositionProvider.Delimiter> delimiters
- @Nonnull private final PositionProvider positionProvider

## Methods

- public FieldFunctionPositionProvider(@Nonnull Density field, @Nonnull PositionProvider positionProvider)
- public void addDelimiter(double min, double max)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)
  public void addDelimiter(double min, double max)

Fields:
private final Density field
private final List<FieldFunctionPositionProvider.Delimiter> delimiters
private final PositionProvider positionProvider
private final PositionProvider.Context rChildContext
private final Density.Context rDensityContext
private PositionProvider.Context rContext
private final Pipe.One<Vector3d> rChildPipe
