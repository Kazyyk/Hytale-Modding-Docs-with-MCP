# SimplePixelBuffer

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers | Extends: PixelBuffer<T>

public class SimplePixelBuffer<T> extends PixelBuffer<T>

A PixelBuffer implementation using a tri-state storage strategy: EMPTY (no data), SINGLE_VALUE (uniform content), or ARRAY (heterogeneous content). Unlike CountedPixelBuffer, this variant does not track unique values. Used for tint and biome-distance data.

## Inner Types

- SimplePixelBuffer.ArrayContents | class | Backing array storage
- SimplePixelBuffer.State | enum | Storage state: EMPTY, SINGLE_VALUE, ARRAY

## Fields

- @Nonnull private static final Bounds3i bounds
- @Nonnull private final Class<T> pixelType
- @Nonnull private SimplePixelBuffer.State state
- @Nullable private SimplePixelBuffer.ArrayContents<T> arrayContents
- @Nullable private T singleValue

## Constructors

- public SimplePixelBuffer(@Nonnull Class<T> pixelType)

## Methods

- @Nullable @Override public T getPixelContent(@Nonnull Vector3i position)
- @Override public void setPixelContent(@Nonnull Vector3i position, @Nullable T value)
- @Nonnull @Override public Class<T> getPixelType()
- public void copyFrom(@Nonnull SimplePixelBuffer<T> sourceBuffer)
- @Nonnull @Override public MemInstrument.Report getMemoryUsage()
- private void ensureContents()
- private void switchFromSingleValueToArray()
- private static int index(@Nonnull Vector3i position)
