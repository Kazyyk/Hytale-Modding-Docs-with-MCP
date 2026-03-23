---
title: "SynchronizedAverageCollector"
kind: "class"
package: "com.hypixel.hytale.metrics.metric"
fqcn: "com.hypixel.hytale.metrics.metric.SynchronizedAverageCollector"
api_surface: false
extends: "AverageCollector"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "metrics"
  - "metric"
---

**Package:** `com.hypixel.hytale.metrics.metric`

```java
public class SynchronizedAverageCollector extends AverageCollector
```

Extends `AverageCollector` to provide SynchronizedAverageCollector functionality.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public synchronized` | `double` | `get()` |
| `@Override public synchronized` | `long` | `size()` |
| `@Override public synchronized` | `double` | `addAndGet(double v)` |
| `@Override public synchronized` | `void` | `add(double v)` |
| `@Override public synchronized` | `void` | `remove(double v)` |
| `@Override public synchronized` | `void` | `clear()` |
