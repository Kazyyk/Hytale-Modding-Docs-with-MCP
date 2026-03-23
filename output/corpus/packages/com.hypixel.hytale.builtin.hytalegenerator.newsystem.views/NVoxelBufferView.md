# NVoxelBufferView

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.views | Implements: VoxelSpace<T>

public class NVoxelBufferView<T> implements VoxelSpace<T>

## Fields

- @Nonnull private final Class<T> voxelType
- @Nonnull private final NBufferBundle.Access.View bufferAccess
- @Nonnull private final Bounds3i bounds_voxelGrid
- @Nonnull private final Vector3i size_voxelGrid

## Constructors

- public NVoxelBufferView(@Nonnull NBufferBundle.Access.View bufferAccess, @Nonnull Class<T> voxelType)

## Methods

- public void copyFrom(@Nonnull NVoxelBufferView<T> source)
- @Override public boolean set(T content, int x, int y, int z)
- @Override public boolean set(T content, @Nonnull Vector3i position_voxelGrid)
- @Override public void set(T content)
- @Override public void setOrigin(int x, int y, int z)
- @Nullable @Override public T getContent(int x, int y, int z)
- @Nullable @Override public T getContent(@Nonnull Vector3i position_voxelGrid)
- @Override public boolean replace(T replacement, int x, int y, int z, @Nonnull Predicate<T> mask)
- @Override public void pasteFrom(@Nonnull VoxelSpace<T> source)
- @Override public int getOriginX()
- @Override public int getOriginY()
- @Override public int getOriginZ()
- @Override public String getName()
- @Override public boolean isInsideSpace(int x, int y, int z)
- @Override public boolean isInsideSpace(@Nonnull Vector3i position)
- @Override public void forEach(VoxelConsumer<? super T> action)
- @Override public int minX()
- @Override public int maxX()
- @Override public int minY()
- @Override public int maxY()
- @Override public int minZ()
- @Override public int maxZ()
- @Override public int sizeX()
- @Override public int sizeY()
- @Override public int sizeZ()
- @Nonnull private NVoxelBuffer<T> getBuffer_fromVoxelGrid(@Nonnull Vector3i position_voxelGrid)
- @Nonnull private NVoxelBuffer<T> getBuffer_fromBufferGrid(@Nonnull Vector3i position_bufferGrid)
