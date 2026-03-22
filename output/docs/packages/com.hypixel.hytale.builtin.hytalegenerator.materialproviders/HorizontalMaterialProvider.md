---
title: "HorizontalMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.HorizontalMaterialProvider"
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
public class HorizontalMaterialProvider<V> extends MaterialProvider<V>
```

Provider supplying HorizontalMaterial values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `MaterialProvider<V>` | `materialProvider` |
| `private` | `double` | `topY` |
| `private` | `double` | `bottomY` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `HorizontalMaterialProvider(@Nonnull MaterialProvider<V> materialProvider, double topY, double bottomY)` |
| `@Nullable @Override public` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
