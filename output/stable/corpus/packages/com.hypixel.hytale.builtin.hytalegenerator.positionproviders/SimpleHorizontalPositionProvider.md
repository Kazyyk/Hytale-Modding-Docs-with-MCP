# SimpleHorizontalPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class SimpleHorizontalPositionProvider extends PositionProvider

Provider supplying SimpleHorizontalPosition values based on context.

## Fields

- @Nonnull private final RangeDouble rangeY
- @Nonnull private final PositionProvider positionProvider

## Methods

- public SimpleHorizontalPositionProvider(@Nonnull RangeDouble rangeY, @Nonnull PositionProvider positionProvider)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, Context, Delimiter, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, PositionProvider, SpherePositionProvider, UnionPositionProvider

Complete API:
  public void positionsIn(PositionProvider.Context context)

Fields:
private final RangeDouble rangeY
private final PositionProvider positionProvider
