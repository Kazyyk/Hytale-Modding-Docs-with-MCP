---
title: "KillSpawnMarkerObjectiveTaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.assets"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.assets.KillSpawnMarkerObjectiveTaskAsset"
api_surface: false
extends: "KillObjectiveTaskAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "npcobjectives"
  - "assets"
---

**Package:** `com.hypixel.hytale.builtin.adventure.npcobjectives.assets`

```java
public class KillSpawnMarkerObjectiveTaskAsset extends KillObjectiveTaskAsset
```

Asset definition for KillSpawnMarkerObjectiveTask configuration data.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected` | `String[]` | `spawnMarkerIds` |  |
| `protected` | `float` | `radius` | `1.0F` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `KillSpawnMarkerObjectiveTaskAsset(String descriptionId, TaskConditionAsset[] taskConditions, Vector3i[] mapMarkers, int count, String npcGroupId, String[] spawnMarkerIds, float radius)` |
| `protected` | | `KillSpawnMarkerObjectiveTaskAsset()` |
| `@Nonnull public` | `String[]` | `getSpawnMarkerIds()` |
| `public` | `float` | `getRadius()` |
| `@Override protected` | `boolean` | `matchesAsset0(ObjectiveTaskAsset task)` |
| `@Nonnull @Override public` | `String` | `toString()` |
