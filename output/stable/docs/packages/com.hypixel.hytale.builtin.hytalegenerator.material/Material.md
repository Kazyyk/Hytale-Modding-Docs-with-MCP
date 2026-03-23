---
title: "Material"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.material"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.material.Material"
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
public final class Material
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `SolidMaterial` | `solid` |
| `@Nonnull private final` | `FluidMaterial` | `fluid` |
| `private` | `Material.Hash` | `hashCode` |
| `private` | `Material.Hash` | `materialIdsHash` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `Material(@Nonnull SolidMaterial solid, @Nonnull FluidMaterial fluid)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `boolean` | `equals(Object o)` |
| `@Override public` | `int` | `hashCode()` |
| `public` | `int` | `hashMaterialIds()` |
| `public static` | `int` | `hashCode(@Nonnull SolidMaterial solid, @Nonnull FluidMaterial fluid)` |
| `public static` | `int` | `hashMaterialIds(@Nonnull SolidMaterial solid, @Nonnull FluidMaterial fluid)` |
| `@Nonnull public` | `SolidMaterial` | `solid()` |
| `@Nonnull public` | `FluidMaterial` | `fluid()` |
| `@Nonnull @Override public` | `String` | `toString()` |

## Inner Types

- `Material.Hash`
