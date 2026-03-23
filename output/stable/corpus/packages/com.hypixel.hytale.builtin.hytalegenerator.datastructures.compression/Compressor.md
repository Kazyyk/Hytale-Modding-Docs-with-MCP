# Compressor

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures.compression

public class Compressor

## Fields

- private final int MIN_RUN

## Methods

- @Nonnull public Compressor.CompressedArray<T> compressOnReference(T[] in)
- @Nonnull public T[] decompress(Compressor.CompressedArray<T> compressedArray)

## Inner Types

- `Compressor.CompressedArray`
- `Compressor.Run`

Also in this package: CompressedArray, Run

Complete API:
  public Compressor.CompressedArray<T> compressOnReference(T[] in)
  public T[] decompress(Compressor.CompressedArray<T> compressedArray)

Fields:
private final int MIN_RUN
