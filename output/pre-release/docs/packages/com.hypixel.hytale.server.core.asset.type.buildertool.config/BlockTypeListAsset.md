---
title: "BlockTypeListAsset"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.buildertool.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.buildertool.config.BlockTypeListAsset"
api_surface: false
extends: null
implements:
  - "JsonAssetWithMap<String, DefaultAssetMap<String, BlockTypeListAsset>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T05:44:26Z"
tags:
  - "buildertool"
  - "asset"
  - "class"
  - "internal"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.buildertool.config`

```java
public class BlockTypeListAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, BlockTypeListAsset>>
```

Asset that defines a named list of block type keys, used by builder tools to configure block palettes. Converts the block list into a `BlockPattern` for weighted random selection.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String, BlockTypeListAsset, DefaultAssetMap<String, BlockTypeListAsset>>` | `getAssetStore()` |
| `public static` | `DefaultAssetMap<String, BlockTypeListAsset>` | `getAssetMap()` |
| `public` | `BlockPattern` | `getBlockPattern()` |
| `public` | `HashSet<String>` | `getBlockTypeKeys()` |
| `public` | `String` | `getId()` |
