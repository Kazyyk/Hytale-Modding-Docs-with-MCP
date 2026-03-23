---
title: "AverageCollector"
kind: "class"
package: "com.hypixel.hytale.metrics.metric"
fqcn: "com.hypixel.hytale.metrics.metric.AverageCollector"
api_surface: false
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
public class AverageCollector
```

Provides AverageCollector functionality within the metric subsystem.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private` | `double` | `val` | `0.0` |
| `private` | `long` | `n` | `0L` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `double` | `get()` |
| `public` | `long` | `size()` |
| `public` | `double` | `addAndGet(double v)` |
| `public` | `void` | `add(double v)` |
| `public` | `void` | `remove(double v)` |
| `public` | `void` | `clear()` |
| `public static` | `double` | `add(double val, double v, int n)` |
| `public` | `void` | `set(double v)` |
