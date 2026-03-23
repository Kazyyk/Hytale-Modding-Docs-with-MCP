---
title: "SimplexNoiseAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.noisegenerators"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.noisegenerators.SimplexNoiseAsset"
api_surface: false
extends: "NoiseAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "noisegenerators"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.noisegenerators`

```java
public class SimplexNoiseAsset extends NoiseAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<SimplexNoiseAsset>` | `CODEC` |
| `private` | `double` | `lacunarity` |
| `private` | `double` | `persistence` |
| `private` | `double` | `scale` |
| `private` | `int` | `octaves` |
| `private` | `String` | `seedKey` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `SimplexNoiseField` | `build(SeedBox parentSeed)` |
