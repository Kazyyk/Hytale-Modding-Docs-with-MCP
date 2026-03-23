---
title: "BlockMaskAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.blockmask"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.blockmask.BlockMaskAsset"
api_surface: false
extends: ~
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskAsset>>"
  - "Cleanable"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.blockmask`

```java
public class BlockMaskAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskAsset>>, Cleanable
```

Implementation of `JsonAssetWithMap<String, DefaultAssetMap<String, BlockMaskAsset>>, Cleanable`.

## Fields

| Field | Type | Description |
|---|---|---|
| `id` | `String` | String field. |
| `data` | `AssetExtraInfo.Data` | AssetExtraInfo.Data field. |
| `exportName` | `String` | String field. |
| `importName` | `String` | String field. |
| `blockMaskEntries` | `BlockMaskEntryAsset[]` | BlockMaskEntryAsset[] field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `build(@Nonnull MaterialCache materialCache)` | `BlockMask` | public method. |
| `getId()` | `String` | public method. |
| `cleanUp()` | `void` | public method. |
