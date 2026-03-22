---
title: "WorldMapTracker"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world"
fqcn: "com.hypixel.hytale.server.core.universe.world.WorldMapTracker"
api_surface: true
implements:
  - "Tickable"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "world"
  - "world-map"
  - "player"
---

**Package:** `com.hypixel.hytale.server.core.universe.world`

```java
public class WorldMapTracker implements Tickable
```

Per-player tracker that manages world map state: loading/unloading map chunk images in a spiral pattern around the player, tracking zone discoveries with title/sound notifications, managing map markers, and handling pending reload chunks. Uses a read-write lock for thread-safe access to the loaded chunk set. Sends `UpdateWorldMap`, `ClearWorldMap`, and `UpdateWorldMapSettings` packets to the player.

## Constants

| Field | Type | Value | Description |
|---|---|---|---|
| `UPDATE_SPEED` | `float` | `1.0F` | Seconds between map update ticks. |
| `RADIUS_MAX` | `int` | `512` | Maximum map view radius in chunks. |
| `MAX_IMAGE_GENERATION` | `int` | `20` | Maximum map images generated per tick. |
| `MAX_FRAME` | `int` | `2621440` | Maximum packet frame size. |

## Key Methods

| Method | Return Type | Description |
|---|---|---|
| `tick(float)` | `void` | Tick handler: updates compass markers and loads/unloads map images. |
| `updateCurrentZoneAndBiome(Ref, ZoneDiscoveryInfo, String, ComponentAccessor)` | `void` | Updates the player's current zone and biome; fires zone discovery events. |
| `discoverZone(World, String)` | `boolean` | Records a zone as discovered and refreshes settings. Returns true if newly discovered. |
| `undiscoverZone(World, String)` | `boolean` | Removes a zone from the discovered set. |
| `discoverZones(World, Set<String>)` | `boolean` | Batch-discovers multiple zones. |
| `clear()` | `void` | Clears all loaded map data and markers. |
| `clearChunks(LongSet)` | `void` | Queues specific chunks for reload. |
| `sendSettings(World)` | `void` | Sends map settings (teleport permissions, marker creation, etc.) to the client. |
| `setViewRadiusOverride(Integer)` | `void` | Overrides the map view radius (null restores default). |
| `getPlayer()` | `Player` | Returns the owning player. |
| `getSentMarkers()` | `Map<String, MapMarker>` | Returns markers currently sent to the client. |
| `copyFrom(WorldMapTracker)` | `void` | Copies loaded chunk and marker state from another tracker. |

## Inner Types

### ZoneDiscoveryInfo (record)

Immutable data class for zone discovery events.

| Field | Type | Description |
|---|---|---|
| `zoneName` | `String` | Zone identifier. |
| `regionName` | `String` | Parent region identifier. |
| `display` | `boolean` | Whether to display the discovery title. |
| `discoverySoundEventId` | `String` | Sound event to play, or null. |
| `icon` | `String` | Discovery icon identifier, or null. |
| `major` | `boolean` | Whether this is a major zone discovery. |
| `duration` | `float` | Title display duration. |
| `fadeInDuration` | `float` | Title fade-in duration. |
| `fadeOutDuration` | `float` | Title fade-out duration. |

## See Also

- [World](World.md)
- [WorldNotificationHandler](WorldNotificationHandler.md)
