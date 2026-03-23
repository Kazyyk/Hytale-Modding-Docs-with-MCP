# Pattern

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.patterns

public abstract class Pattern

Abstract base class for world-generation pattern matching. A pattern tests whether a voxel position within a material space satisfies some condition, and declares its voxel-grid bounding box for spatial queries.

## Inner Types

- Pattern.Context | class

## Methods

- public abstract boolean matches(@Nonnull Pattern.Context var1)
- @Nonnull public abstract Bounds3i getBounds_voxelGrid()
