---
title: "SimpleShader"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.shaders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.shaders.SimpleShader"
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
public class SimpleShader<T> implements Shader<T>
```

Implementation of `Shader<T>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `value` | `T` | final T field. |

## Constructors

| Constructor | Description |
|---|---|
| `SimpleShader(@Nonnull T value)` | Creates a new SimpleShader instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `of(@Nonnull T value)` | `SimpleShader<T>` | static public method. |
| `shade(T current, long seed)` | `T` | public method. |
| `shade(T current, long seedA, long seedB)` | `T` | public method. |
| `shade(T current, long seedA, long seedB, long seedC)` | `T` | public method. |
| `toString()` | `String` | public method. |
