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

Also in this package: ListenerCandidate, PositionSnapshot, VoiceModule, VoiceModuleConfig, VoicePacketHandler, VoiceRouter, VoiceStreamHandler

Complete API:
  public UUID getPlayerId()
  public boolean isSpeaking()
  public void setSpeaking(boolean speaking)
  public boolean isSilenced()
  public void setSilenced(boolean silenced)
  public boolean isRoutingDisabled()
  public void setRoutingDisabled(boolean disabled)
  public int incrementConsecutiveErrors()
  public void resetConsecutiveErrors()
  public int getConsecutiveErrors()
  public synchronized boolean checkRateLimit(int maxPacketsPerSecond, int burstCapacity)
  public synchronized boolean shouldLogRateLimit()
  public long getLastPacketTime()
  public double getTokenBucket()
  public long getTotalPacketsReceived()
  public long getTotalPacketsRateLimited()
  public int getSpeakingStateChanges()
  public String getStatsString()

Fields:
private static final long MILLISECONDS_PER_SECOND
private static final long RATE_LIMIT_LOG_THROTTLE_MS
static final int MAX_CONSECUTIVE_ERRORS
private final UUID playerId
private final HytaleLogger logger
private volatile boolean isSpeaking
private volatile boolean silenced
private volatile long lastPacketTime
private volatile double tokenBucket
private volatile long lastTokenRefillTime
private volatile long lastRateLimitLogTime
private final AtomicLong totalPacketsReceived
private final AtomicLong totalPacketsRateLimited
private final AtomicInteger speakingStateChanges
private final AtomicInteger consecutiveErrors
private volatile boolean routingDisabled
