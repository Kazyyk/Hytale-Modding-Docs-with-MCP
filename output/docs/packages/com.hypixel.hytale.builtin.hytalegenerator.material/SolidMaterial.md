---
title: "SolidMaterial"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.material"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.material.SolidMaterial"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "material"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.material`

```java
public class SolidMaterial
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `MaterialCache` | `materialCache` |
| `public final` | `int` | `blockId` |
| `public final` | `int` | `support` |
| `public final` | `int` | `rotation` |
| `public final` | `int` | `filler` |
| `@Nullable public final` | `Holder<ChunkStore>` | `holder` |

## Constructors

| Modifier | Signature |
|---|---|
| `` | `SolidMaterial(@Nonnull MaterialCache materialCache, int blockId, int support, int rotation, int filler, @Nullable Holder<ChunkStore> holder)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `equals(Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `public static` | `int` | `contentHash(int blockId, int support, int rotation, int filler, @Nullable Holder<ChunkStore> holder)` |
| `@Nonnull @Override public` | `String` | `toString()` |
