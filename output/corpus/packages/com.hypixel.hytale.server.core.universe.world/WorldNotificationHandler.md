# WorldNotificationHandler

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public class WorldNotificationHandler

Handles sending block state change notifications, block particle effects, and block damage updates to players whose chunks are loaded. Validates Y coordinates are within 0, 320).

## Methods

- updateState(int, int, int, BlockState, BlockState) | void | Sends block state update to all players with the chunk loaded.
- updateState(int, int, int, BlockState, BlockState, Predicate<PlayerRef>) | void | Same as above with a player skip predicate.
- updateChunk(long) | void | Marks a chunk for reload on all connected players.
- sendBlockParticle(double, double, double, int, BlockParticleEvent) | void | Sends a block particle effect to all players with the chunk loaded.
- sendBlockParticle(PlayerRef, double, double, double, int, BlockParticleEvent) | void | Sends a block particle to a specific player.
- updateBlockDamage(int, int, int, float, float) | void | Sends a block damage update to all players.
- updateBlockDamage(int, int, int, float, float, Predicate<PlayerRef>) | void | Sends a block damage update with a player filter.
- sendPacketIfChunkLoaded(ToClientPacket, int, int) | void | Sends a packet to players with the chunk at (x, z) loaded.
- sendPacketIfChunkLoaded(ToClientPacket, long) | void | Sends a packet to players with the chunk index loaded.
- getBlockParticlePacket(double, double, double, int, BlockParticleEvent) | SpawnBlockParticleSystem | Creates a block particle packet.
- getBlockDamagePacket(int, int, int, float, float) | UpdateBlockDamage | Creates a block damage packet.

## See Also

- [World
