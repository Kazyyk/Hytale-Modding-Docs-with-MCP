---
title: "TimeInstrument"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments.TimeInstrument"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "engine"
  - "performanceinstruments"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.engine.performanceinstruments`

```java
public class TimeInstrument
```

Aggregates timing samples from hierarchical probes across multiple chunk generation runs. Each `takeSample` call adds probe timings to a running total. The `toString` method produces a formatted performance report showing average time per sample for each probe and its children, in milliseconds.

## Inner Types

| Type | Kind | Description |
|---|---|---|
| [TimeInstrument.Probe](TimeInstrument.Probe.md) | class | Hierarchical nanosecond timer with child probes |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `int` | `sampleCount` |
| `@Nonnull private` | `TimeInstrument.Probe` | `totalProbe` |
| `private` | `String` | `header` |

## Constructors

| Modifier | Signature |
|---|---|
| `public` | `TimeInstrument(@Nonnull String header)` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `takeSample(@Nonnull TimeInstrument.Probe probe)` |
| `@Nonnull @Override public` | `String` | `toString()` |
| `@Nonnull private` | `String` | `toString(int indentation, @Nonnull TimeInstrument.Probe probe)` |
