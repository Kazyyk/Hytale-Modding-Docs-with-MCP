---
title: "MarkersCollectorImpl"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.markers"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.MarkersCollectorImpl"
api_surface: false
extends: ~
implements: 
  - "MarkersCollector"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "universe"
  - "world-map"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap.markers`

```java
class MarkersCollectorImpl implements MarkersCollector
```

Implementation of `MarkersCollector`.

## Fields

| Field | Type | Description |
|---|---|---|
| `tracker` | `MapMarkerTracker` | final MapMarkerTracker field. |
| `chunkViewRadius` | `int` | final int field. |
| `playerChunkX` | `int` | final int field. |
| `playerChunkZ` | `int` | final int field. |

## Constructors

| Constructor | Description |
|---|---|
| `MarkersCollectorImpl(MapMarkerTracker tracker, int chunkViewRadius, int playerChunkX, int playerChunkZ)` | Creates a new MarkersCollectorImpl instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getChunkViewRadius()` | `int` | public method. |
| `getPlayerChunkX()` | `int` | public method. |
| `getPlayerChunkZ()` | `int` | public method. |
| `isInViewDistance(double x, double z)` | `boolean` | public method. |
| `add(MapMarker marker)` | `void` | public method. |
| `addIgnoreViewDistance(MapMarker marker)` | `void` | public method. |
| `getPlayerMapFilter()` | `Predicate<PlayerRef>` | public method. |
