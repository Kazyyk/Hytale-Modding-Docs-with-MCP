# FieldFunctionPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class FieldFunctionPattern extends Pattern

Pattern that matches when a `Density` field value at the evaluated position falls within any of the configured `RangeDouble` delimiters. Delimiters are added after construction via `addDelimiter`.

## Fields

- @Nonnull private final Density field
- @Nonnull private final List<RangeDouble> delimiters
- @Nonnull private final Density.Context rDensityContext

## Constructors

- FieldFunctionPattern(@Nonnull Density field)

## Methods

- @Override public boolean matches(@Nonnull Pattern.Context context)
- @NonNullDecl @Override public Bounds3i getBounds_voxelGrid()
- public void addDelimiter(double min, double max)

Also in this package: AndPattern, ConstantPattern, Context, CuboidPattern, Facing, MaterialPattern, MaterialSetPattern, NotPattern, OffsetPattern, OrPattern, Pattern, RotatorPattern, SurfacePattern, WallDirection, WallPattern

Complete API:
  public boolean matches(Pattern.Context context)
  public Bounds3i getBounds_voxelGrid()
  public void addDelimiter(double min, double max)

Fields:
private final Density field
private final List<RangeDouble> delimiters
private final Density.Context rDensityContext
