# PositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders

public abstract class PositionProvider

Abstract base class providing shared logic for PositionProvider implementations.

## Methods

- public abstract void positionsIn(@Nonnull PositionProvider.Context var1)
- @Nonnull public static PositionProvider noPositionProvider()

Known subclasses: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, CachedPositionProvider, CachedPositionProvider, ClustersPositionProvider, EmptyPositionProvider, EntityPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, ClustersPositionProvider, Context, Delimiter, EmptyPositionProvider, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Jitter2dPositionProvider, Jitter3dPositionProvider, ListPositionProvider, OffsetPositionProvider, ScalerPositionProvider, SimpleHorizontalPositionProvider, SquareGrid2dPositionProvider, SquareGrid3dPositionProvider, TriangularGrid2dPositionProvider, UnionPositionProvider

Complete API:
  public abstract void generate(PositionProvider.Context var1)
