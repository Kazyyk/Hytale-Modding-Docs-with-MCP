# Pattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: null

public abstract class Pattern

## Fields

- final SpaceSize space
- public Vector3i position
- public VoxelSpace<Material> materialSpace

## Methods

- public abstract boolean matches(@Nonnull Pattern.Context var1)
- public abstract SpaceSize readSpace()
- public static Pattern noPattern()
- public boolean matches(@Nonnull Pattern.Context context)
- public SpaceSize readSpace()
- public static Pattern yesPattern()
- public Context()
- public Context(@Nonnull Vector3i position, @Nullable VoxelSpace<Material> materialSpace)
- public Context(@Nonnull Pattern.Context other)
- public void assign(@Nonnull Pattern.Context other)

## Inner Types

- `Pattern.Context`
