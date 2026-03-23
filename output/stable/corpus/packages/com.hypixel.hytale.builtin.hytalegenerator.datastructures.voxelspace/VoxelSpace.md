# VoxelSpace

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures.voxelspace

public interface VoxelSpace<T>

## Methods

- boolean set(T var1, int var2, int var3, int var4)
- boolean set(T var1, @Nonnull Vector3i var2)
- void set(T var1)
- void setOrigin(int var1, int var2, int var3)
- @Nullable T getContent(int var1, int var2, int var3)
- @Nullable T getContent(@Nonnull Vector3i var1)
- boolean replace(T var1, int var2, int var3, int var4, @Nonnull Predicate<T> var5)
- void pasteFrom(@Nonnull VoxelSpace<T> var1)
- int getOriginX()
- int getOriginY()
- int getOriginZ()
- String getName()
- boolean isInsideSpace(int var1, int var2, int var3)
- boolean isInsideSpace(@Nonnull Vector3i var1)
- void forEach(VoxelConsumer<? super T> var1)
- @Nonnull Bounds3i getBounds()
- int minX()
- int maxX()
- int minY()
- int maxY()
- int minZ()
- int maxZ()
- int sizeX()
- int sizeY()
- int sizeZ()
