---
title: "MarkersCollector"
kind: "interface"
package: "com.hypixel.hytale.server.core.universe.world.worldmap.markers"
fqcn: "com.hypixel.hytale.server.core.universe.world.worldmap.markers.MarkersCollector"
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
public interface MarkersCollector
```

Interface defining: `add()`, `addIgnoreViewDistance()`, `getPlayerMapFilter()`, `isInViewDistance()`....

## Methods

| Method | Return Type | Description |
|---|---|---|
| `add(MapMarker var1)` | `void` | package-private method. |
| `addIgnoreViewDistance(MapMarker var1)` | `void` | package-private method. |
| `getPlayerMapFilter()` | `Predicate<PlayerRef>` | package-private method. |
| `isInViewDistance(Transform transform)` | `boolean` | package-private method. |
| `isInViewDistance(Vector3d position)` | `boolean` | package-private method. |
| `isInViewDistance(double var1, double var3)` | `boolean` | package-private method. |
