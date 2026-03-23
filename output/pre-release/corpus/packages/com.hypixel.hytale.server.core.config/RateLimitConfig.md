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

Also in this package: AutoApplyMode, BackupConfig, ModConfig, ServerWorldMapConfig, UpdateConfig, WorldMapConfig, WorldWorldMapConfig

Complete API:
  public void setHytaleServerConfig(HytaleServerConfig hytaleServerConfig)
  public boolean isEnabled()
  public void setEnabled(boolean enabled)
  public int getPacketsPerSecond()
  public void setPacketsPerSecond(int packetsPerSecond)
  public int getBurstCapacity()
  public void setBurstCapacity(int burstCapacity)

Fields:
public static final int DEFAULT_PACKETS_PER_SECOND
public static final int DEFAULT_BURST_CAPACITY
public static final Codec<RateLimitConfig> CODEC
private Boolean enabled
private Integer packetsPerSecond
private Integer burstCapacity
transient HytaleServerConfig hytaleServerConfig
