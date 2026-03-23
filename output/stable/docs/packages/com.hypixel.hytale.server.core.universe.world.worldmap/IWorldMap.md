---
title: "IWorldMap"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.worldmap"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.IWorldMap"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "worldmap"
  - "generation"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap`

```java
public interface IWorldMap
```

Interface for world map generators that produce map images and points of interest from world data. Implementations are responsible for asynchronously rendering map tiles and discovering notable locations.

## Methods

```java
WorldMapSettings getWorldMapSettings()
```

Returns the settings controlling map area, image scale, and view radius.

```java
CompletableFuture<WorldMap> generate(World var1, int var2, int var3, LongSet var4)
```

Asynchronously generates map images for the specified chunk indices at the given dimensions.

```java
CompletableFuture<Map<String, MapMarker>> generatePointsOfInterest(World var1)
```

Asynchronously discovers and returns all points of interest as named map markers.

```java
default void shutdown()
```

Called when this generator is replaced or the world shuts down. Default implementation is a no-op.
