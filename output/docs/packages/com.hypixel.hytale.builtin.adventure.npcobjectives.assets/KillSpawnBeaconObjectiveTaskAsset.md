---
title: "KillSpawnBeaconObjectiveTaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.npcobjectives.assets"
fqcn: "com.hypixel.hytale.builtin.adventure.npcobjectives.assets.KillSpawnBeaconObjectiveTaskAsset"
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
public class KillSpawnBeaconObjectiveTaskAsset extends KillObjectiveTaskAsset
```

Asset definition for KillSpawnBeaconObjectiveTask configuration data.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `KillSpawnBeaconObjectiveTaskAsset.ObjectiveSpawnBeacon[]` | `spawnBeacons` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `KillSpawnBeaconObjectiveTaskAsset(String descriptionId,
        TaskConditionAsset[] taskConditions,
        Vector3i[] mapMarkers,
        int count,
        String npcGroupId,
        KillSpawnBeaconObjectiveTaskAsset.ObjectiveSpawnBeacon[] spawnBeacons)` |
| `protected` | | `KillSpawnBeaconObjectiveTaskAsset()` |
| `public` | `KillSpawnBeaconObjectiveTaskAsset.ObjectiveSpawnBeacon[]` | `getSpawnBeacons()` |
| `@Override protected` | `boolean` | `matchesAsset0(ObjectiveTaskAsset task)` |
| `@Nonnull @Override public` | `String` | `toString()` |
