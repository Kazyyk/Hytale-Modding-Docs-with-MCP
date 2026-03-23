# ArrayVoxelSpace

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures.voxelspace | Implements: VoxelSpace<T>

public class ArrayVoxelSpace<T> implements VoxelSpace<T>

## Fields

- protected final int sizeX
- protected final int sizeY
- protected final int sizeZ
- protected final T[] contents
- protected String name
- protected T[] fastReset
- protected VoxelCoordinate origin

## Methods

- public void setFastResetTo(T e)
- public void disableFastReset()
- public boolean hasFastReset()
- public void fastReset()
- @Override public int sizeX()
- @Override public int sizeY()
- @Override public int sizeZ()
- @Override public void pasteFrom(@Nonnull VoxelSpace<T> source)
- @Override public boolean set(T content, int x, int y, int z)
- @Override public boolean set(T content, @Nonnull Vector3i position)
- @Override public void set(T content)
- @Override public void setOrigin(int x, int y, int z)
- @Override public T getContent(int x, int y, int z)
- @Override @Nullable public T getContent(@Nonnull Vector3i position)
- @Override public boolean replace(T replacement, int x, int y, int z, @Nonnull Predicate<T> mask)
- public T[] toArray()
- @Override public int getOriginX()
- @Override public int getOriginY()
- @Override public int getOriginZ()
- @Override @Nonnull public String getName()
- @Override public boolean isInsideSpace(int x, int y, int z)
- @Override public boolean isInsideSpace(@Nonnull Vector3i position)
- @Override public void forEach(@Nonnull VoxelConsumer<? super T> action)
- @Override public int minX()
- @Override public int maxX()
- @Override public int minY()
- @Override public int maxY()
- @Override public int minZ()
- @Override public int maxZ()
- @Nonnull public ArrayVoxelSpace<T> clone()
- private int arrayIndex(int x, int y, int z)
- @Override @Nonnull public String toString()
