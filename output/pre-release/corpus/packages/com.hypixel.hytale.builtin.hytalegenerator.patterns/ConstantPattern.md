# ConstantPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class ConstantPattern extends Pattern

Pattern that always returns a fixed boolean value. Two singleton instances (`INSTANCE_TRUE` and `INSTANCE_FALSE`) are provided; the constructor is private.

## Fields

- public static final ConstantPattern INSTANCE_TRUE
- public static final ConstantPattern INSTANCE_FALSE
- private final boolean value

## Methods

- @Override public boolean matches(@NonNullDecl Pattern.Context context)
- @NonNullDecl @Override public Bounds3i getBounds_voxelGrid()

Also in this package: AndPattern, Context, CuboidPattern, Facing, FieldFunctionPattern, MaterialPattern, MaterialSetPattern, NotPattern, OffsetPattern, OrPattern, Pattern, RotatorPattern, SurfacePattern, WallDirection, WallPattern

Complete API:
  public boolean matches(Pattern.Context context)
  public Bounds3i getBounds_voxelGrid()

Fields:
public static final ConstantPattern INSTANCE_TRUE
public static final ConstantPattern INSTANCE_FALSE
private final boolean value
