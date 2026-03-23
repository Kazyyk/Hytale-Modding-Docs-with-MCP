---
title: "DensityPatternAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.patterns.DensityPatternAsset"
api_surface: false
extends: "PatternAsset"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "builtin"
  - "patterns"
---
**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.patterns`

```java
public class DensityPatternAsset extends PatternAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `DensityPatternAsset.DelimiterAsset[]` | `delimiterAssets` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `double` | `min` |
| `private` | `double` | `max` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Pattern` | `build(@Nonnull PatternAsset.Argument argument)` |
| `public` | `void` | `cleanUp()` |
| `public` | `String` | `getId()` |
