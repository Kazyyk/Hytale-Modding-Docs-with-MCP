---
title: "WeightedMap.Builder"
kind: "class"
package: "com.hypixel.hytale.common.map"
fqcn: "com.hypixel.hytale.common.map.WeightedMap.Builder"
api_surface: false
extends: null
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "common"
  - "map"
---
**Package:** `com.hypixel.hytale.common.map`

```java
public static class Builder<T>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `T[]` | `emptyKeys` |
| `private` | `T[]` | `keys` |
| `private` | `double[]` | `values` |
| `private` | `int` | `size` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | `` | `Builder(T[] emptyKeys)` |
| `public` | `WeightedMap.Builder<T>` | `putAll(@Nullable IWeightedMap<T> map)` |
| `public` | `WeightedMap.Builder<T>` | `putAll(@Nullable T[] arr, @Nonnull ToDoubleFunction<T> weight)` |
| `public` | `WeightedMap.Builder<T>` | `put(T obj, double weight)` |
| `public` | `void` | `ensureCapacity(int toAdd)` |
| `private` | `void` | `resize(int newLength)` |
| `private` | `void` | `insert(T key, double value)` |
| `public` | `int` | `size()` |
| `private` | `int` | `allocated()` |
| `public` | `void` | `clear()` |
| `public` | `IWeightedMap<T>` | `build()` |
