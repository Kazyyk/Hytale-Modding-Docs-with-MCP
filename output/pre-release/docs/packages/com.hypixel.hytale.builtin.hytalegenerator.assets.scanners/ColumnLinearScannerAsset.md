---
title: "ColumnLinearScannerAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.scanners"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.scanners.ColumnLinearScannerAsset"
api_surface: false
extends: "ScannerAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "scanners"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.scanners`

```java
public class ColumnLinearScannerAsset extends ScannerAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<ColumnLinearScannerAsset>` | `CODEC` |
| `private` | `int` | `minY` |
| `private` | `int` | `maxY` |
| `private` | `int` | `resultCap` |
| `private` | `boolean` | `topDownOrder` |
| `private` | `boolean` | `isRelativeToPosition` |
| `private` | `String` | `baseHeightName` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Scanner` | `build(@Nonnull ScannerAsset.Argument argument)` |
