---
title: "WorldMapConfig"
kind: "class"
package: "com.hypixel.hytale.server.core.config"
fqcn: "com.hypixel.hytale.server.core.config.WorldMapConfig"
api_surface: true
extends: "java.lang.Object"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T21:11:06Z"
tags:
  - "config"
  - "worldmap"
---

**Package:** `com.hypixel.hytale.server.core.config`

```java
public abstract class WorldMapConfig
```

Abstract base class for world map view radius configuration. Defines `ViewRadiusMin` and `ViewRadiusMax` properties with codec support and validation (min <= max, max <= 512). Subclasses provide concrete defaults for server-level and per-world configurations.

## Constants

| Constant | Value |
|---|---|
| `ABSOLUTE_MAX_VIEW_RADIUS` | `512` |

## Methods

```java
public abstract int getDefaultViewRadiusMin()
```

Returns the default minimum view radius for this config type.

```java
public abstract int getDefaultViewRadiusMax()
```

Returns the default maximum view radius for this config type.

```java
public int getViewRadiusMin()
```

Returns the configured minimum view radius, falling back to the default.

```java
public void setViewRadiusMin(int viewRadiusMin)
```

Sets the minimum view radius.

```java
public int getViewRadiusMax()
```

Returns the configured maximum view radius, falling back to the default.

```java
public void setViewRadiusMax(int viewRadiusMax)
```

Sets the maximum view radius.

## Related Types

- [ServerWorldMapConfig](ServerWorldMapConfig.md) -- server-level implementation
- [WorldWorldMapConfig](WorldWorldMapConfig.md) -- per-world implementation
