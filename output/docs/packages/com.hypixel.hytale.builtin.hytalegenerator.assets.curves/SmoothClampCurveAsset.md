---
title: "SmoothClampCurveAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves.SmoothClampCurveAsset"
api_surface: false
extends: "CurveAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "curves"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.curves`

```java
public class SmoothClampCurveAsset extends CurveAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `CurveAsset` | `curveAsset` |
| `private` | `double` | `wallA` |
| `private` | `double` | `wallB` |
| `private` | `double` | `range` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `Double2DoubleFunction` | `build()` |
| `@Override public` | `void` | `cleanUp()` |
