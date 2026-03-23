# ListPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class ListPositionProvider extends PositionProvider

Provider supplying ListPosition values based on context.

## Fields

- private List<Vector3i> positions3i
- private List<Vector3d> positions3d

## Methods

- private ListPositionProvider()
- @Nonnull public static ListPositionProvider from3i(@Nonnull List<Vector3i> positions3i)
- @Nonnull public static ListPositionProvider from3d(@Nonnull List<Vector3d> positions3d)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, Context, Delimiter, FieldFunctionOccurrencePositionProvider, FieldFunctionPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, SpherePositionProvider, UnionPositionProvider

Complete API:
  public static ListPositionProvider from3i(List<Vector3i> positions3i)
  public static ListPositionProvider from3d(List<Vector3d> positions3d)
  public void positionsIn(PositionProvider.Context context)

Fields:
private List<Vector3i> positions3i
private List<Vector3d> positions3d
