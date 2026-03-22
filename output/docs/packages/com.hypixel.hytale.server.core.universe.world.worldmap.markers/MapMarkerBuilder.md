---
title: "MapMarkerBuilder"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.markers"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.MapMarkerBuilder"
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
public class MapMarkerBuilder
```

Class in the markers subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `id` | `String` | final String field. |
| `image` | `String` | final String field. |
| `transform` | `Transform` | final Transform field. |
| `name` | `Message` | Message field. |
| `customName` | `String` | String field. |
| `contextMenuItems` | `List<ContextMenuItem>` | List<ContextMenuItem> field. |
| `mapMarkerComponents` | `List<MapMarkerComponent>` | List<MapMarkerComponent> field. |

## Constructors

| Constructor | Description |
|---|---|
| `MapMarkerBuilder(String id, String image, Transform transform)` | Creates a new MapMarkerBuilder instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `withName(Message name)` | `MapMarkerBuilder` | public method. |
| `withCustomName(String customName)` | `MapMarkerBuilder` | public method. |
| `withContextMenuItem(ContextMenuItem contextMenuItem)` | `MapMarkerBuilder` | public method. |
| `withComponent(MapMarkerComponent component)` | `MapMarkerBuilder` | public method. |
| `build()` | `MapMarker` | public method. |
