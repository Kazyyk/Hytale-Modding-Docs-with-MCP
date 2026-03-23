# VoxelBuffer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers | Extends: Buffer

public class VoxelBuffer<T> extends Buffer

A Buffer that stores 3D voxel data on an 8x8x8 grid. Uses a four-state storage strategy: EMPTY (no data), SINGLE_VALUE (uniform content), ARRAY (heterogeneous content), or REFERENCE (copy-on-write delegation to another VoxelBuffer). The REFERENCE state enables efficient buffer copying in `VoxelBufferView.copyFrom` -- the referencing buffer lazily dereferences and allocates its own array only when a write occurs.

## Inner Types

- VoxelBuffer.ArrayContents | class | Backing array for 8x8x8 voxel data
- VoxelBuffer.State | enum | Storage state: EMPTY, SINGLE_VALUE, ARRAY, REFERENCE

## Fields

- public static final int BUFFER_SIZE_BITS
- @Nonnull public static final Vector3i SIZE
- @Nonnull private static final Bounds3i bounds
- @Nonnull private final Class<T> voxelType
- @Nonnull private VoxelBuffer.State state
- @Nullable private VoxelBuffer.ArrayContents<T> arrayContents
- @Nullable private T singleValue
- @Nullable private VoxelBuffer<T> referenceBuffer

## Constructors

- public VoxelBuffer(@Nonnull Class<T> voxelType)

## Methods

- @Nullable public T getVoxelContent(int x, int y, int z)
- @Nullable public T getVoxelContent(@Nonnull Vector3i position)
- @Nonnull public Class<T> getVoxelType()
- public void setVoxelContent(int x, int y, int z, @Nullable T value)
- public void setVoxelContent(@Nonnull Vector3i position, @Nullable T value)
- public void reference(@Nonnull VoxelBuffer<T> sourceBuffer)
- @Nonnull @Override public MemInstrument.Report getMemoryUsage()
- private void switchFromSingleValueToArray()
- private void dereference()
- private static int index(int x, int y, int z)
- private static int index(@Nonnull Vector3i position)
