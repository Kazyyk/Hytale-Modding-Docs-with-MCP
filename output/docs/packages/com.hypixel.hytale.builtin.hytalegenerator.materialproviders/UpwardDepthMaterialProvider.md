---
title: "UpwardDepthMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.UpwardDepthMaterialProvider"
api_surface: false
extends: "MaterialProvider<V>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "materialproviders"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.materialproviders`

```java
public class UpwardDepthMaterialProvider<V> extends MaterialProvider<V>
```

Provider supplying UpwardDepthMaterial values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `MaterialProvider<V>` | `materialProvider` |
| `private final` | `int` | `depth` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `UpwardDepthMaterialProvider(@Nonnull MaterialProvider<V> materialProvider, int depth)` |
| `@Nullable @Override public` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
