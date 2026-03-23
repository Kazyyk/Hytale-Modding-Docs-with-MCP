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

Also in this package: ArrayContents, ArrayContents, CountedArrayContents, NBuffer, NCountedPixelBuffer, NEntityBuffer, NPixelBuffer, NVoxelBuffer, State, State, State

Complete API:
  public T getPixelContent(Vector3i position)
  public void setPixelContent(Vector3i position, T value)
  public Class<T> getPixelType()
  public void copyFrom(NSimplePixelBuffer<T> sourceBuffer)
  public MemInstrument.Report getMemoryUsage()
  private void ensureContents()
  private void switchFromSingleValueToArray()
  private static int index(Vector3i position)

Fields:
private static final Bounds3i bounds
private final Class<T> pixelType
private NSimplePixelBuffer.State state
private NSimplePixelBuffer.ArrayContents<T> arrayContents
private T singleValue
