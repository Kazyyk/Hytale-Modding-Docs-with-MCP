---
title: "IntMap"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.climate.util"
fqcn: "com.hypixel.hytale.server.worldgen.climate.util.IntMap"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "climate"
  - "worldgen"
---

**Package:** `com.hypixel.hytale.server.worldgen.climate.util`

```java
public class IntMap
```

Fixed-size 2D grid of `int` values backed by a flat array. Used by the climate system for storing discrete-valued spatial data such as biome IDs. Values default to -1 when cleared.

## Fields

| Field | Type | Description |
|---|---|---|
| `width` | `int` | Grid width. |
| `height` | `int` | Grid height. |
| `values` | `int[]` | Backing flat array of size `width * height`. |

## Constructors

| Constructor | Description |
|---|---|
| `IntMap(int width, int height)` | Creates a new grid and clears all values to -1. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `index(int x, int y)` | `int` | Converts 2D coordinates to a flat array index. |
| `validate(int index)` | `boolean` | Returns true if the index is within bounds. |
| `clear()` | `void` | Fills all values with -1. |
| `at(int x, int y)` | `int` | Returns the value at the given 2D position. |
| `at(int index)` | `int` | Returns the value at the given flat index. |
| `set(int x, int y, int value)` | `void` | Sets the value at the given 2D position. |
| `set(int index, int value)` | `void` | Sets the value at the given flat index. |
