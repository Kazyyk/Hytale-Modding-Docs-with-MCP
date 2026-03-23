# CountedPixelBuffer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers | Extends: PixelBuffer<T>

public class CountedPixelBuffer<T> extends PixelBuffer<T>

A PixelBuffer variant that tracks all unique values (biomes) stored in the buffer. Uses a tri-state storage strategy: EMPTY (no data), SINGLE_VALUE (all cells share one value), or ARRAY (heterogeneous content with a tracked unique-values list). The buffer covers an 8x1x8 voxel grid. The unique-entries tracking is used by `BiomeDistanceStage` to optimize distance calculations.

## Inner Types

- CountedPixelBuffer.CountedArrayContents | class | Holds the backing array and unique-values list
- CountedPixelBuffer.State | enum | Storage state: EMPTY, SINGLE_VALUE, ARRAY

## Fields

- public static final int BUFFER_SIZE_BITS
- @Nonnull public static final Vector3i SIZE_VOXEL_GRID
- @Nonnull public static final Bounds3i BOUNDS_VOXEL_GRID
- @Nonnull private final Class<T> pixelType
- @Nonnull private CountedPixelBuffer.State state
- @Nullable private CountedPixelBuffer.CountedArrayContents<T> countedArrayContents
- @Nullable private T singleValue

## Constructors

- public CountedPixelBuffer(@Nonnull Class<T> voxelType)

## Methods

- @Nullable @Override public T getPixelContent(@Nonnull Vector3i position)
- @Override public void setPixelContent(@Nonnull Vector3i position, @Nullable T value)
- @Nonnull @Override public Class<T> getPixelType()
- @Nonnull public List<T> getUniqueEntries()
- public void copyFrom(@Nonnull CountedPixelBuffer<T> sourceBuffer)
- @Nonnull @Override public MemInstrument.Report getMemoryUsage()
- private void switchFromSingleValueToArray()
- private static int index(@Nonnull Vector3i position)

Also in this package: ArrayContents, ArrayContents, Buffer, CountedArrayContents, EntityBuffer, PixelBuffer, SimplePixelBuffer, State, State, State, VoxelBuffer

Complete API:
  public T getPixelContent(Vector3i position)
  public void setPixelContent(Vector3i position, T value)
  public Class<T> getPixelType()
  public List<T> getUniqueEntries()
  public void copyFrom(CountedPixelBuffer<T> sourceBuffer)
  public MemInstrument.Report getMemoryUsage()
  private void switchFromSingleValueToArray()
  private static int index(Vector3i position)

Fields:
public static final int BUFFER_SIZE_BITS
public static final Vector3i SIZE_VOXEL_GRID
public static final Bounds3i BOUNDS_VOXEL_GRID
private final Class<T> pixelType
private CountedPixelBuffer.State state
private CountedPixelBuffer.CountedArrayContents<T> countedArrayContents
private T singleValue
