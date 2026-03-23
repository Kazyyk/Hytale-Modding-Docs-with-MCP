# AnchorPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class AnchorPositionProvider extends PositionProvider

Provider supplying AnchorPosition values based on context.

## Fields

- @Nonnull private final PositionProvider positionProvider
- private final boolean isReversed

## Methods

- public AnchorPositionProvider(@Nonnull PositionProvider positionProvider, boolean isReversed)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: BaseHeightPositionProvider, BoundPositionProvider, Context, Delimiter, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, SpherePositionProvider, UnionPositionProvider

Complete API:
  public void positionsIn(PositionProvider.Context context)

Fields:
private final PositionProvider positionProvider
private final boolean isReversed
