# OffsetPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class OffsetPattern extends Pattern

## Fields

- private final Pattern pattern
- private final Vector3i offset
- private final SpaceSize readSpaceSize
- private final Vector3i rChildPosition
- private final Pattern.Context rChildContext

## Constructors

- public OffsetPattern(@Nonnull Pattern pattern, @Nonnull Vector3i offset)

## Methods

- public boolean matches(@Nonnull Pattern.Context context)
- public SpaceSize readSpace()

## Related Types

- Pattern

Also in this package: AndPattern, ConstantPattern, Context, CuboidPattern, Facing, FieldFunctionPattern, MaterialPattern, MaterialSetPattern, NotPattern, OrPattern, Pattern, RotatorPattern, SurfacePattern, WallDirection, WallPattern

Complete API:
  public boolean matches(Pattern.Context context)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final Pattern pattern
private final Vector3i offset
private final Bounds3i bounds_voxelGrid
private final Vector3i rChildPosition
private final Pattern.Context rChildContext
