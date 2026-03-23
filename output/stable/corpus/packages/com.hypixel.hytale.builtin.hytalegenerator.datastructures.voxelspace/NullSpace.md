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

Also in this package: BatchTransfer, BooleanVoxelSpace, VoxelConsumer, VoxelCoordinate, VoxelSpace, VoxelSpaceUtil, WindowVoxelSpace

Complete API:
  public static NullSpace<V> instance()
  public static NullSpace<V> instance(Class<V> clazz)
  public boolean set(V content, int x, int y, int z)
  public boolean set(V content, Vector3i position)
  public void set(V content)
  public void setOrigin(int x, int y, int z)
  public V getContent(int x, int y, int z)
  public V getContent(Vector3i position)
  public boolean replace(V replacement, int x, int y, int z, Predicate<V> mask)
  public void pasteFrom(VoxelSpace<V> source)
  public int getOriginX()
  public int getOriginY()
  public int getOriginZ()
  public String getName()
  public boolean isInsideSpace(int x, int y, int z)
  public boolean isInsideSpace(Vector3i position)
  public void forEach(VoxelConsumer<? super V> action)
  public int minX()
  public int maxX()
  public int minY()
  public int maxY()
  public int minZ()
  public int maxZ()
  public int sizeX()
  public int sizeY()
  public int sizeZ()

Fields:
private static final NullSpace INSTANCE
