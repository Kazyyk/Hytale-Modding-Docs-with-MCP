---
title: "SingleElementCarta"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.framework.cartas"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.framework.cartas.SingleElementCarta"
api_surface: false
extends: "BiCarta<R>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "worldgen"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.framework.cartas`

```java
public class SingleElementCarta<R> extends BiCarta<R>
```

Concrete implementation extending `BiCarta<R>`.

## Fields

| Field | Type | Description |
|---|---|---|
| `element` | `R` | R field. |

## Constructors

| Constructor | Description |
|---|---|
| `SingleElementCarta()` | Creates a new SingleElementCarta instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `of(@Nonnull R element)` | `SingleElementCarta<R>` | static public method. |
| `apply(int x, int z, @Nonnull WorkerIndexer.Id id)` | `R` | public method. |
| `allPossibleValues()` | `List<R>` | public method. |
