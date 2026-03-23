---
title: "MaterialSetAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.blockset"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.blockset.MaterialSetAsset"
api_surface: false
extends: ~
implements: ['JsonAssetWithMap', 'DefaultAssetMap', 'MaterialSetAsset>>', 'Cleanable']
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "hytalegenerator"
  - "assets"
  - "blockset"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.blockset`

```java
public class MaterialSetAsset implements JsonAssetWithMap<String, DefaultAssetMap<String, MaterialSetAsset>>, Cleanable
```

Asset configuration loaded from JSON data packs.

## Accessors

| Method | Returns | Description |
|---|---|---|
| `getId()` | `String` | Accessor method. |

## Methods

| Method | Returns | Description |
|---|---|---|
| `build(MaterialCache materialCache)` | `MaterialSet` | Instance method. |
| `cleanUp()` | `void` | Instance method. |
