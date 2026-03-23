---
title: "RangedThicknessLayer"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.layers"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.spaceanddepth.layers.RangedThicknessLayer"
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
public class RangedThicknessLayer<V> extends Layer
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `int` | `min` |
| `private final` | `int` | `max` |
| `private final` | `int` | `delta` |
| `private final` | `SeedGenerator` | `seedGenerator` |
| `private final` | `MaterialProvider<V>` | `materialProvider` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `int` | `getThicknessAt(int x, int y, int z, int depthIntoFloor, int depthIntoCeiling, int spaceAboveFloor, int spaceBelowCeiling, double distanceTOBiomeEdge)` |
| `@Override public` | `MaterialProvider<V>` | `getMaterialProvider()` |
