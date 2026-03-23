# NCountedPixelBuffer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers | Extends: NPixelBuffer

public class NCountedPixelBuffer<T> extends NPixelBuffer<T>

A buffer used in the world generation pipeline for storing voxel or pixel data.

## Constants

- public static final int BUFFER_SIZE_BITS
- @Nonnull public static final Vector3i SIZE_VOXEL_GRID
- @Nonnull public static final Bounds3i BOUNDS_VOXEL_GRID

## Fields

- @Nonnull private NCountedPixelBuffer.State state
- @Nullable private NCountedPixelBuffer.CountedArrayContents<T> countedArrayContents
- @Nullable private T singleValue

## Methods

- @Override public T getPixelContent(@Nonnull Vector3i position)
- @Override public void setPixelContent(@Nonnull Vector3i position, @Nullable T value)
- @Override public Class<T> getPixelType()
- @Nonnull public List<T> getUniqueEntries()
- public void copyFrom(@Nonnull NCountedPixelBuffer<T> sourceBuffer)
- @Override public MemInstrument.Report getMemoryUsage()
- private void switchFromSingleValueToArray()
- private static int index(@Nonnull Vector3i position)
- public void copyFrom(@Nonnull NCountedPixelBuffer.CountedArrayContents<T> countedArrayContents)

## Enum Constants

- `EMPTY`
- `SINGLE_VALUE`
- `ARRAY`
