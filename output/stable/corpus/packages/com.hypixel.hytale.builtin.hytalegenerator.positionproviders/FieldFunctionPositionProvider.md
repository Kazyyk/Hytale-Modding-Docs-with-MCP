# FieldFunctionPositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class FieldFunctionPositionProvider extends PositionProvider

Provider supplying FieldFunctionPosition values based on context.

## Fields

- @Nonnull private final Density field
- @Nonnull private final List<FieldFunctionPositionProvider.Delimiter> delimiters
- @Nonnull private final PositionProvider positionProvider

## Methods

- public FieldFunctionPositionProvider(@Nonnull Density field, @Nonnull PositionProvider positionProvider)
- public void addDelimiter(double min, double max)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, Context, Delimiter, FieldFunctionOccurrencePositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, SpherePositionProvider, UnionPositionProvider

Complete API:
  public void addDelimiter(double min, double max)
  public void positionsIn(PositionProvider.Context context)

Fields:
private final Density field
private final List<FieldFunctionPositionProvider.Delimiter> delimiters
private final PositionProvider positionProvider
