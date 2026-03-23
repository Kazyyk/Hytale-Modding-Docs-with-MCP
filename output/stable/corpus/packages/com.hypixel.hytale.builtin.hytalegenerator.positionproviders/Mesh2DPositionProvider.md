# Mesh2DPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class Mesh2DPositionProvider extends PositionProvider

Provider supplying Mesh2DPosition values based on context.

## Fields

- @Nonnull private final PointProvider pointGenerator
- private final int y

## Methods

- public Mesh2DPositionProvider(@Nonnull PointProvider positionProvider, int y)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, Context, Delimiter, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, ListPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, SpherePositionProvider, UnionPositionProvider

Complete API:
  public void positionsIn(PositionProvider.Context context)

Fields:
private final PointProvider pointGenerator
private final int y
