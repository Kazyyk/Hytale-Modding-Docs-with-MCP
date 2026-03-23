# HashedBiCoordinateCache

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures.bicoordinatecache | Implements: BiCoordinateCache

public class HashedBiCoordinateCache<T> implements BiCoordinateCache

## Fields

- private final ConcurrentHashMap<Long,T> values

## Methods

- public static long hash(int x, int z)
- @Override public T get(int x, int z)
- @Override public boolean isCached(int x, int z)
- @Nonnull @Override public T save(int x, int z, T value)
- @Override public void flush(int x, int z)
- @Override public void flush()
- @Override public int size()
- @Nonnull @Override public String toString()
