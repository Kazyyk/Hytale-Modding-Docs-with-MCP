# SimplePixelBuffer.ArrayContents

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers | Implements: MemInstrument

public static class SimplePixelBuffer.ArrayContents<T> implements MemInstrument

Backing array storage for a SimplePixelBuffer in ARRAY state. Holds a flat array of size 8x1x8 = 64 elements.

## Fields

- @Nonnull private final T[] array

## Methods

- @Nonnull @Override public MemInstrument.Report getMemoryUsage()

Also in this package: ArrayContents, Buffer, CountedArrayContents, CountedPixelBuffer, EntityBuffer, PixelBuffer, SimplePixelBuffer, State, State, State, VoxelBuffer

Complete API:
  public MemInstrument.Report getMemoryUsage()

Fields:
private final T[] array
