---
title: "WorldMapSettings"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.WorldMapSettings"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldmap"
  - "settings"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap`

```java
public class WorldMapSettings
```

Configuration for world map rendering and visibility. Controls the map area bounds, image scale factor, and view radius constraints. The `DISABLED` singleton represents a world map that is turned off.

## Constants

```java
public static final WorldMapSettings DISABLED
```

Singleton instance representing a disabled world map (settings packet has `enabled = false`).

## Constructors

```java
public WorldMapSettings()
```

Creates disabled settings.

```java
public WorldMapSettings(Box2D worldMapArea, float imageScale, float viewRadiusMultiplier, int viewRadiusMin, int viewRadiusMax, @Nonnull UpdateWorldMapSettings settingsPacket)
```

## Instance Methods

```java
public Box2D getWorldMapArea()
```

```java
public float getImageScale()
```

Returns the scale factor applied to map image dimensions. Default is 0.5.

```java
public UpdateWorldMapSettings getSettingsPacket()
```

```java
public int getViewRadius(int viewRadius)
```

Computes the effective view radius by applying the multiplier and clamping to the configured min/max bounds.

```java
public String toString()
```
