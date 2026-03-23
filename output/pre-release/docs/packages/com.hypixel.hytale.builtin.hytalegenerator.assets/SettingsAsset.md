---
title: "SettingsAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.SettingsAsset"
api_surface: false
extends: "null"
implements: ["JsonAssetWithMap<String", "DefaultAssetMap<String, SettingsAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets`

```java
public class SettingsAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, SettingsAsset>>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String, SettingsAsset>` | `CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `Integer[]` | `checkpoints` |
| `private` | `int` | `customConcurrency` |
| `private` | `double` | `bufferCapacityFactor` |
| `private` | `double` | `targetViewDistance` |
| `private` | `double` | `targetPlayerCount` |

## Constructors

| Modifier | Signature |
|---|---|
| `private` | `SettingsAsset()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `List<Integer>` | `getStatsCheckpoints()` |
| `` | `public int` | `getCustomConcurrency()` |
| `` | `public double` | `getBufferCapacityFactor()` |
| `` | `public double` | `getTargetViewDistance()` |
| `` | `public double` | `getTargetPlayerCount()` |
| `` | `public static int` | `getSampleBits(int v)` |
| `` | `return` | `switch(v)` |
| `` | `public String` | `getId()` |
