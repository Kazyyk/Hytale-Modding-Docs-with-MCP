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

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, ParticleUtil, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SoundUtil, SpawnUtil, ValidationOption, World, WorldConfig, WorldConfigProvider, WorldMapTracker, WorldProvider, ZoneDiscoveryInfo

Complete API:
  public void updateState(int x, int y, int z, BlockState state, BlockState oldState)
  public void updateState(int x, int y, int z, BlockState state, BlockState oldState, Predicate<PlayerRef> skip)
  public void updateChunk(long indexChunk)
  public void sendBlockParticle(double x, double y, double z, int id, BlockParticleEvent particleType)
  public void sendBlockParticle(PlayerRef playerRef, double x, double y, double z, int id, BlockParticleEvent particleType)
  public void updateBlockDamage(int x, int y, int z, float health, float healthDelta)
  public void updateBlockDamage(int x, int y, int z, float health, float healthDelta, Predicate<PlayerRef> filter)
  public void sendPacketIfChunkLoaded(ToClientPacket packet, int x, int z)
  public void sendPacketIfChunkLoaded(ToClientPacket packet, long indexChunk)
  public void sendPacketIfChunkLoaded(ToClientPacket packet, int x, int z, Predicate<PlayerRef> filter)
  public void sendPacketIfChunkLoaded(ToClientPacket packet, long indexChunk, Predicate<PlayerRef> filter)
  private void sendPacketIfChunkLoaded(PlayerRef player, ToClientPacket packet, int x, int z)
  private void sendPacketIfChunkLoaded(PlayerRef playerRef, ToClientPacket packet, long indexChunk)
  public SpawnBlockParticleSystem getBlockParticlePacket(double x, double y, double z, int id, BlockParticleEvent particleType)
  public UpdateBlockDamage getBlockDamagePacket(int x, int y, int z, float health, float healthDelta)

Fields:
private final World world
