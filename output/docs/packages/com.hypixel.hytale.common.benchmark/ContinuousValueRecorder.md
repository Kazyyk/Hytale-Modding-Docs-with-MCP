---
title: "ContinuousValueRecorder"
kind: "class"
package: "com.hypixel.hytale.common.benchmark"
fqcn: "com.hypixel.hytale.common.benchmark.ContinuousValueRecorder"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "benchmark"
---

**Package:** `com.hypixel.hytale.common.benchmark`

```java
public class ContinuousValueRecorder
```

Class in the benchmark subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `minValue` | `double` | double field. |
| `maxValue` | `double` | double field. |
| `sumValues` | `double` | double field. |
| `count` | `long` | long field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `reset()` | `void` | public method. |
| `getMinValue(double def)` | `double` | public method. |
| `getMinValue()` | `double` | public method. |
| `getMaxValue(double def)` | `double` | public method. |
| `getMaxValue()` | `double` | public method. |
| `getCount()` | `long` | public method. |
| `getAverage(double def)` | `double` | public method. |
| `getAverage()` | `double` | public method. |
| `record(double value)` | `double` | public method. |
