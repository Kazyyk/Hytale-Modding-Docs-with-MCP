# VoiceRouter

Type: class | Package: com.hypixel.hytale.server.core.modules.voice

public class VoiceRouter

Routes voice packets from speakers to nearby listeners using cached position data. Performs world isolation (only routes within the same world), distance-based filtering against max hearing distance, dead-player filtering, and caps listeners per speaker at 12. Sends voice data via dedicated voice stream channels.

## Constants

- MAX_SPEAKERS_PER_LISTENER | int | 12

## Methods

- void updateSpeakerPositionCache(@Nonnull PlayerRef speaker, @Nonnull Vector3d position, boolean isUnderwater, long worldId, int networkId, boolean isDead)
- void removePlayerFromWorldSets(@Nonnull UUID playerId)
- void sendVoiceConfig(@Nonnull PlayerRef player)
- void routeVoiceFromCache(@Nonnull PlayerRef speaker, @Nonnull VoiceData packet)

## Inner Types

- VoiceRouter.ListenerCandidate -- record holding listener routing data

Also in this package: ListenerCandidate, PositionSnapshot, VoiceModule, VoiceModuleConfig, VoicePacketHandler, VoicePlayerState, VoiceStreamHandler

Complete API:
  public void updateSpeakerPositionCache(PlayerRef speaker, Vector3d position, boolean isUnderwater, long worldId, int networkId, boolean isDead)
  public void removePlayerFromWorldSets(UUID playerId)
  public void sendVoiceConfig(PlayerRef player)
  public void routeVoiceFromCache(PlayerRef speaker, VoiceData packet)
  private PacketHandler getPlayerHandler(UUID playerId)
  private static RelayedVoiceData createPerRecipientRelay(RelayedVoiceData source)

Fields:
private static final int VERBOSE_LOG_PACKET_FREQUENCY
private static final int MAX_SPEAKERS_PER_LISTENER
private final VoiceModule voiceModule
private final HytaleLogger logger
private final ConcurrentHashMap<Long,Set<UUID>> worldPlayerSets
private volatile boolean loggedFirstCacheRoute
