# BoundPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class BoundPositionProvider extends PositionProvider

Provider supplying BoundPosition values based on context.

## Fields

- @Nonnull private final PositionProvider positionProvider
- private final Bounds3d bounds

## Methods

- public BoundPositionProvider(@Nonnull PositionProvider positionProvider, @Nonnull Bounds3d bounds)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, Context, Delimiter, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, SpherePositionProvider, UnionPositionProvider

Complete API:
  public void positionsIn(PositionProvider.Context context)

Fields:
private final PositionProvider positionProvider
private final Bounds3d bounds
