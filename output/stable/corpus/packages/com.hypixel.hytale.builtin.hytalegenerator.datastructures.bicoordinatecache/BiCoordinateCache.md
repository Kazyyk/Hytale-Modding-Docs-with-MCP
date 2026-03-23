# BiCoordinateCache

Type: interface | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures.bicoordinatecache

public interface BiCoordinateCache<T>

## Methods

- T get(int var1, int var2)
- boolean isCached(int var1, int var2)
- T save(int var1, int var2, T var3)
- void flush(int var1, int var2)
- void flush()
- int size()

Known implementors: HashedBiCoordinateCache, WrappedBiCoordinateCache, WrappedBiCoordinateDoubleCache

Also in this package: HashedBiCoordinateCache, WrappedBiCoordinateCache, WrappedBiCoordinateDoubleCache

Complete API:
  T get(int var1, int var2)
  boolean isCached(int var1, int var2)
  T save(int var1, int var2, T var3)
  void flush(int var1, int var2)
  void flush()
  int size()
