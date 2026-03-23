# CountedPixelBuffer.CountedArrayContents

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.engine.bufferbundle.buffers | Implements: MemInstrument

public static class CountedPixelBuffer.CountedArrayContents<T> implements MemInstrument

Backing storage for a CountedPixelBuffer in ARRAY state. Contains a flat array of size 8x1x8 = 64 elements and a list tracking all unique values (biomes) present in the array.

## Fields

- @Nonnull private final T[] array
- @Nonnull private final List<T> allBiomes

## Methods

- public void copyFrom(@Nonnull CountedPixelBuffer.CountedArrayContents<T> countedArrayContents)
- @Nonnull @Override public MemInstrument.Report getMemoryUsage()

Also in this package: ArrayContents, ArrayContents, Buffer, CountedPixelBuffer, EntityBuffer, PixelBuffer, SimplePixelBuffer, State, State, State, VoxelBuffer

Complete API:
  public void copyFrom(CountedPixelBuffer.CountedArrayContents<T> countedArrayContents)
  public MemInstrument.Report getMemoryUsage()

Fields:
private final T[] array
private final List<T> allBiomes
