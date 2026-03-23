---
title: "PropAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.props"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.props.PropAsset"
api_surface: false
extends: null
implements: ["Cleanable", "JsonAssetWithMap<String, DefaultAssetMap<String, PropAsset>>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "prop"
  - "asset"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.props`

```java
public class PropAsset implements Cleanable, JsonAssetWithMap<String, DefaultAssetMap<String, PropAsset>>
```

Abstract base for all prop assets. Defines the CODEC hierarchy with common fields (Inputs, Condition, Mask) and the `build()` contract that subclasses implement to produce a `Prop` instance.
