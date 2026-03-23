# UnionPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class UnionPositionProvider extends PositionProvider

Provider supplying UnionPosition values based on context.

## Fields

- @Nonnull private final List<PositionProvider> positionProviders

## Methods

- public UnionPositionProvider(@Nonnull List<PositionProvider> positionProviders)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, Context, Delimiter, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, SpherePositionProvider

Complete API:
  public void positionsIn(PositionProvider.Context context)

Fields:
private final List<PositionProvider> positionProviders
