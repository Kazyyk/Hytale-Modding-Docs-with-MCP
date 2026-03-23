---
title: "RelationalShader"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.shaders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.shaders.RelationalShader"
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
public class RelationalShader<T> implements Shader<T>
```

Implementation of `Shader<T>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `relations` | `Map<T, Shader<T>>` | final Map<T, Shader<T>> field. |
| `onMissingKey` | `Shader<T>` | final Shader<T> field. |

## Constructors

| Constructor | Description |
|---|---|
| `RelationalShader(@Nonnull Shader<T> onMissingKey)` | Creates a new RelationalShader instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `addRelation(@Nonnull T key, @Nonnull Shader<T> value)` | `RelationalShader<T>` | public method. |
| `shade(T current, long seed)` | `T` | public method. |
| `shade(T current, long seedA, long seedB)` | `T` | public method. |
| `shade(T current, long seedA, long seedB, long seedC)` | `T` | public method. |
| `toString()` | `String` | public method. |
