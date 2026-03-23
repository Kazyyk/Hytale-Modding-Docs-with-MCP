# FieldFunctionOccurrencePositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class FieldFunctionOccurrencePositionProvider extends PositionProvider

Provider supplying FieldFunctionOccurrencePosition values based on context.

## Constants

- public static final double FP_RESOLUTION

## Fields

- @Nonnull private final Density field
- @Nonnull private final PositionProvider positionProvider
- @Nonnull private final SeedGenerator seedGenerator

## Methods

- public FieldFunctionOccurrencePositionProvider(@Nonnull Density field, @Nonnull PositionProvider positionProvider, int seed)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
public static final double FP_RESOLUTION
private final Density field
private final PositionProvider positionProvider
private final RngField rngField
private final FastRandom rRandom
private PositionProvider.Context rContext
private final PositionProvider.Context rChildContext
private final Density.Context rDensityContext
private final Pipe.One<Vector3d> rChildPipe
