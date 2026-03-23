---
title: "TimeRecorder"
kind: "class"
package: "com.hypixel.hytale.common.benchmark"
fqcn: "com.hypixel.hytale.common.benchmark.TimeRecorder"
api_surface: false
extends: "ContinuousValueRecorder"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "benchmark"
---

**Package:** `com.hypixel.hytale.common.benchmark`

```java
public class TimeRecorder extends ContinuousValueRecorder
```

Concrete implementation extending `ContinuousValueRecorder`.

## Fields

| Field | Type | Description |
|---|---|---|
| `DEFAULT_COLUMN_SEPARATOR` | `String` | Static final String field. |
| `DEFAULT_COLUMN_FORMAT_HEADER` | `String` | Static final String field. |
| `DEFAULT_COLUMN_FORMAT_VALUE` | `String` | Static final String field. |
| `DEFAULT_COLUMNS` | `String[]` | Static final String[] field. |
| `NANOS_TO_SECONDS` | `double` | Static final double field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `start()` | `long` | public method. |
| `end(long start)` | `double` | public method. |
| `recordNanos(long nanos)` | `double` | public method. |
| `toString()` | `String` | public method. |
| `formatTime(double secs)` | `String` | static public method. |
| `format(double val, String suffix)` | `String` | static protected method. |
| `formatHeader(@Nonnull Formatter formatter)` | `void` | public method. |
| `formatHeader(@Nonnull Formatter formatter, @Nonnull String columnFormatHeader)` | `void` | public method. |
| `formatValues(@Nonnull Formatter formatter)` | `void` | public method. |
| `formatValues(@Nonnull Formatter formatter, @Nonnull String columnFormatValue)` | `void` | public method. |
