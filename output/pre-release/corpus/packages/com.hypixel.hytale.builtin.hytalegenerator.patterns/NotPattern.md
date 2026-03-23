# NotPattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns | Extends: Pattern

public class NotPattern extends Pattern

Logical NOT wrapper that inverts the result of a delegate Pattern. Returns `true` when the wrapped pattern returns `false`, and vice versa. Delegates its voxel-grid bounds to the wrapped pattern.

## Fields

- @Nonnull private final Pattern pattern

## Constructors

- NotPattern(@Nonnull Pattern pattern)

## Methods

- @Override public boolean matches(@Nonnull Pattern.Context context)
- @NonNullDecl @Override public Bounds3i getBounds_voxelGrid()
