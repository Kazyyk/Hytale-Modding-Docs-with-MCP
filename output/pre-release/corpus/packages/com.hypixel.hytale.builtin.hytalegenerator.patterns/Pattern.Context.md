# Pattern.Context

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns

public static class Context

Carries the position and material voxel space for pattern evaluation. Instances are reused and reassigned between evaluations to avoid allocation.

## Fields

- @Nonnull public Vector3i position
- @Nonnull public VoxelSpace<Material> materialSpace

## Constructors

- Context()
- Context(@Nonnull Vector3i position, @Nullable VoxelSpace<Material> materialSpace)
- Context(@Nonnull Pattern.Context other)

## Methods

- public void assign(@Nonnull Pattern.Context other)
- public void assign(@Nonnull Prop.Context other)