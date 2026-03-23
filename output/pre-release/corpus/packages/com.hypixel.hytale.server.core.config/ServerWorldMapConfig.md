# ServerWorldMapConfig

Type: class | Package: com.hypixel.hytale.server.core.config | Extends: WorldMapConfig

public final class ServerWorldMapConfig extends WorldMapConfig

Server-level world map configuration. Extends WorldMapConfig with server defaults: minimum view radius of 1, maximum view radius of 512. Changes propagate to `HytaleServerConfig` via the `markChanged()` mechanism.

## Methods


public void setHytaleServerConfig(@Nonnull HytaleServerConfig hytaleServerConfig)

Associates this config with a server config for change tracking.


@Override
public int getDefaultViewRadiusMin()

Returns `1`.


@Override
public int getDefaultViewRadiusMax()

Returns `512`.

## Related Types

- WorldMapConfig -- abstract base class
- WorldWorldMapConfig -- per-world variant
- `HytaleServerConfig` -- owns this config

Also in this package: AutoApplyMode, BackupConfig, ModConfig, RateLimitConfig, UpdateConfig, WorldMapConfig, WorldWorldMapConfig

Complete API:
  public void setHytaleServerConfig(HytaleServerConfig hytaleServerConfig)
  public int getDefaultViewRadiusMin()
  public int getDefaultViewRadiusMax()
  public void setViewRadiusMin(int viewRadiusMin)
  public void setViewRadiusMax(int viewRadiusMax)

Fields:
public static final Codec<ServerWorldMapConfig> CODEC
private transient HytaleServerConfig hytaleServerConfig
