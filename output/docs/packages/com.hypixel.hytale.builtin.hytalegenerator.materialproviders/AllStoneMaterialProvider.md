---
title: "AllStoneMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.AllStoneMaterialProvider"
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
public class AllStoneMaterialProvider extends MaterialProvider<SolidMaterial>
```

Provider supplying AllStoneMaterial values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `MaterialCache` | `materialCache` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `AllStoneMaterialProvider(@Nonnull MaterialCache materialCache)` |
| `public` | `SolidMaterial` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
