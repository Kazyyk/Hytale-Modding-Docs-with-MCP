# NullSpace

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures.voxelspace | Implements: VoxelSpace<V>

public class NullSpace<V> implements VoxelSpace<V>

## Fields

- private static final NullSpace INSTANCE

## Methods

- @Nonnull public static <V> NullSpace<V> instance()
- @Nonnull public static <V> NullSpace<V> instance(@Nonnull Class<V> clazz)
- @Override public boolean set(V content, int x, int y, int z)
- @Override public boolean set(V content, @Nonnull Vector3i position)
- @Override public void set(V content)
- @Override public void setOrigin(int x, int y, int z)
- @Override @Nullable public V getContent(int x, int y, int z)
- @Override @Nullable public V getContent(@Nonnull Vector3i position)
- @Override public boolean replace(V replacement, int x, int y, int z, @Nonnull Predicate<V> mask)
- @Override public void pasteFrom(@Nonnull VoxelSpace<V> source)
- @Override public int getOriginX()
- @Override public int getOriginY()
- @Override public int getOriginZ()
- @Override @Nonnull public String getName()
- @Override public boolean isInsideSpace(int x, int y, int z)
- @Override public boolean isInsideSpace(@Nonnull Vector3i position)
- @Override public void forEach(VoxelConsumer<? super V> action)
- @Override public int minX()
- @Override public int maxX()
- @Override public int minY()
- @Override public int maxY()
- @Override public int minZ()
- @Override public int maxZ()
- @Override public int sizeX()
- @Override public int sizeY()
- @Override public int sizeZ()
