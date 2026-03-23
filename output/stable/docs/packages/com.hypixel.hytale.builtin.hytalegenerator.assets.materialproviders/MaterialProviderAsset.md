---
title: "MaterialProviderAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders.MaterialProviderAsset"
api_surface: false
extends: null
implements: ["Cleanable", "JsonAssetWithMap<String, DefaultAssetMap<String, MaterialProviderAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "material"
  - "asset"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.materialproviders`

```java
public class MaterialProviderAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, MaterialProviderAsset>>
```

Abstract base for all material provider assets. Defines the CODEC hierarchy, skip/export functionality, and the `build()` contract that subclasses implement to produce a `MaterialProvider<Material>`.
