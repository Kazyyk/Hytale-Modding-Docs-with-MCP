# NSimplePixelBuffer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.newsystem.bufferbundle.buffers | Extends: NPixelBuffer

public class NSimplePixelBuffer<T> extends NPixelBuffer<T>

A buffer used in the world generation pipeline for storing voxel or pixel data.

## Fields

- @Nonnull private NSimplePixelBuffer.State state
- @Nullable private NSimplePixelBuffer.ArrayContents<T> arrayContents
- @Nullable private T singleValue

## Methods

- @Override public T getPixelContent(@Nonnull Vector3i position)
- @Override public void setPixelContent(@Nonnull Vector3i position, @Nullable T value)
- @Override public Class<T> getPixelType()
- public void copyFrom(@Nonnull NSimplePixelBuffer<T> sourceBuffer)
- @Override public MemInstrument.Report getMemoryUsage()
- private void ensureContents()
- private void switchFromSingleValueToArray()
- private static int index(@Nonnull Vector3i position)

## Enum Constants

- `EMPTY`
- `SINGLE_VALUE`
- `ARRAY`
