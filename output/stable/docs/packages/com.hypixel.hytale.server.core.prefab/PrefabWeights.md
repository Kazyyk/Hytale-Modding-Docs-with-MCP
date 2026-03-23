---
title: "PrefabWeights"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab"
fqcn: "com.hypixel.hytale.server.core.prefab.PrefabWeights"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "prefab"
  - "weights"
  - "random"
---

**Package:** `com.hypixel.hytale.server.core.prefab`

```java
public class PrefabWeights
```

Weighted random selection system for prefabs. Stores a mapping of prefab names to weight values and a default weight for unmapped entries. Supports lazy initialization of cumulative weight arrays for O(n) selection. Provides parsing from a comma-separated `name=value` string format.

The `NONE` sentinel instance has zero sum and empty weights, effectively disabling selection.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `Codec<PrefabWeights>` | `CODEC` |
| `public static final` | `PrefabWeights` | `NONE` |
| `public static final` | `double` | `DEFAULT_WEIGHT` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `size()` |
| `@Nullable public` | `<T> T` | `get(@Nonnull T[] elements, @Nonnull Function<T, String> nameFunc, @Nonnull Random random)` |
| `@Nullable public` | `<T> T` | `get(@Nonnull T[] elements, @Nonnull Function<T, String> nameFunc, double value)` |
| `public` | `double` | `getWeight(String prefab)` |
| `public` | `void` | `setWeight(String prefab, double weight)` |
| `public` | `void` | `removeWeight(String prefab)` |
| `public` | `double` | `getDefaultWeight()` |
| `public` | `void` | `setDefaultWeight(double defaultWeight)` |
| `@Nonnull public` | `String` | `getMappingString()` |
| `@Nonnull public static` | `PrefabWeights` | `parse(@Nonnull String mappingString)` |
| `public` | `Set<Entry<String>>` | `entrySet()` |
