---
title: "CellNoiseAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.noisegenerators"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.noisegenerators.CellNoiseAsset"
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
public class CellNoiseAsset extends NoiseAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `Set<String>` | `validCellTypes` |
| `public static final` | `BuilderCodec<CellNoiseAsset>` | `CODEC` |
| `private` | `double` | `warpScale` |
| `private` | `double` | `warpAmount` |
| `private` | `double` | `scale` |
| `private` | `double` | `jitter` |
| `private` | `int` | `octaves` |
| `private` | `String` | `seedKey` |
| `private` | `FastNoiseLite.CellularReturnType` | `cellType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `CellNoiseField` | `build(SeedBox parentSeed)` |
