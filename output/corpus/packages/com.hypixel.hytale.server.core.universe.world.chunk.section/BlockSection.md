# BlockSection

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.section | Implements: Component<ChunkStore>

public class BlockSection implements Component<ChunkStore>

ECS component representing a 32x32x32 block section within a chunk column. Stores block type IDs, filler data, and rotation data in separate `ISectionPalette` instances that dynamically promote/demote between palette strategies (empty, single-value, indexed, full array) for memory efficiency. Also manages per-block ticking state via `BitSet`, lighting data (local and global), changed-position tracking, and cached network packets.

Thread safety is achieved via a `StampedLock` on the section data. All palette reads use optimistic reads with fallback to read locks; writes acquire write locks.

## Constants

- VERSION | int | 6 | Current serialization version.

## Static Methods


public static ComponentType<ChunkStore, BlockSection> getComponentType()

## Instance Methods -- Block Access


public int get(int x, int y, int z)

Returns the block type index at the given local coordinates.


public int get(int index)

Returns the block type index at the given flat index (0-32767).


public boolean set(int x, int y, int z, int blockId, int rotation, int filler)

Sets the block, rotation, and filler at the given coordinates. Handles palette promotion/demotion. Returns `true` if any value changed.


public int getFiller(int x, int y, int z)


public int getRotationIndex(int x, int y, int z)


public RotationTuple getRotation(int x, int y, int z)

## Instance Methods -- Query


public boolean contains(int id)


public boolean containsAny(IntList ids)


public int count()

Returns the number of non-zero blocks in the section.


public int count(int id)


public IntSet values()

Returns the set of distinct block type indexes present.


public Int2ShortMap valueCounts()

Returns a map of block type index to count.


public boolean isSolidAir()

Returns `true` if the entire section contains only air (block ID 0).

## Instance Methods -- Ticking


public boolean setTicking(int x, int y, int z, boolean ticking)


public boolean isTicking(int x, int y, int z)


public int getTickingBlocksCount()


public boolean hasTicking()


public void scheduleTick(int index, @Nullable Instant gameTime)

Schedules a block to start ticking at the given game time.


public void preTick(Instant gameTime)

Processes scheduled tick requests and swaps the ticking bitset for the current tick cycle.


public <T, V> int forEachTicking(T t, V v, int sectionIndex, @Nonnull ObjectPositionBlockFunction<T, V, BlockTickStrategy> acceptor)

Iterates over all ticking blocks in this section, invoking the acceptor for each.

## Instance Methods -- Lighting


public ChunkLightData getLocalLight()


public ChunkLightData getGlobalLight()


public void setLocalLight(@Nonnull ChunkLightDataBuilder localLight)


public void setGlobalLight(@Nonnull ChunkLightDataBuilder globalLight)


public boolean hasLocalLight()


public boolean hasGlobalLight()


public void invalidateLocalLight()


public void invalidateGlobalLight()

## Instance Methods -- Cache


public void invalidate()

Clears the cached network packet, forcing re-serialization on next send.


@Nonnull
public CompletableFuture<CachedPacket<SetChunk>> getCachedChunkPacket(int x, int y, int z)

Returns a lazily-computed cached `SetChunk` packet for this section's data.


public double getMaximumHitboxExtent()

Returns the maximum bounding box extent of any block in this section, cached after first computation.

## Inner Records

- `TickRequest` -- Record holding a block index and the game time at which it should start ticking.
