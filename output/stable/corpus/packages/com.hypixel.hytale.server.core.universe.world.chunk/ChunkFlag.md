# ChunkFlag

Type: enum | Package: com.hypixel.hytale.server.core.universe.world.chunk | Implements: Flag

public enum ChunkFlag implements Flag

Lifecycle and state flags for WorldChunk. Each flag occupies a single bit in a `Flags` bitfield.

## Enum Constants

- START_INIT | Set when chunk initialization has begun.
- INIT | Set when chunk initialization is complete. All flag-triggered behaviors are active.
- NEWLY_GENERATED | Set when the chunk was freshly generated (not loaded from disk).
- ON_DISK | Set when the chunk has been persisted to disk.
- TICKING | Set when the chunk is actively ticking. Toggling this flag starts or stops the chunk's ECS ticking lifecycle.

## Static Fields

- VALUES | ChunkFlag[] | Cached array of all enum values.

## Instance Methods


@Override
public int mask()

Returns the bitmask for this flag (1 shifted left by ordinal).

Also in this package: AbstractCachedAccessor, BlockChunk, BlockComponentChunk, BlockComponentChunkLoadingSystem, BlockRotationUtil, ChunkColumn, EntityChunk, EntityChunkLoadingSystem, LoadBlockChunkPacketSystem, LoadBlockComponentPacketSystem, UnloadBlockComponentPacketSystem, WorldChunk

Complete API:
  public int mask()

Fields:
public static final ChunkFlag[] VALUES
private final int mask
