# FieldFunctionOccurrencePositionProvider

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.positionproviders | Extends: PositionProvider

public class FieldFunctionOccurrencePositionProvider extends PositionProvider

Provider supplying FieldFunctionOccurrencePosition values based on context.

## Constants

- public static final double FP_RESOLUTION

## Fields

- @Nonnull private final Density field
- @Nonnull private final PositionProvider positionProvider
- @Nonnull private final SeedGenerator seedGenerator

## Methods

- public FieldFunctionOccurrencePositionProvider(@Nonnull Density field, @Nonnull PositionProvider positionProvider, int seed)
- @Override public void positionsIn(@Nonnull PositionProvider.Context context)

Also in this package: AnchorPositionProvider, BaseHeightPositionProvider, BoundPositionProvider, Context, Delimiter, FieldFunctionPositionProvider, ListPositionProvider, Mesh2DPositionProvider, Mesh3DPositionProvider, OffsetPositionProvider, PositionProvider, SimpleHorizontalPositionProvider, SpherePositionProvider, UnionPositionProvider

Complete API:
  public void positionsIn(PositionProvider.Context context)

Fields:
public static final double FP_RESOLUTION
private final Density field
private final PositionProvider positionProvider
private final SeedGenerator seedGenerator
