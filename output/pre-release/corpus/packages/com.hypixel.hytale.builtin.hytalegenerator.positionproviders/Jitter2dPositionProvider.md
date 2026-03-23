# Jitter2dPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class Jitter2dPositionProvider extends PositionProvider

Wraps another position provider, applying random 2D (XZ-plane) jitter to each emitted position using a seeded RNG field. Positions that fall outside the context bounds after jitter are discarded.

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private static final double SEED_GENERATOR_RESOLUTION
private final double magnitude
private final PositionProvider positionProvider
private final RngField rngField
private final FastRandom random
private final Vector3d rVector
private final Bounds3d rBounds
private final PositionProvider.Context rChildContext
private PositionProvider.Context rContext
private final Pipe.One<Vector3d> rChildPipe
