# VoicePlayerState

Type: class | Package: com.hypixel.hytale.server.core.modules.voice

public class VoicePlayerState

Per-player voice state tracking. Manages speaking state, silence flag, routing disabled flag, token-bucket rate limiting, and consecutive error tracking. Rate limiting uses a token bucket algorithm refilled at the configured packets-per-second rate.

## Constants

- MAX_CONSECUTIVE_ERRORS | int | 10

## Methods

- @Nonnull UUID getPlayerId()
- boolean isSpeaking()
- void setSpeaking(boolean speaking)
- boolean isSilenced()
- void setSilenced(boolean silenced)
- boolean isRoutingDisabled()
- void setRoutingDisabled(boolean disabled)
- int incrementConsecutiveErrors()
- void resetConsecutiveErrors()
- int getConsecutiveErrors()
- synchronized boolean checkRateLimit(int maxPacketsPerSecond, int burstCapacity)
- synchronized boolean shouldLogRateLimit()
- long getLastPacketTime()
- double getTokenBucket()
- long getTotalPacketsReceived()
- long getTotalPacketsRateLimited()
- int getSpeakingStateChanges()
- String getStatsString()
