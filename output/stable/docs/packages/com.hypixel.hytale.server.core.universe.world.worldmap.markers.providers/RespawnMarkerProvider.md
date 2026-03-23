---
title: "RespawnMarkerProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.providers"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.providers.RespawnMarkerProvider"
api_surface: false
extends: ~
implements: ["WorldMapManager.MarkerProvider"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "server"
  - "core"
  - "universe"
  - "world"
  - "worldmap"
  - "markers"
  - "providers"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.universe.world.worldmap.markers.providers`

```java
public class RespawnMarkerProvider implements WorldMapManager.MarkerProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `RespawnMarkerProvider` | `INSTANCE` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `RespawnMarkerProvider()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `update(@Nonnull World world, @Nonnull Player player, @Nonnull MarkersCollector collector)` |
| `private static` | `void` | `addRespawnMarker(MarkersCollector collector, PlayerRespawnPointData respawnPoint, int index)` |
