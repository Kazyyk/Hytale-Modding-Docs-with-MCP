---
title: "NodeFunctionYOutAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves.legacy"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves.legacy.NodeFunctionYOutAsset"
api_surface: false
extends: null
implements: ["JsonAssetWithMap", "Cleanable"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "curves"
  - "legacy"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.curves.legacy`

```java
public class NodeFunctionYOutAsset implements JsonAssetWithMap, Cleanable
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,NodeFunctionYOutAsset>` | `CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `PointYOutAsset[]` | `nodes` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `NodeFunction` | `build()` |
| `public` | `String` | `getId()` |
| `@Override public` | `void` | `cleanUp()` |
