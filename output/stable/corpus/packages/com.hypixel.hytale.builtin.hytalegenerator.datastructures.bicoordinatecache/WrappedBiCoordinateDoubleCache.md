# WrappedBiCoordinateDoubleCache

Type: class | Package: com.hypixel.hytale.builtin.hytalegenerator.datastructures.bicoordinatecache | Implements: BiCoordinateCache

public class WrappedBiCoordinateDoubleCache implements BiCoordinateCache

## Fields

- private final int sizeX
- private final int sizeZ
- private final double[][] values
- private final boolean[][] populated
- private int size

## Methods

- public int localXFrom(int x)
- public int localZFrom(int z)
- @Nonnull public Double get(int x, int z)
- @Override public boolean isCached(int x, int z)
- @Nonnull public Double save(int x, int z, Double value)
- @Override public void flush(int x, int z)
- @Override public void flush()
- @Override public int size()
- @Nonnull @Override public String toString()
