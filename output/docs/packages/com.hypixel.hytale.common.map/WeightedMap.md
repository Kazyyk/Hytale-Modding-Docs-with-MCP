---
title: "WeightedMap"
kind: "class"
package: "com.hypixel.hytale.common.map"
fqcn: "com.hypixel.hytale.common.map.WeightedMap"
api_surface: false
extends: null
implements:
  - "IWeightedMap"
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "common"
  - "map"
---
**Package:** `com.hypixel.hytale.common.map`

```java
public class WeightedMap<T> implements IWeightedMap<T>
```

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double` | `EPSILON` | `0.99999` |
| `public static final` | `double` | `ONE_MINUS_EPSILON` | `9.99999999995449E-6` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `double` | `EPSILON` |
| `public static final` | `double` | `ONE_MINUS_EPSILON` |
| `private final` | `T[]` | `keys` |
| `private final` | `double[]` | `values` |
| `private final` | `double` | `sum` |
| `private final` | `T[]` | `emptyKeys` |
| `private` | `T[]` | `keys` |
| `private` | `double[]` | `values` |
| `private` | `int` | `size` |
| `protected final` | `T[]` | `keys` |
| `protected final` | `T` | `key` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `<T> WeightedMap.Builder<T>` | `builder(T[] emptyKeys)` |
| `private` | `` | `WeightedMap(@Nonnull T[] keys, double[] values, double sum)` |
| `public` | `T` | `get(double value)` |
| `public` | `T` | `get(@Nonnull DoubleSupplier supplier)` |
| `public` | `T` | `get(@Nonnull Random random)` |
| `public` | `T` | `get(int x, int z, @Nonnull BiIntToDoubleFunction supplier)` |
| `public` | `T` | `get(long x, long z, @Nonnull BiLongToDoubleFunction supplier)` |
| `public` | `T` | `get(double x, double z, @Nonnull BiDoubleToDoubleFunction supplier)` |
| `public` | `<K> T` | `get(int seed, int x, int z, @Nonnull IWeightedMap.SeedCoordinateFunction<K> supplier, K k)` |
| `public` | `int` | `size()` |
| `public` | `boolean` | `contains(T obj)` |
| `public` | `void` | `forEach(@Nonnull Consumer<T> consumer)` |
| `public` | `void` | `forEachEntry(@Nonnull ObjDoubleConsumer<T> consumer)` |
| `public` | `T[]` | `internalKeys()` |
| `public` | `T[]` | `toArray()` |
| `public` | `<K> IWeightedMap<K>` | `resolveKeys(@Nonnull Function<T, K> mapper, @Nonnull IntFunction<K[]> arraySupplier)` |
| `public` | `String` | `toString()` |
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
| `public` | `T` | `get(double value)` |
| `public` | `T` | `get(DoubleSupplier supplier)` |
| `public` | `T` | `get(Random random)` |
| `public` | `T` | `get(int x, int z, BiIntToDoubleFunction supplier)` |
| `public` | `T` | `get(long x, long z, BiLongToDoubleFunction supplier)` |
| `public` | `T` | `get(double x, double z, BiDoubleToDoubleFunction supplier)` |
| `public` | `<K> T` | `get(int seed, int x, int z, IWeightedMap.SeedCoordinateFunction<K> supplier, K k)` |
| `public` | `int` | `size()` |
| `public` | `boolean` | `contains(@Nullable T obj)` |
| `public` | `void` | `forEach(@Nonnull Consumer<T> consumer)` |
| `public` | `void` | `forEachEntry(@Nonnull ObjDoubleConsumer<T> consumer)` |
| `public` | `T[]` | `internalKeys()` |
| `public` | `T[]` | `toArray()` |
| `public` | `<K> IWeightedMap<K>` | `resolveKeys(@Nonnull Function<T, K> mapper, @Nonnull IntFunction<K[]> arraySupplier)` |
| `public` | `String` | `toString()` |
