---
title: "QueueMaterialProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.materialproviders.QueueMaterialProvider"
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
public class QueueMaterialProvider<V> extends MaterialProvider<V>
```

Provider supplying QueueMaterial values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `MaterialProvider<V>[]` | `queue` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `QueueMaterialProvider(@Nonnull List<MaterialProvider<V>> queue)` |
| `@Nullable @Override public` | `V` | `getVoxelTypeAt(@Nonnull MaterialProvider.Context context)` |
