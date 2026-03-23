# SpherePositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class SpherePositionProvider extends PositionProvider

Provider supplying SpherePosition values based on context.

## Fields

- @Nonnull private final PositionProvider positionProvider
- private final double range

## Methods

- public SpherePositionProvider(@Nonnull PositionProvider positionProvider, double range)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, Context, Delimiter, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, UnionPositionProvider

Complete API:
  public void positionsIn(PositionProvider.Context context)

Fields:
private final PositionProvider positionProvider
private final double range
