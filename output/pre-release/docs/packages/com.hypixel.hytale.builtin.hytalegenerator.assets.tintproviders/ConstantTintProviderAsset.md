---
title: "ConstantTintProviderAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.tintproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.tintproviders.ConstantTintProviderAsset"
api_surface: false
extends: "TintProviderAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "tintproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.tintproviders`

```java
public class ConstantTintProviderAsset extends TintProviderAsset
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `Color` | `DEFAULT_COLOR` |
| `@Nonnull public static final` | `BuilderCodec<ConstantTintProviderAsset>` | `CODEC` |
| `private` | `Color` | `color` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull @Override public` | `TintProvider` | `build(@Nonnull TintProviderAsset.Argument argument)` |
