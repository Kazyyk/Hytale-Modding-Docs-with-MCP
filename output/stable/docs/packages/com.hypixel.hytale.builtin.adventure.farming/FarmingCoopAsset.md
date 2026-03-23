---
title: "FarmingCoopAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.FarmingCoopAsset"
api_surface: false
extends: null
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, FarmingCoopAsset>>"
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "config"
  - "asset"
  - "coop"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config`

```java
public class FarmingCoopAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, FarmingCoopAsset>>
```

Data-driven asset defining the configuration for a farming coop block. Loaded from `Farming/Coops` by [FarmingPlugin](FarmingPlugin.md). Configures maximum residents, produce drops, NPC group acceptance, wild capture behavior, and resident spawn offsets.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `String` | `id` |
| `protected` | `int` | `maxResidents` |
| `protected` | `Map<String, String>` | `produceDrops` |
| `protected` | `IntRange` | `residentRoamTime` |
| `@Nonnull protected` | `Vector3d` | `residentSpawnOffset` |
| `protected` | `String[]` | `acceptedNpcGroupIds` |
| `protected` | `int[]` | `acceptedNpcGroupIndexes` |
| `protected` | `boolean` | `captureWildNPCsInRange` |
| `protected` | `float` | `wildCaptureRadius` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String, FarmingCoopAsset, DefaultAssetMap<String, FarmingCoopAsset>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String, FarmingCoopAsset>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `Map<String, String>` | `getProduceDrops()` |
| `public` | `int` | `getMaxResidents()` |
| `public` | `IntRange` | `getResidentRoamTime()` |
| `@Nonnull public` | `Vector3d` | `getResidentSpawnOffset()` |
| `public` | `int[]` | `getAcceptedNpcGroupIndexes()` |
| `public` | `float` | `getWildCaptureRadius()` |
| `public` | `boolean` | `getCaptureWildNPCsInRange()` |
