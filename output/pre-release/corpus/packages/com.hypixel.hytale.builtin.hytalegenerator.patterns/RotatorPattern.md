# RotatorPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class RotatorPattern extends Pattern

Pattern decorator that applies a rotation transform before delegating to a child Pattern. Uses a `RotationVoxelSpace` to rotate the material-space read coordinates, allowing the child pattern to operate in rotated local space. The voxel-grid bounds are the rotation-expanded bounds of the child pattern.

## Fields

- @Nonnull private final Pattern pattern
- @Nonnull private final Bounds3i bounds
- @Nonnull private final RotationVoxelSpace readRotationVoxelSpace
- @Nonnull private final Pattern.Context rChildContext

## Constructors

- RotatorPattern(@Nonnull Pattern pattern, @Nonnull RotationTuple rotation, @Nonnull MaterialCache materialCache)

## Methods

- @Override public boolean matches(@NonNullDecl Pattern.Context context)
- @NonNullDecl @Override public Bounds3i getBounds_voxelGrid()

Also in this package: AndPattern, ConstantPattern, Context, CuboidPattern, Facing, FieldFunctionPattern, MaterialPattern, MaterialSetPattern, NotPattern, OffsetPattern, OrPattern, Pattern, SurfacePattern, WallDirection, WallPattern

Complete API:
  public boolean matches(Pattern.Context context)
  public Bounds3i getBounds_voxelGrid()

Fields:
private final Pattern pattern
private final Bounds3i bounds
private final RotationVoxelSpace readRotationVoxelSpace
private final Pattern.Context rChildContext
