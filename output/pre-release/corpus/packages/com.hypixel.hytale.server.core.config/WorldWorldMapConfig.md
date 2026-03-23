# WorldWorldMapConfig

Type: class | Package: com.hypixel.hytale.server.core.config | Extends: WorldMapConfig

public final class WorldWorldMapConfig extends WorldMapConfig

Per-world world map configuration. Extends WorldMapConfig with world-specific defaults and rendering parameters.

## Constants

- DEFAULT_VIEW_RADIUS_MIN | 3 | Default minimum view radius for worlds
- DEFAULT_VIEW_RADIUS_MAX | 32 | Default maximum view radius for worlds
- DEFAULT_IMAGE_SCALE | 3.0 | Default image scale factor
- DEFAULT_VIEW_RADIUS_MULTIPLIER | 2.0 | Default view radius multiplier
- DEFAULT_SCALE | 128.0 | Default map scale
- DEFAULT_MIN_SCALE | 32.0 | Minimum map scale
- DEFAULT_MAX_SCALE | 175.0 | Maximum map scale

## Methods


@Override
public int getDefaultViewRadiusMin()

Returns `3`.


@Override
public int getDefaultViewRadiusMax()

Returns `32`.

## Related Types

- WorldMapConfig -- abstract base class
- ServerWorldMapConfig -- server-level variant

Also in this package: AutoApplyMode, BackupConfig, ModConfig, RateLimitConfig, ServerWorldMapConfig, UpdateConfig, WorldMapConfig

Complete API:
  public int getDefaultViewRadiusMin()
  public int getDefaultViewRadiusMax()

Fields:
public static final int DEFAULT_VIEW_RADIUS_MIN
public static final int DEFAULT_VIEW_RADIUS_MAX
public static final float DEFAULT_IMAGE_SCALE
public static final float DEFAULT_VIEW_RADIUS_MULTIPLIER
public static final float DEFAULT_SCALE
public static final float DEFAULT_MIN_SCALE
public static final float DEFAULT_MAX_SCALE
public static final Codec<WorldWorldMapConfig> CODEC
