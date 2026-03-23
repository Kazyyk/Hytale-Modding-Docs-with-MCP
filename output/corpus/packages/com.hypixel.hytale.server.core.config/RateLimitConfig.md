# RateLimitConfig

Type: class | Package: com.hypixel.hytale.server.core.config

public class RateLimitConfig

Configuration class for RateLimit settings.

## Constants

- public static final int DEFAULT_PACKETS_PER_SECOND
- public static final int DEFAULT_BURST_CAPACITY

## Fields

- private Boolean enabled
- private Integer packetsPerSecond
- private Integer burstCapacity

## Methods

- public RateLimitConfig()
- public RateLimitConfig(@Nonnull HytaleServerConfig hytaleServerConfig)
- public void setHytaleServerConfig(@Nonnull HytaleServerConfig hytaleServerConfig)
- public boolean isEnabled()
- public void setEnabled(boolean enabled)
- public int getPacketsPerSecond()
- public void setPacketsPerSecond(int packetsPerSecond)
- public int getBurstCapacity()
- public void setBurstCapacity(int burstCapacity)
