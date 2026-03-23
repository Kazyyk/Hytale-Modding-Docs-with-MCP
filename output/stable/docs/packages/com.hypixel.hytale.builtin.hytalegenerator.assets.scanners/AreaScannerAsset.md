---
title: "AreaScannerAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.scanners"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.scanners.AreaScannerAsset"
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
public class AreaScannerAsset extends ScannerAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<AreaScannerAsset>` | `CODEC` |
| `private` | `int` | `resultCap` |
| `private` | `AreaScanner.ScanShape` | `scanShape` |
| `private` | `int` | `scanRange` |
| `private` | `ScannerAsset` | `childScannerAsset` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `Scanner` | `build(@Nonnull ScannerAsset.Argument argument)` |
| `@Override public` | `void` | `cleanUp()` |
