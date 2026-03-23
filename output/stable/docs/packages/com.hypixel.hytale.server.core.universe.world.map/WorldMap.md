---
title: "WorldMap"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.map"
fqcn: "com.hypixel.hytale.server.core.universe.world.map.WorldMap"
api_surface: false
extends: null
implements: ["NetworkSerializable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "map"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.map`

```java
public class WorldMap implements NetworkSerializable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Map<String,MapMarker>` | `pointsOfInterest` |
| `private final` | `Long2ObjectMap<MapImage>` | `chunks` |
| `private` | `UpdateWorldMap` | `packet` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `Map<String,MapMarker>` | `getPointsOfInterest()` |
| `@Nonnull public` | `Long2ObjectMap<MapImage>` | `getChunks()` |
| `public` | `void` | `addPointOfInterest(String id, String name, String markerType, Vector3i pos)` |
| `public` | `void` | `addPointOfInterest(String id, String name, String markerType, Vector3d pos)` |
| `public` | `void` | `addPointOfInterest(String id, String name, String markerType, Transform transform)` |
| `@Nonnull public` | `UpdateWorldMap` | `toPacket()` |
| `@Nonnull @Override public` | `String` | `toString()` |
