# NoiseBlockArray

Type: class | Package: com.hypixel.hytale.server.worldgen.util

public class NoiseBlockArray

Provides NoiseBlockArray functionality within the util subsystem.

## Constants

- public static final NoiseBlockArray EMPTY

## Fields

- protected final NoiseBlockArray.Entry[] entries

## Methods

- public NoiseBlockArray(NoiseBlockArray.Entry[] entries)
- public NoiseBlockArray.Entry[] getEntries()
- public BlockFluidEntry getTopBlockAt(int seed, double x, double z)
- public BlockFluidEntry getBottomBlockAt(int seed, double x, double z)
- @Override public boolean equals(@Nullable Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()

Also in this package: ArrayUtli, BlockArray, BlockFluidEntry, ChunkThreadPoolExecutor, ChunkWorker, ChunkWorkerThreadFactory, ConstantNoiseProperty, Entry, LogUtil, ObjectPool, ResolvedBlockArray

Complete API:
  public NoiseBlockArray.Entry[] getEntries()
  public BlockFluidEntry getTopBlockAt(int seed, double x, double z)
  public BlockFluidEntry getBottomBlockAt(int seed, double x, double z)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final NoiseBlockArray EMPTY
protected final NoiseBlockArray.Entry[] entries
