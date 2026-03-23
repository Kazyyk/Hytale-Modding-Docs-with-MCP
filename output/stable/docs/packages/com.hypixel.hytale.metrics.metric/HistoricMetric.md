---
title: "HistoricMetric"
kind: "class"
package: "com.hypixel.hytale.metrics.metric"
fqcn: "com.hypixel.hytale.metrics.metric.HistoricMetric"
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
public class HistoricMetric
```

Provides HistoricMetric functionality within the metric subsystem.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `HistoricMetric[]` | `EMPTY_ARRAY` | `new HistoricMetric[0]` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `long[]` | `periodsNanos` |
| `@Nonnull private final` | `AverageCollector[]` | `periodAverages` |
| `@Nonnull private final` | `int[]` | `startIndices` |
| `private final` | `int` | `bufferSize` |
| `@Nonnull private final` | `long[]` | `timestamps` |
| `@Nonnull private final` | `long[]` | `values` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `private` | | `HistoricMetric()` |
| `private` | | `HistoricMetric(@Nonnull HistoricMetric.Builder builder)` |
| `public` | `long[]` | `getPeriodsNanos()` |
| `public` | `long` | `calculateMin(int periodIndex)` |
| `public` | `double` | `getAverage(int periodIndex)` |
| `public` | `long` | `calculateMax(int periodIndex)` |
| `public` | `void` | `clear()` |
| `public` | `void` | `add(long timestampNanos, long value)` |
| `public` | `long[]` | `getTimestamps(int periodIndex)` |
| `public` | `long[]` | `getValues(int periodIndex)` |
| `public` | `long[]` | `getAllTimestamps()` |
| `public` | `long[]` | `getAllValues()` |
| `public` | `void` | `setAllTimestamps(@Nonnull long[] timestamps)` |
| `public` | `void` | `setAllValues(@Nonnull long[] values)` |
| `public` | `long` | `getLastValue()` |
| `@Nonnull public static` | `HistoricMetric.Builder` | `builder(long minimumInterval, @Nonnull TimeUnit unit)` |
