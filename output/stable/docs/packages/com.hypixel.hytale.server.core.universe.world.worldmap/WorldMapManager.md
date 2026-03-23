---
title: "WorldMapManager"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.WorldMapManager"
api_surface: true
extends: "TickingThread"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldmap"
  - "world"
  - "markers"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap`

```java
public class WorldMapManager extends TickingThread
```

Per-world manager for the in-game world map. Runs on a dedicated ticking thread (10 TPS) to generate map images, manage marker providers, track player visibility, and handle image caching with automatic unloading. Registered marker providers include spawn, player icons, death, respawn, personal markers, shared markers, and points of interest.

## Constructors

```java
public WorldMapManager(@Nonnull World world)
```

Creates the manager for the given world and registers all default marker providers.

## Instance Methods

```java
public IWorldMap getGenerator()
```

```java
public void setGenerator(@Nullable IWorldMap generator)
```

Sets or replaces the map generator. Clears cached images, reloads settings, and triggers point-of-interest generation.

```java
public World getWorld()
```

```java
public WorldMapSettings getWorldMapSettings()
```

```java
public boolean isWorldMapEnabled()
```

```java
public Map<String, MarkerProvider> getMarkerProviders()
```

```java
public void addMarkerProvider(@Nonnull String key, @Nonnull MarkerProvider provider)
```

```java
public Map<String, MapMarker> getPointsOfInterest()
```

```java
public MapImage getImageIfInMemory(int x, int z)
```

```java
public MapImage getImageIfInMemory(long index)
```

```java
public CompletableFuture<MapImage> getImageAsync(int x, int z)
```

```java
public CompletableFuture<MapImage> getImageAsync(long index)
```

Returns the cached image or generates it asynchronously via the [IWorldMap](IWorldMap.md) generator.

```java
public void unloadImages()
```

Removes cached map images that are no longer visible to any player, using a 60-tick keep-alive countdown.

```java
public void clearImages()
```

```java
public void clearImagesInChunks(@Nonnull LongSet chunkIndices)
```

```java
public void sendSettings()
```

```java
public boolean shouldTick()
```

```java
public void updateTickingState(boolean before)
```

```java
public void handleUserCreateMarker(PlayerRef playerRef, CreateUserMarker packet)
```

Validates and creates a personal or shared user map marker.

```java
public void handleUserRemoveMarker(PlayerRef playerRef, RemoveMapMarker packet)
```

Validates and removes a user map marker (personal, shared, or death marker).

## Static Methods

```java
public static boolean isWorldMapImageVisibleToAnyPlayer(@Nonnull List<Player> players, long imageIndex, @Nonnull WorldMapSettings settings)
```

```java
public static void sendSettingsToAllWorlds()
```

## Inner Types

### MarkerProvider

```java
public interface MarkerProvider
```

Functional interface for populating map markers for a player. Called per-tick to update dynamic markers.

### MarkerReference

```java
public interface MarkerReference
```

Codec-registered reference to a map marker that supports remote removal.

### PlayerMarkerReference

```java
public static class PlayerMarkerReference implements MarkerReference
```

Codec-serializable reference to a player's personal map marker, supporting removal for both online and offline players.

### ImageEntry

```java
public static class ImageEntry
```

Cache entry wrapping a `MapImage` with an atomic keep-alive counter for eviction.
