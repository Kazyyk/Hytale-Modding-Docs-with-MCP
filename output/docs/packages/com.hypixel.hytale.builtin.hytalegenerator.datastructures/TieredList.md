---
title: "TieredList"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.datastructures"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.datastructures.TieredList"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.datastructures`

```java
public class TieredList<E>
```

Class in the datastructures subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `elements` | `Map<Integer, ArrayList<E>>` | final Map<Integer, ArrayList<E>> field. |
| `tiers` | `int` | final int field. |
| `sortedTierList` | `List<Integer>` | List<Integer> field. |

## Constructors

| Constructor | Description |
|---|---|
| `TieredList()` | Creates a new TieredList instance. |
| `TieredList(int tiers)` | Creates a new TieredList instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `addTier(int tier)` | `TieredList<E>` | public method. |
| `removeTier(int tier)` | `TieredList<E>` | public method. |
| `add(@Nonnull E element, int tier)` | `void` | public method. |
| `isEmpty()` | `boolean` | public method. |
| `peek()` | `E` | public method. |
| `remove()` | `E` | public method. |
| `size()` | `int` | public method. |
| `size(int tier)` | `int` | public method. |
| `forEach(int tier, @Nonnull Consumer<? super E> consumer)` | `TieredList<E>` | public method. |
| `removeEach(int tier, @Nonnull Consumer<? super E> consumer)` | `TieredList<E>` | public method. |
| `forEach(@Nonnull Consumer<? super E> consumer)` | `TieredList<E>` | public method. |
| `removeEach(@Nonnull Consumer<? super E> consumer)` | `TieredList<E>` | public method. |
| `iterator(int tier)` | `Iterator<E>` | public method. |
| `listOf(int tier)` | `List<E>` | public method. |
| `tierExists(int tier)` | `boolean` | public method. |
| `getTiers()` | `List<Integer>` | public method. |
| `updateSortedTierList()` | `void` | private method. |
| `toString()` | `String` | public method. |
