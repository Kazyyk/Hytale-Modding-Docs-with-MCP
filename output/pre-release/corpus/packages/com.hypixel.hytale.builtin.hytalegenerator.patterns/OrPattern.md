# OrPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class OrPattern extends Pattern

## Fields

- private final Pattern[] patterns
- private final SpaceSize readSpaceSize
- SpaceSize spaceAcc
- Pattern pattern

## Constructors

- public OrPattern(@Nonnull List<Pattern> patterns)

## Methods

- public boolean matches(@Nonnull Pattern.Context context)
- public SpaceSize readSpace()

## Related Types

- Pattern

Also in this package: AndPattern, ConstantPattern, Context, CuboidPattern, Facing, FieldFunctionPattern, MaterialPattern, MaterialSetPattern, NotPattern, OffsetPattern, Pattern, RotatorPattern, SurfacePattern, WallDirection, WallPattern

Complete API:
  public boolean matches(Pattern.Context context)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final Pattern[] patterns
private final Bounds3i bounds_voxelGrid
