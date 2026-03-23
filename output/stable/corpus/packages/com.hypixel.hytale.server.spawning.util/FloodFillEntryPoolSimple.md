# FloodFillEntryPoolSimple

Type: class | Package: com.hypixel.hytale.server.spawning.util

public class FloodFillEntryPoolSimple

Object pool for `int[5]` arrays used during flood-fill position calculation. Reduces GC pressure by reusing allocated arrays.

## Methods

- public int[] allocate()
- public void deallocate(int[] entry)

Also in this package: ChunkColumnMask, Debug, FloodFillEntryPoolProviderSimple, FloodFillPositionSelector, LightRangePredicate, RandomChunkColumnIterator, SortBufferProvider, WeightedPosition

Complete API:
  public int[] allocate()
  public void deallocate(int[] entry)

Fields:
private static final int ENTRY_SIZE
private final List<int[]> entryPool
