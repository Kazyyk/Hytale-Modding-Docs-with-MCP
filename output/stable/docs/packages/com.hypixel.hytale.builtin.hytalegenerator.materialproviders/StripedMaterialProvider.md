---
title: "StripedMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.StripedMaterialProvider"
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
public class StripedMaterialProvider<V> extends MaterialProvider<V>
```

Provider supplying StripedMaterial values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `MaterialProvider<V>` | `materialProvider` |
| `@Nonnull private final` | `StripedMaterialProvider.Stripe[]` | `stripes` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `StripedMaterialProvider(@Nonnull MaterialProvider<V> materialProvider, @Nonnull List<StripedMaterialProvider.Stripe> stripes)` |
| `@Nullable @Override public` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
