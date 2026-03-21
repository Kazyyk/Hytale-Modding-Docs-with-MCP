---
title: "TimeDistributionRecorder"
kind: "class"
package: "com.hypixel.hytale.common.benchmark"
fqcn: "com.hypixel.hytale.common.benchmark.TimeDistributionRecorder"
api_surface: false
extends: "TimeRecorder"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "benchmark"
---

**Package:** `com.hypixel.hytale.common.benchmark`

```java
public class TimeDistributionRecorder extends TimeRecorder
```

Concrete implementation extending `TimeRecorder`.

## Fields

| Field | Type | Description |
|---|---|---|
| `minLogRange` | `int` | int field. |
| `maxLogRange` | `int` | int field. |
| `logSteps` | `int` | int field. |
| `valueBins` | `long[]` | long[] field. |

## Constructors

| Constructor | Description |
|---|---|
| `TimeDistributionRecorder(double maxSecs, double minSecs, int logSteps)` | Creates a new TimeDistributionRecorder instance. |
| `TimeDistributionRecorder(double maxSecs, double minSecs)` | Creates a new TimeDistributionRecorder instance. |
| `TimeDistributionRecorder()` | Creates a new TimeDistributionRecorder instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `reset()` | `void` | public method. |
| `recordNanos(long nanos)` | `double` | public method. |
| `timeToIndex(double secs)` | `int` | public method. |
| `indexToTime(int index)` | `double` | public method. |
| `size()` | `int` | public method. |
| `get(int index)` | `long` | public method. |
| `toString()` | `String` | public method. |
| `formatHeader(@Nonnull Formatter formatter, @Nonnull String columnFormatHeader)` | `void` | public method. |
| `formatValues(@Nonnull Formatter formatter, @Nonnull String columnFormatValue)` | `void` | public method. |
| `formatValues(@Nonnull Formatter formatter, long normalValue)` | `void` | public method. |
| `formatValues(@Nonnull Formatter formatter, long normalValue, @Nonnull String columnFormatValue)` | `void` | public method. |
