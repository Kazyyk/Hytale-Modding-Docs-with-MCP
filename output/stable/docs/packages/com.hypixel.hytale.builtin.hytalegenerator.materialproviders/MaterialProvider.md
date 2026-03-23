---
title: "MaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.MaterialProvider"
api_surface: false
extends: null
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
public abstract class MaterialProvider<V>
```

Abstract base class providing shared logic for MaterialProvider implementations.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nullable public abstract` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context var1)` |
| `@Nonnull public static <V>` | `MaterialProvider<V>` | `noMaterialProvider()` |
