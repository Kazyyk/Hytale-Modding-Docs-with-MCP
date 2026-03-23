# VoxelSpace

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.voxelspace

public interface VoxelSpace<T>

Generic interface for 3D voxel grids. Provides get/set operations by coordinate or vector, bulk fill, and bounds access.

## Methods


void set(@Nullable T var1, int var2, int var3, int var4)


void set(@Nullable T var1, @Nonnull Vector3i var2)


void setAll(@Nullable T var1)


@Nullable
    T get(int var1, int var2, int var3)


@Nullable
    T get(@Nonnull Vector3i var1)


@Nonnull
    Bounds3i getBounds()
