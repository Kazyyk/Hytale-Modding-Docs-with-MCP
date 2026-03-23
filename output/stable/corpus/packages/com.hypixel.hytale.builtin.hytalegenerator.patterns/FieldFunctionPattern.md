# FieldFunctionPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class FieldFunctionPattern extends Pattern

## Fields

- private final Density field
- private final SpaceSize readSpaceSize
- private final List<FieldFunctionPattern.Delimiter> delimiters
- private final Density.Context rDensityContext
- double density
- FieldFunctionPattern.Delimiter d
- double min
- double max

## Constructors

- public FieldFunctionPattern(@Nonnull Density field)

## Methods

- public boolean matches(@Nonnull Pattern.Context context)
- public SpaceSize readSpace()
- public void addDelimiter(double min, double max)
- boolean isInside(double v)

## Inner Types

- `FieldFunctionPattern.Delimiter`

## Related Types

- Pattern

Also in this package: AndPattern, CeilingPattern, Context, CuboidPattern, Delimiter, Facing, GapPattern, MaterialPattern, MaterialSetPattern, NotPattern, OffsetPattern, OrPattern, Pattern, PositionedPattern, SurfacePattern, WallDirection, WallPattern

Complete API:
  public boolean matches(Pattern.Context context)
  public SpaceSize readSpace()
  public void addDelimiter(double min, double max)

Fields:
private final Density field
private final SpaceSize readSpaceSize
private final List<FieldFunctionPattern.Delimiter> delimiters
private final Density.Context rDensityContext
