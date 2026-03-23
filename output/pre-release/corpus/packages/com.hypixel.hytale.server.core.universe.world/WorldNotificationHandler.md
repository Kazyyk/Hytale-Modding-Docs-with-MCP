# WorldNotificationHandler

Type: class | Package: com.hypixel.hytale.server.core.universe.world

public class WorldNotificationHandler

Handles broadcasting world-level notifications to players. Sends chunk update triggers, block particle effects, and block damage updates to players whose chunk trackers report the relevant chunk as loaded. Supports optional player filtering predicates.

Also in this package: ChunkConfig, ClientEffectWorldSettings, Default, GenericBlockBulkUpdater, IWorldChunks, IWorldChunksAsync, ParticleUtil, PlaceBlockSettings, PlayerUtil, SetBlockSettings, SoundUtil, SpawnUtil, ValidationOption, World, WorldConfig, WorldConfigProvider, WorldMapTracker, WorldProvider, ZoneDiscoveryInfo

Complete API:
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
