---
title: "FarmingCoopAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming.config"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.config.FarmingCoopAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "farming"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming.config`

```java
public class FarmingCoopAsset implements JsonAssetWithMap
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,FarmingCoopAsset>` | `CODEC` |
| `private static` | `AssetStore<String,FarmingCoopAsset,DefaultAssetMap<String,FarmingCoopAsset>>` | `ASSET_STORE` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `int` | `maxResidents` |
| `protected` | `Map<String,String>` | `produceDrops` |
| `protected` | `IntRange` | `residentRoamTime` |
| `protected` | `Vector3d` | `residentSpawnOffset` |
| `protected` | `String[]` | `acceptedNpcGroupIds` |
| `protected` | `int[]` | `acceptedNpcGroupIndexes` |
| `protected` | `boolean` | `captureWildNPCsInRange` |
| `protected` | `float` | `wildCaptureRadius` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String,FarmingCoopAsset,DefaultAssetMap<String,FarmingCoopAsset>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String,FarmingCoopAsset>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `public` | `Map<String,String>` | `getProduceDrops()` |
| `public` | `int` | `getMaxResidents()` |
| `public` | `IntRange` | `getResidentRoamTime()` |
| `@Nonnull public` | `Vector3d` | `getResidentSpawnOffset()` |
| `public` | `int[]` | `getAcceptedNpcGroupIndexes()` |
| `public` | `float` | `getWildCaptureRadius()` |
| `public` | `boolean` | `getCaptureWildNPCsInRange()` |
| `@Nonnull @Override public` | `String` | `toString()` |
