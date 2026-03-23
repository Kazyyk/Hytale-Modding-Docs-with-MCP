---
title: "ArrayUtil"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.ArrayUtil"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator`

```java
public class ArrayUtil
```

Utility methods for array copying, appending, splitting lists into parts, and sorted/binary searching.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `T[]` | `brokenCopyOf(@Nonnull T[] a)` |
| `public static` | `void` | `copy(@Nonnull T[] source, @Nonnull T[] destination)` |
| `public static` | `T[]` | `append(@Nonnull T[] a, T e)` |
| `public static` | `List<List<T>>` | `split(@Nonnull List<T> list, int partCount)` |
| `public static` | `int[]` | `getPartSizes(int total, int partCount)` |
| `public static` | `int` | `sortedSearch(@Nonnull List<T> sortedList, @Nonnull G gauge, @Nonnull BiFunction<G, T, Integer> comparator)` |
| `public static` | `int` | `binarySearch(@Nonnull List<T> sortedList, @Nonnull G gauge, @Nonnull BiFunction<G, T, Integer> comparator)` |
