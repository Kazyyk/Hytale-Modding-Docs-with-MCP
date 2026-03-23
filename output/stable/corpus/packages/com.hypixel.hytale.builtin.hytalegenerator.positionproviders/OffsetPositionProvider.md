# OffsetPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class OffsetPositionProvider extends PositionProvider

Provider supplying OffsetPosition values based on context.

## Fields

- @Nonnull private final Vector3i offset3i
- @Nonnull private final Vector3d offset3d
- @Nonnull private final PositionProvider positionProvider

## Methods

- public OffsetPositionProvider(@Nonnull Vector3i offset, @Nonnull PositionProvider positionProvider)
- public OffsetPositionProvider(@Nonnull Vector3d offset, @Nonnull PositionProvider positionProvider)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, Context, Delimiter, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, SpherePositionProvider, UnionPositionProvider

Complete API:
  public void positionsIn(PositionProvider.Context context)

Fields:
private final Vector3i offset3i
private final Vector3d offset3d
private final PositionProvider positionProvider
