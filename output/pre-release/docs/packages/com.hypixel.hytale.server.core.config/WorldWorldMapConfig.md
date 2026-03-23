---
title: "WorldWorldMapConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.config"
fqcn: "com.hypixel.hytale.server.core.config.WorldWorldMapConfig"
api_surface: true
extends: "WorldMapConfig"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "config"
  - "worldmap"
  - "world"
---

**Package:** `com.hypixel.hytale.server.core.config`

```java
public final class WorldWorldMapConfig extends WorldMapConfig
```

Per-world world map configuration. Extends [WorldMapConfig](WorldMapConfig.md) with world-specific defaults and rendering parameters.

## Constants

| Constant | Value | Description |
|---|---|---|
| `DEFAULT_VIEW_RADIUS_MIN` | `3` | Default minimum view radius for worlds |
| `DEFAULT_VIEW_RADIUS_MAX` | `32` | Default maximum view radius for worlds |
| `DEFAULT_IMAGE_SCALE` | `3.0` | Default image scale factor |
| `DEFAULT_VIEW_RADIUS_MULTIPLIER` | `2.0` | Default view radius multiplier |
| `DEFAULT_SCALE` | `128.0` | Default map scale |
| `DEFAULT_MIN_SCALE` | `32.0` | Minimum map scale |
| `DEFAULT_MAX_SCALE` | `175.0` | Maximum map scale |

## Methods

```java
@Override
public int getDefaultViewRadiusMin()
```

Returns `3`.

```java
@Override
public int getDefaultViewRadiusMax()
```

Returns `32`.

## Related Types

- [WorldMapConfig](WorldMapConfig.md) -- abstract base class
- [ServerWorldMapConfig](ServerWorldMapConfig.md) -- server-level variant
