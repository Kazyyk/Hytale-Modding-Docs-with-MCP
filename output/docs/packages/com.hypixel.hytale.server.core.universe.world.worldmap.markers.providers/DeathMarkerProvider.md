---
title: "DeathMarkerProvider"
kind: "class"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.providers"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.providers.DeathMarkerProvider"
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
public class DeathMarkerProvider implements WorldMapManager.MarkerProvider
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `DeathMarkerProvider` | `INSTANCE` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `DeathMarkerProvider()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `update(@Nonnull World world, @Nonnull Player player, @Nonnull MarkersCollector collector)` |
| `private static` | `void` | `addDeathMarker(@Nonnull MarkersCollector collector, @Nonnull PlayerDeathPositionData deathPosition)` |
