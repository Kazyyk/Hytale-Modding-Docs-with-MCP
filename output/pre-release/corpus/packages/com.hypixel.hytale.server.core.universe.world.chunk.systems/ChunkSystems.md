# ChunkSystems

Type: class | Package: com.hypixel.hytale.server.core.universe.world.chunk.systems

public class ChunkSystems

Container for chunk-related ECS systems that manage chunk lifecycle and block change replication. Inner classes handle chunk section creation, loading, non-ticking state propagation, and network replication of block changes to players.

## Inner Types

- ChunkSystems.EnsureBlockSection | class | Ensures `BlockSection` component exists on chunk sections
- ChunkSystems.LoadBlockSection | class | Marks block sections as loaded
- ChunkSystems.OnChunkLoad | class | Creates or restores chunk sections when a chunk column loads
- ChunkSystems.OnNewChunk | class | Creates a new `ChunkColumn` with 10 section holders
- ChunkSystems.OnNonTicking | class | Propagates non-ticking state to chunk sections
- ChunkSystems.ReplicateChanges | class | Sends block changes to players via `ServerSetBlock`/`ServerSetBlocks`/`SetChunk` packets

Also in this package: EnsureBlockSection, LoadBlockSection, OnChunkLoad, OnNewChunk, OnNonTicking, ReplicateChanges

Fields:
private static final HytaleLogger LOGGER
private static final int MAX_CHANGES_PER_PACKET
