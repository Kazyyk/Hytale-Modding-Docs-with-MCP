# WrappedBiCoordinateCache

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures.bicoordinatecache | Implements: BiCoordinateCache

public class WrappedBiCoordinateCache<T> implements BiCoordinateCache

## Fields

- private final int sizeX
- private final int sizeZ
- private final T[][] values
- private final boolean[][] populated
- private int size

## Methods

- public int localXFrom(int x)
- public int localZFrom(int z)
- @Override public T get(int x, int z)
- @Override public boolean isCached(int x, int z)
- @Override public T save(int x, int z, T value)
- @Override public void flush(int x, int z)
- @Override public void flush()
- @Override public int size()
- @Nonnull @Override public String toString()

Also in this package: BiCoordinateCache, HashedBiCoordinateCache, WrappedBiCoordinateDoubleCache

Complete API:
  public int localXFrom(int x)
  public int localZFrom(int z)
  public T get(int x, int z)
  public boolean isCached(int x, int z)
  public T save(int x, int z, T value)
  public void flush(int x, int z)
  public void flush()
  public int size()
  public String toString()

Fields:
private final int sizeX
private final int sizeZ
private final T[][] values
private final boolean[][] populated
private int size
