# WorldMapConfig

Type: class | Package: com.hypixel.hytale.server.core.config | Extends: java.lang.Object

public abstract class WorldMapConfig

Abstract base class for world map view radius configuration. Defines `ViewRadiusMin` and `ViewRadiusMax` properties with codec support and validation (min <= max, max <= 512). Subclasses provide concrete defaults for server-level and per-world configurations.

## Constants

- ABSOLUTE_MAX_VIEW_RADIUS | 512

## Methods


public abstract int getDefaultViewRadiusMin()

Returns the default minimum view radius for this config type.


public abstract int getDefaultViewRadiusMax()

Returns the default maximum view radius for this config type.


public int getViewRadiusMin()

Returns the configured minimum view radius, falling back to the default.


public void setViewRadiusMin(int viewRadiusMin)

Sets the minimum view radius.


public int getViewRadiusMax()

Returns the configured maximum view radius, falling back to the default.


public void setViewRadiusMax(int viewRadiusMax)

Sets the maximum view radius.

## Related Types

- ServerWorldMapConfig -- server-level implementation
- WorldWorldMapConfig -- per-world implementation

Known subclasses: ServerWorldMapConfig, WorldWorldMapConfig

Also in this package: AutoApplyMode, BackupConfig, ModConfig, RateLimitConfig, ServerWorldMapConfig, UpdateConfig, WorldWorldMapConfig

Complete API:
  public abstract int getDefaultViewRadiusMin()
  public abstract int getDefaultViewRadiusMax()
  public int getViewRadiusMin()
  public void setViewRadiusMin(int viewRadiusMin)
  public int getViewRadiusMax()
  public void setViewRadiusMax(int viewRadiusMax)
  protected static void validate(WorldMapConfig config, int ceiling)

Fields:
public static final int ABSOLUTE_MAX_VIEW_RADIUS
public static final BuilderCodec<WorldMapConfig> ABSTRACT_CODEC
protected Integer viewRadiusMin
protected Integer viewRadiusMax
