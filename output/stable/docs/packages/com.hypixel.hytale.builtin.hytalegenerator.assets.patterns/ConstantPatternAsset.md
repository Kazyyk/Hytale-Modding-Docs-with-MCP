---
title: "ConstantPatternAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.patterns"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.patterns.ConstantPatternAsset"
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
public class ConstantPatternAsset extends PatternAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `boolean` | `value` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Pattern` | `build(@Nonnull PatternAsset.Argument argument)` |
| `public` | `boolean` | `matches(@Nonnull Pattern.Context context)` |
| `public` | `SpaceSize` | `readSpace()` |
