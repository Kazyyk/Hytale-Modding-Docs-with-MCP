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
