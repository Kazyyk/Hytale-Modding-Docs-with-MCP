---
title: "LayeredCarta"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.cartas"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.cartas.LayeredCarta"
api_surface: false
extends: "TriCarta<R>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.framework.cartas`

```java
public class LayeredCarta<R> extends TriCarta<R>
```

Concrete implementation extending `TriCarta<R>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `layers` | `List<TriCarta<R>>` | final List<TriCarta<R>> field. |
| `allValues` | `List<R>` | final List<R> field. |
| `defaultValue` | `R` | final R field. |

## Constructors

| Constructor | Description |
|---|---|
| `LayeredCarta(@Nonnull R defaultValue)` | Creates a new LayeredCarta instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `apply(int x, int y, int z, @Nonnull WorkerIndexer.Id id)` | `R` | public method. |
| `allPossibleValues()` | `List<R>` | public method. |
| `addLayer(@Nonnull TriCarta<R> layer)` | `LayeredCarta<R>` | public method. |
| `toString()` | `String` | public method. |
