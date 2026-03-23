# CeilingPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class CeilingPattern extends Pattern

## Fields

- private final Pattern ceilingPattern
- private final Pattern airPattern
- private final SpaceSize readSpaceSize
- SpaceSize ceilingSpace
- Vector3i ceilingPosition
- Pattern.Context ceilingContext

## Constructors

- public CeilingPattern(@Nonnull Pattern ceilingPattern, @Nonnull Pattern airPattern)

## Methods

- public boolean matches(@Nonnull Pattern.Context context)
- public SpaceSize readSpace()

## Related Types

- Pattern

Also in this package: AndPattern, Context, CuboidPattern, Delimiter, Facing, FieldFunctionPattern, GapPattern, MaterialPattern, MaterialSetPattern, NotPattern, OffsetPattern, OrPattern, Pattern, PositionedPattern, SurfacePattern, WallDirection, WallPattern

Complete API:
  public boolean matches(Pattern.Context context)
  public SpaceSize readSpace()

Fields:
private final Pattern ceilingPattern
private final Pattern airPattern
private final SpaceSize readSpaceSize
