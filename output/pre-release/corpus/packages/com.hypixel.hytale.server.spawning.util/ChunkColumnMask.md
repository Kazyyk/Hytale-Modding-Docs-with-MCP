# ChunkColumnMask

Type: class | Package: com.hypixel.hytale.server.spawning.util

public class ChunkColumnMask

Bitmask over 1024 columns (32x32) within a chunk. Used by the spawning system to track which columns are available for spawn position selection. Wraps a `BitSet` with chunk-coordinate-aware accessors.

## Constants

- public static final int COLUMNS

## Methods

- public void copyFrom(@Nonnull ChunkColumnMask src)
- public boolean isEmpty()
- public void clear()
- public void set()
- public boolean get(int x, int z)
- public void set(int x, int z)
- public void clear(int x, int z)
- public int cardinality()
- public int nextSetBit(int fromIndex)
- public int nextClearBit(int fromIndex)
- public int previousSetBit(int fromIndex)
- public int previousClearBit(int fromIndex)
