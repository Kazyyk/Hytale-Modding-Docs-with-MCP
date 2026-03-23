# CuboidPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class CuboidPattern extends Pattern

## Fields

- private final Pattern subPattern
- private final Vector3i min
- private final Vector3i max
- private final SpaceSize readSpaceSize
- private final Vector3i rScanMin
- private final Vector3i rScanMax
- private final Vector3i rChildPosition
- private final Pattern.Context rChildContext

## Constructors

- public CuboidPattern(@Nonnull Pattern subPattern, @Nonnull Vector3i min, @Nonnull Vector3i max)

## Methods

- public boolean matches(@Nonnull Pattern.Context context)
- public SpaceSize readSpace()

## Related Types

- Pattern

Also in this package: AndPattern, ConstantPattern, Context, Facing, FieldFunctionPattern, MaterialPattern, MaterialSetPattern, NotPattern, OffsetPattern, OrPattern, Pattern, RotatorPattern, SurfacePattern, WallDirection, WallPattern

Complete API:
  public boolean matches(Pattern.Context context)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final Pattern subPattern
private final Vector3i min
private final Vector3i max
private final Bounds3i bounds_voxelGrid
private final Vector3i rScanMin
private final Vector3i rScanMax
private final Vector3i rChildPosition
private final Pattern.Context rChildContext
