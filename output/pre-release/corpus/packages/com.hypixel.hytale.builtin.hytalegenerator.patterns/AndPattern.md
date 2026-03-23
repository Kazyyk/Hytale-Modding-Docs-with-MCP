# AndPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class AndPattern extends Pattern

## Fields

- private final Pattern[] patterns
- private final SpaceSize readSpaceSize
- SpaceSize spaceAcc
- Pattern pattern

## Constructors

- public AndPattern(@Nonnull List<Pattern> patterns)

## Methods

- public boolean matches(@Nonnull Pattern.Context context)
- public SpaceSize readSpace()

## Related Types

- Pattern

Also in this package: ConstantPattern, Context, CuboidPattern, Facing, FieldFunctionPattern, MaterialPattern, MaterialSetPattern, NotPattern, OffsetPattern, OrPattern, Pattern, RotatorPattern, SurfacePattern, WallDirection, WallPattern

Complete API:
  public boolean matches(Pattern.Context context)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final Pattern[] patterns
private final Bounds3i bounds_voxelGrid
