# BaseHeightPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class BaseHeightPositionProvider extends PositionProvider

Provider supplying BaseHeightPosition values based on context.

## Fields

- @Nonnull private final double baseHeight
- private final double maxYInput
- private final double minYInput
- @Nonnull private final PositionProvider positionProvider

## Methods

- public BaseHeightPositionProvider(double baseHeight, @Nonnull PositionProvider positionProvider, double minYInput, double maxYInput)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BoundPositionProvider, Context, Delimiter, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, SpherePositionProvider, UnionPositionProvider

Complete API:
  public void positionsIn(PositionProvider.Context context)

Fields:
private final double baseHeight
private final double maxYInput
private final double minYInput
private final PositionProvider positionProvider
