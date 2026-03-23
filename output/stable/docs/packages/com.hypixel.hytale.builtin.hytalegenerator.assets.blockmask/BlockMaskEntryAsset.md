---
title: "BlockMaskEntryAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.blockmask"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.blockmask.BlockMaskEntryAsset"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskEntryAsset>>"
  - "Cleanable"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.blockmask`

```java
public class BlockMaskEntryAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskEntryAsset>>, Cleanable
```

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskEntryAsset>>, Cleanable`.

## Fields

| Field | Type | Description |
|---|---|---|
| `id` | `String` | String field. |
| `data` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |

## Constructors

| Constructor | Description |
|---|---|
| `BlockMaskEntryAsset()` | Creates a new BlockMaskEntryAsset instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getPropBlockSet(@Nonnull MaterialCache materialCache)` | `MaterialSet` | public method. |
| `getReplacesBlockSet(@Nonnull MaterialCache materialCache)` | `MaterialSet` | public method. |
| `getId()` | `String` | public method. |
| `cleanUp()` | `void` | public method. |
