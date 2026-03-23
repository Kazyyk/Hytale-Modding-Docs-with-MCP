# ResolvedBlockArray

Type: class | Package: com.hypixel.hytale.server.worldgen.util

public final class ResolvedBlockArray

Provides ResolvedBlockArray functionality within the util subsystem.

## Constants

- public static final ResolvedBlockArray EMPTY
- public static final Long2ObjectMap<ResolvedBlockArray> RESOLVED_BLOCKS
- public static final Long2ObjectMap<ResolvedBlockArray> RESOLVED_BLOCKS_WITH_VARIANTS

## Fields

- @Nonnull private final LongSet entrySet
- @Nonnull private final BlockFluidEntry[] entries

## Methods

- public ResolvedBlockArray(@Nonnull BlockFluidEntry[] entries)
- @Nonnull public BlockFluidEntry[] getEntries()
- @Nonnull public LongSet getEntrySet()
- public int size()
- public boolean contains(int block, int fluidId)
- @Override public boolean equals(Object o)
- @Override public int hashCode()
- @Nonnull @Override public String toString()

Also in this package: ArrayUtli, BlockArray, BlockFluidEntry, ChunkThreadPoolExecutor, ChunkWorker, ChunkWorkerThreadFactory, ConstantNoiseProperty, Entry, LogUtil, NoiseBlockArray, ObjectPool

Complete API:
  public BlockFluidEntry[] getEntries()
  public LongSet getEntrySet()
  public int size()
  public boolean contains(int block, int fluidId)
  public boolean equals(Object o)
  public int hashCode()
  public String toString()

Fields:
public static final ResolvedBlockArray EMPTY
public static final Long2ObjectMap<ResolvedBlockArray> RESOLVED_BLOCKS
public static final Long2ObjectMap<ResolvedBlockArray> RESOLVED_BLOCKS_WITH_VARIANTS
private final LongSet entrySet
private final BlockFluidEntry[] entries
