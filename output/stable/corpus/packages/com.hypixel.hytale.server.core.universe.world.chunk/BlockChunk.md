# BlockChunk

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk | Implements: Component<ChunkStore>

public class BlockChunk implements Component<ChunkStore>

ECS component storing the block data for a chunk column: block IDs across 10 vertical sections (32x32x32 each, totaling 32x320x32), heightmap, tint map, environment data, ticking block tracking, and lighting data caches. Serialized via a versioned binary codec (current version 3).

## Constants

- VERSION | int | 3 | Current serialization version.
- SEND_LOCAL_LIGHTING_DATA | boolean | true | Whether local lighting is sent to clients.
- SEND_GLOBAL_LIGHTING_DATA | boolean | false | Whether global lighting is sent to clients.

## Static Methods


public static ComponentType<ChunkStore, BlockChunk> getComponentType()

## Constructors


public BlockChunk(int x, int z)

Creates a new block chunk at the given chunk coordinates with default palettes and sections.

## Instance Methods -- Position


public long getIndex()


public int getX()


public int getZ()

## Instance Methods -- Block Data


public int getBlock(int x, int y, int z)

Returns the block type index at chunk-local coordinates. Returns 0 for out-of-range Y.


public boolean setBlock(int x, int y, int z, int blockId, int rotation, int filler)

Sets a block in the section palette, invalidates the section cache, and marks needs-saving.


public boolean contains(int blockId)


public int count(int blockId)


@Nonnull
public Int2IntMap blockCounts()

Returns a map of block type index to count across all sections.


@Nonnull
public IntSet blocks()

Returns the set of distinct block type indexes present in this chunk.

## Instance Methods -- Heightmap


public short getHeight(int x, int z)


public void setHeight(int x, int z, short height)


public short updateHeight(int x, int z)

Recalculates the heightmap entry by scanning downward for the first non-transparent block.

## Instance Methods -- Environment & Tint


public int getEnvironment(int x, int y, int z)


public void setEnvironment(int x, int y, int z, int environment)


public int getTint(int x, int z)


public void setTint(int x, int z, int tint)

## Instance Methods -- Lighting


public byte getRedBlockLight(int x, int y, int z)


public byte getGreenBlockLight(int x, int y, int z)


public byte getBlueBlockLight(int x, int y, int z)


public short getBlockLight(int x, int y, int z)


public byte getSkyLight(int x, int y, int z)

## Instance Methods -- Sections


@Deprecated(forRemoval = false)
public BlockSection getSectionAtBlockY(int y)


@Deprecated(forRemoval = false)
public BlockSection getSectionAtIndex(int index)


public int getSectionCount()

## Instance Methods -- Ticking


public boolean setTicking(int x, int y, int z, boolean ticking)


public boolean isTicking(int x, int y, int z)


public int getTickingBlocksCount()


public <T, V> int forEachTicking(T t, V v, ObjectPositionBlockFunction<T, V, BlockTickStrategy> acceptor)

Iterates over all ticking blocks, invoking the acceptor for each.

## Inner Classes

- `LoadBlockChunkPacketSystem` -- Sends heightmap, tintmap, environments, and section data packets to clients on chunk load.
