---
title: "WeighedShader"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.shaders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.shaders.WeighedShader"
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
public class WeighedShader<T> implements Shader<T>
```

Implementation of `Shader<T>`.

## Constructors

| Constructor | Description |
|---|---|
| `WeighedShader(@Nonnull Shader<T> initialChild, double weight)` | Creates a new WeighedShader instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `add(@Nonnull Shader<T> child, double weight)` | `WeighedShader<T>` | public method. |
| `setSeed(long seed)` | `WeighedShader<T>` | public method. |
| `shade(T current, long seed)` | `T` | public method. |
| `shade(T current, long seedA, long seedB)` | `T` | public method. |
| `shade(T current, long seedA, long seedB, long seedC)` | `T` | public method. |
| `toString()` | `String` | public method. |
