# NVoxelBuffer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers | Extends: NBuffer

public class NVoxelBuffer<T> extends NBuffer

A buffer used in the world generation pipeline for storing voxel or pixel data.

## Constants

- public static final int BUFFER_SIZE_BITS
- @Nonnull public static final Vector3i SIZE

## Fields

- @Nonnull private NVoxelBuffer.State state
- @Nullable private NVoxelBuffer.ArrayContents<T> arrayContents
- @Nullable private T singleValue
- @Nullable private NVoxelBuffer<T> referenceBuffer

## Methods

- @Nullable public T getVoxelContent(@Nonnull Vector3i position)
- @Nonnull public Class<T> getVoxelType()
- public void setVoxelContent(@Nonnull Vector3i position, @Nullable T value)
- public void reference(@Nonnull NVoxelBuffer<T> sourceBuffer)
- @Nonnull private NVoxelBuffer<T> lastReference(@Nonnull NVoxelBuffer<T> sourceBuffer)
- @Override public MemInstrument.Report getMemoryUsage()
- private void switchFromSingleValueToArray()
- private void dereference()
- private static int index(@Nonnull Vector3i position)

## Enum Constants

- `EMPTY`
- `SINGLE_VALUE`
- `ARRAY`
- `REFERENCE`
