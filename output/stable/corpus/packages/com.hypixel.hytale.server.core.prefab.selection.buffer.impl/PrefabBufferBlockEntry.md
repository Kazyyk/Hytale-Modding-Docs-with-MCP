# PrefabBufferBlockEntry

Type: class | Package: com.hypixel.hytale.server.core.prefab.selection.buffer.impl

public class PrefabBufferBlockEntry

Mutable data holder for a single block entry within a prefab column. Used by `PrefabBuffer.Builder` during prefab construction. Each entry represents a block at a specific Y position with associated metadata.

## Constants

- PrefabBufferBlockEntry[] EMPTY_ARRAY

## Fields

- int y
- String blockTypeKey
- int blockId
- float chance
- Holder<ChunkStore> state
- int fluidId
- byte fluidLevel
- byte supportValue
- int filler
- int rotation

## Constructors


public PrefabBufferBlockEntry(int y)

Creates an empty block entry at the given Y position (block ID 0, key "Empty").


public PrefabBufferBlockEntry(int y, int blockId, String blockTypeKey)

Creates a block entry with default chance (1.0).


public PrefabBufferBlockEntry(int y, int blockId, String blockTypeKey, float chance)

Creates a block entry with the given chance.


public PrefabBufferBlockEntry(int y, int blockId, String blockTypeKey, float chance, Holder<ChunkStore> state, int fluidId, byte fluidLevel, byte supportValue, int rotation, int filler)

Creates a fully specified block entry.

Also in this package: BlockComparingPredicate, BlockComparingPrefabPredicate, BlockConsumer, BlockMaskConstants, Builder, ChildConsumer, ChildPrefab, ColumnPredicate, EntityConsumer, EntityPredicate, FluidConsumer, FluidPredicate, IPrefabBuffer, PrefabBuffer, PrefabBufferAccessor, PrefabBufferColumn, RawBlockConsumer, RawBlockPredicate

Fields:
public static final PrefabBufferBlockEntry[] EMPTY_ARRAY
public final int y
public String blockTypeKey
public int blockId
public float chance
public Holder<ChunkStore> state
public int fluidId
public byte fluidLevel
public byte supportValue
public int filler
public int rotation
