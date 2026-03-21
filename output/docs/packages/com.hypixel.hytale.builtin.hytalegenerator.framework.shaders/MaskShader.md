---
title: "MaskShader"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.shaders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.shaders.MaskShader"
api_surface: false
extends: ~
implements: 
  - "Shader<T>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.framework.shaders`

```java
public class MaskShader<T> implements Shader<T>
```

Implementation of `Shader<T>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `childShader` | `Shader<T>` | final Shader<T> field. |
| `mask` | `Predicate<T>` | final Predicate<T> field. |
| `seedGenerator` | `SeedGenerator` | SeedGenerator field. |

## Constructors

| Constructor | Description |
|---|---|
| `MaskShader(Predicate<T> mask, Shader<T> childShader, long seed)` | Creates a new MaskShader instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `builder(@Nonnull Class<T> dataType)` | `MaskShader.Builder<T>` | static public method. |
| `shade(T current, long seed)` | `T` | public method. |
| `shade(T current, long seedA, long seedB)` | `T` | public method. |
| `shade(T current, long seedA, long seedB, long seedC)` | `T` | public method. |
| `toString()` | `String` | public method. |
