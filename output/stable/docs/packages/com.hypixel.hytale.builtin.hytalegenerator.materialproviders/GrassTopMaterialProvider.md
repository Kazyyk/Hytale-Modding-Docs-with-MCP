---
title: "GrassTopMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.GrassTopMaterialProvider"
api_surface: false
extends: "MaterialProvider<SolidMaterial>"
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
public class GrassTopMaterialProvider extends MaterialProvider<SolidMaterial>
```

Provider supplying GrassTopMaterial values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `SolidMaterial` | `grass` |
| `private final` | `SolidMaterial` | `dirt` |
| `private final` | `SolidMaterial` | `stone` |
| `private final` | `SolidMaterial` | `empty` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `GrassTopMaterialProvider(@Nonnull SolidMaterial grass, @Nonnull SolidMaterial dirt, @Nonnull SolidMaterial stone, @Nonnull SolidMaterial empty)` |
| `public` | `SolidMaterial` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
