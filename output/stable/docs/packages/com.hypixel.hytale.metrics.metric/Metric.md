---
title: "Metric"
kind: "class"
package: "com.hypixel.hytale.metrics.metric"
fqcn: "com.hypixel.hytale.metrics.metric.Metric"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "metrics"
  - "metric"
---

**Package:** `com.hypixel.hytale.metrics.metric`

```java
public class Metric
```

Provides Metric functionality within the metric subsystem.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private` | `long` | `min` |  |
| `private final` | `AverageCollector` | `average` | `new AverageCollector()` |
| `private` | `long` | `max` |  |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `Metric()` |
| `public` | `void` | `add(long value)` |
| `public` | `void` | `remove(long value)` |
| `public` | `long` | `getMin()` |
| `public` | `double` | `getAverage()` |
| `public` | `long` | `getMax()` |
| `public` | `void` | `clear()` |
| `public` | `void` | `resetMinMax()` |
| `public` | `void` | `calculateMinMax(long value)` |
| `public` | `void` | `addToAverage(long value)` |
| `public` | `void` | `set(@Nonnull Metric metric)` |
| `@Nonnull @Override public` | `String` | `toString()` |
