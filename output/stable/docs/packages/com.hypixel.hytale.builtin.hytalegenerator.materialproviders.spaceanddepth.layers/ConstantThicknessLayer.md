---
title: "ConstantThicknessLayer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.layers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.layers.ConstantThicknessLayer"
api_surface: false
extends: "Layer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "materialproviders"
  - "spaceanddepth"
  - "layers"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.layers`

```java
public class ConstantThicknessLayer<V> extends Layer
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `thickness` |
| `private final` | `MaterialProvider<V>` | `materialProvider` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getThicknessAt(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling, double distanceTOBiomeEdge)` |
| `@Nullable @Override public` | `MaterialProvider<V>` | `getMaterialProvider()` |
