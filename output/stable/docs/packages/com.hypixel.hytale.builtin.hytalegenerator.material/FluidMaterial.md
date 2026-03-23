---
title: "FluidMaterial"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.material"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.material.FluidMaterial"
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
public class FluidMaterial
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `MaterialCache` | `materialCache` |
| `public final` | `int` | `fluidId` |
| `public final` | `byte` | `fluidLevel` |

## Constructors

| Modifier | Signature |
|---|---|
| `` | `FluidMaterial(@Nonnull MaterialCache materialCache, int fluidId, byte fluidLevel)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Nonnull public` | `MaterialCache` | `getVoxelCache()` |
| `@Override public final` | `boolean` | `equals(Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `public static` | `int` | `contentHash(int blockId, byte fluidLevel)` |
| `@Nonnull @Override public` | `String` | `toString()` |
