# OffsetPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class OffsetPositionProvider extends PositionProvider

Provider supplying OffsetPosition values based on context.

## Fields

- @Nonnull private final Vector3i offset3i
- @Nonnull private final Vector3d offset3d
- @Nonnull private final PositionProvider positionProvider

## Methods

- public OffsetPositionProvider(@Nonnull Vector3i offset, @Nonnull PositionProvider positionProvider)
- public OffsetPositionProvider(@Nonnull Vector3d offset, @Nonnull PositionProvider positionProvider)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private final Vector3d vector
private final PositionProvider positionProvider
private final Bounds3d rBounds
private final PositionProvider.Context rChildContext
private PositionProvider.Context rContext
private final Pipe.One<Vector3d> rChildPipe
