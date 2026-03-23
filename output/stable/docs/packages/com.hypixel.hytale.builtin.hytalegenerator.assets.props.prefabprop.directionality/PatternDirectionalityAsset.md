---
title: "PatternDirectionalityAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop.directionality"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop.directionality.PatternDirectionalityAsset"
api_surface: false
extends: "DirectionalityAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "props"
  - "prefabprop"
  - "directionality"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop.directionality`

```java
public class PatternDirectionalityAsset extends DirectionalityAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<PatternDirectionalityAsset>` | `CODEC` |
| `private` | `String` | `seed` |
| `private` | `OrthogonalDirection` | `prefabDirection` |
| `private` | `PatternAsset` | `northPatternAsset` |
| `private` | `PatternAsset` | `southPatternAsset` |
| `private` | `PatternAsset` | `eastPatternAsset` |
| `private` | `PatternAsset` | `westPatternAsset` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Directionality` | `build(@Nonnull DirectionalityAsset.Argument argument)` |
| `@Override public` | `void` | `cleanUp()` |
