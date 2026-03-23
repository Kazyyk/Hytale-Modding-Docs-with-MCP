---
title: "ConstantMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.ConstantMaterialProvider"
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
public class ConstantMaterialProvider<V> extends MaterialProvider<V>
```

Provider supplying ConstantMaterial values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nullable private final` | `V` | `material` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ConstantMaterialProvider(@Nullable V material)` |
| `@Nullable @Override public` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
