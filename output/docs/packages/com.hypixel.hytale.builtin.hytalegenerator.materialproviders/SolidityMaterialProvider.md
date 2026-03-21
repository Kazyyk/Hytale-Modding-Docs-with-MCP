---
title: "SolidityMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.SolidityMaterialProvider"
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
public class SolidityMaterialProvider<V> extends MaterialProvider<V>
```

Provider supplying SolidityMaterial values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `MaterialProvider<V>` | `solidMaterialProvider` |
| `@Nonnull private final` | `MaterialProvider<V>` | `emptyMaterialProvider` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `SolidityMaterialProvider(@Nonnull MaterialProvider<V> solidMaterialProvider, @Nonnull MaterialProvider<V> emptyMaterialProvider)` |
| `@Override public` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
