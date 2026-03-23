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

Also in this package: ArrayContents, ArrayContents, CountedArrayContents, NBuffer, NCountedPixelBuffer, NEntityBuffer, NPixelBuffer, NSimplePixelBuffer, State, State, State

Complete API:
  public T getVoxelContent(Vector3i position)
  public Class<T> getVoxelType()
  public void setVoxelContent(Vector3i position, T value)
  public void reference(NVoxelBuffer<T> sourceBuffer)
  private NVoxelBuffer<T> lastReference(NVoxelBuffer<T> sourceBuffer)
  public MemInstrument.Report getMemoryUsage()
  private void switchFromSingleValueToArray()
  private void dereference()
  private static int index(Vector3i position)

Fields:
public static final int BUFFER_SIZE_BITS
public static final Vector3i SIZE
private static final Bounds3i bounds
private final Class<T> voxelType
private NVoxelBuffer.State state
private NVoxelBuffer.ArrayContents<T> arrayContents
private T singleValue
private NVoxelBuffer<T> referenceBuffer
