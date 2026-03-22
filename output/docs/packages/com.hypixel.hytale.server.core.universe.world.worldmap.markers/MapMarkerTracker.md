---
title: "MapMarkerTracker"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.markers"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.MapMarkerTracker"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "universe"
  - "world-map"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap.markers`

```java
public class MapMarkerTracker
```

Class in the markers subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `worldMapTracker` | `WorldMapTracker` | final WorldMapTracker field. |
| `player` | `Player` | final Player field. |
| `SMALL_MOVEMENTS_UPDATE_INTERVAL` | `float` | Static final float field. |
| `smallMovementsTimer` | `float` | float field. |
| `playerMapFilter` | `Predicate<PlayerRef>` | Predicate<PlayerRef> field. |

## Constructors

| Constructor | Description |
|---|---|
| `MapMarkerTracker(WorldMapTracker worldMapTracker)` | Creates a new MapMarkerTracker instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getPlayer()` | `Player` | public method. |
| `getSentMarkers()` | `Map<String, MapMarker>` | public method. |
| `getPlayerMapFilter()` | `Predicate<PlayerRef>` | public method. |
| `setPlayerMapFilter(Predicate<PlayerRef> playerMapFilter)` | `void` | public method. |
| `isSendingSmallMovements()` | `boolean` | private method. |
| `resetSmallMovementTimer()` | `void` | private method. |
| `updatePointsOfInterest(float dt, @Nonnull World world, int chunkViewRadius, int playerChunkX, int playerChunkZ)` | `void` | public method. |
| `sendMapMarker(MapMarker marker)` | `void` | public method. |
| `doesMarkerNeedNetworkUpdate(@Nullable MapMarker oldMarker, MapMarker newMarker)` | `boolean` | private method. |
| `copyFrom(@Nonnull MapMarkerTracker other)` | `void` | public method. |
