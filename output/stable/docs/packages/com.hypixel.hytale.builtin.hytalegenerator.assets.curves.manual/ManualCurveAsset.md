---
title: "ManualCurveAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves.manual"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.curves.manual.ManualCurveAsset"
api_surface: false
extends: "CurveAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "curves"
  - "manual"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.curves.manual`

```java
public class ManualCurveAsset extends CurveAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `BuilderCodec<ManualCurveAsset>` | `CODEC` |
| `private` | `String` | `id` |
| `private` | `AssetExtraInfo.Data` | `data` |
| `private` | `PointInOutAsset[]` | `nodes` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `NodeFunction` | `build()` |
| `@Override public` | `String` | `getId()` |
| `@Override public` | `void` | `cleanUp()` |
