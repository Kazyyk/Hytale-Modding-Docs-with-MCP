# PositionProvider.Context

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: java.lang.Object

public static class Context

Mutable context object passed to position providers during generation. Carries the spatial bounds, output pipe, and optional anchor point.

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, PositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public void assign(PositionProvider.Context other)
  public void assign(PropDistribution.Context other)

Fields:
public Bounds3d bounds
public Pipe.One<Vector3d> pipe
public Vector3d anchor
