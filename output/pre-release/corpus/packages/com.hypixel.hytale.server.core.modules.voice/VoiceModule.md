# VoiceModule

Type: class | Package: com.hypixel.hytale.server.core.modules.voice | Extends: JavaPlugin

public class VoiceModule extends JavaPlugin

Core plugin managing proximity-based voice chat. Maintains per-player `VoicePlayerState` instances, a position cache updated every 100ms, and delegates voice packet routing to `VoiceRouter`. Supports configuration for max hearing distance (default 32 blocks), full volume distance (default 4 blocks), global mute lists, and automatic enable/disable based on singleplayer access mode.

Uses a pool of 4 dedicated `VoiceRouter` executor threads for voice routing. Rate limits voice packets at 60 packets/second with a burst capacity of 25 and a max packet size of 1024 bytes.

## Constants

- MAX_PACKETS_PER_SECOND | int | 60
- BURST_CAPACITY | int | 25
- MAX_PACKET_SIZE | int | 1024
- PLAYER_EYE_HEIGHT_OFFSET | double | 1.62

## Static Methods

- static VoiceModule get()

## Methods

- VoicePlayerState getPlayerState(@Nonnull UUID playerId)
- VoiceRouter getVoiceRouter()
- boolean isVoiceEnabled()
- void setVoiceEnabled(boolean enabled)
- boolean isDeadPlayersCanHear()
- float getMaxHearingDistance()
- void setMaxHearingDistance(float distance)
- float getReferenceDistance()
- void setReferenceDistance(float distance)
- boolean isPlayerMuted(@Nonnull UUID playerId)
- boolean mutePlayer(@Nonnull UUID playerId)
- boolean unmutePlayer(@Nonnull UUID playerId)
- Set<UUID> getGloballyMutedPlayers()
- int getMaxPacketsPerSecond()
- int getBurstCapacity()
- int getMaxPacketSize()
- void updatePositionCache(@Nonnull UUID playerId, @Nonnull Vector3d position, boolean isUnderwater, long worldId, int networkId, boolean isDead)
- PositionSnapshot getCachedPosition(@Nonnull UUID playerId)
- ExecutorService getVoiceExecutor(@Nonnull UUID speakerId)
- boolean isShutdown()
- Map<UUID, VoicePlayerState> getPlayerStates()
- void scheduleImmediatePositionUpdate(@Nonnull PlayerRef playerRef)

## Inner Types

- VoiceModule.PositionSnapshot -- cached position data record

Also in this package: ListenerCandidate, PositionSnapshot, VoiceModuleConfig, VoicePacketHandler, VoicePlayerState, VoiceRouter, VoiceStreamHandler

Complete API:
  public static VoiceModule get()
  protected void setup()
  protected void start()
  private void updateAllPlayerPositions()
  protected void shutdown()
  private void onServerAccessChanged(SingleplayerRequestAccessEvent event)
  private void onPlayerConnect(PlayerConnectEvent event)
  public void scheduleImmediatePositionUpdate(PlayerRef playerRef)
  private void onPlayerDisconnect(PlayerDisconnectEvent event)
  public VoicePlayerState getPlayerState(UUID playerId)
  public VoiceRouter getVoiceRouter()
  public boolean isVoiceEnabled()
  public void setVoiceEnabled(boolean enabled)
  public boolean isDeadPlayersCanHear()
  public float getMaxHearingDistance()
  public void setMaxHearingDistance(float distance)
  public float getReferenceDistance()
  public void setReferenceDistance(float distance)
  private void broadcastConfigToAllPlayers()
  private void broadcastMuteUpdate(UUID playerId, boolean isMuted)
  public boolean isPlayerMuted(UUID playerId)
  public boolean mutePlayer(UUID playerId)
  public boolean unmutePlayer(UUID playerId)
  public Set<UUID> getGloballyMutedPlayers()
  public int getMaxPacketsPerSecond()
  public int getBurstCapacity()
  public int getMaxPacketSize()
  private boolean isEyeInFluid(Vector3d position, World world)
  public void updatePositionCache(UUID playerId, Vector3d position)
  public void updatePositionCache(UUID playerId, Vector3d position, boolean isUnderwater)
  public void updatePositionCache(UUID playerId, Vector3d position, boolean isUnderwater, long worldId, int networkId)
  public void updatePositionCache(UUID playerId, Vector3d position, boolean isUnderwater, long worldId, int networkId, boolean isDead)
  public VoiceModule.PositionSnapshot getCachedPosition(UUID playerId)
  public ExecutorService getVoiceExecutor(UUID speakerId)
  public boolean isShutdown()
  public Map<UUID,VoicePlayerState> getPlayerStates()

Fields:
private static final long POSITION_CACHE_UPDATE_INTERVAL_MS
public static final PluginManifest MANIFEST
private static VoiceModule instance
private final Config<VoiceModuleConfig> config
private static final int MAX_PACKETS_PER_SECOND
private static final int BURST_CAPACITY
private static final int MAX_PACKET_SIZE
private static final double PLAYER_EYE_HEIGHT_OFFSET
private final Map<UUID,VoicePlayerState> playerStates
private VoiceRouter voiceRouter
private static final int VOICE_THREAD_POOL_SIZE
private final ExecutorService[] voiceExecutors
private volatile boolean isShutdown
private final ConcurrentHashMap<UUID,VoiceModule.PositionSnapshot> positionCache
private ScheduledFuture<?> positionUpdateTask
