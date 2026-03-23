# Jitter3dPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class Jitter3dPositionProvider extends PositionProvider

Wraps another position provider, applying random 3D jitter to each emitted position using a seeded RNG field. Uses spherical rotation for uniform 3D distribution. Positions outside bounds after jitter are discarded.

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void generate(PositionProvider.Context context)

Fields:
private static final float PI
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
