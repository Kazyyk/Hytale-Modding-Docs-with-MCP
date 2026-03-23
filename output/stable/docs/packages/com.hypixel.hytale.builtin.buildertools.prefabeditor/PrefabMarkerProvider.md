---
title: "PrefabMarkerProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.PrefabMarkerProvider"
api_surface: false
implements:
  - "WorldMapManager.MarkerProvider"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "builder-tools"
  - "prefab-editor"
  - "world-map"
  - "markers"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor`

```java
public class PrefabMarkerProvider implements WorldMapManager.MarkerProvider
```

Singleton marker provider that adds world map markers for all loaded prefabs in the player's active edit session. Each prefab produces a `MapMarker` at its location.

## Fields

| Field | Type | Description |
|---|---|---|
| `INSTANCE` | `PrefabMarkerProvider` | Singleton instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `update(World, Player, MarkersCollector)` | `void` | Collects markers for all prefabs in the player's edit session. |

## See Also

- [PrefabEditSession](PrefabEditSession.md)
