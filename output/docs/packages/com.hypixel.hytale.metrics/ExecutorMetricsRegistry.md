---
title: "ExecutorMetricsRegistry"
kind: "class"
package: "com.hypixel.hytale.metrics"
fqcn: "com.hypixel.hytale.metrics.ExecutorMetricsRegistry"
api_surface: true
extends: "MetricsRegistry<T>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "metrics"
  - "monitoring"
---

**Package:** `com.hypixel.hytale.metrics`

```java
public class ExecutorMetricsRegistry extends MetricsRegistry<T>
```

A metrics registry that ensures encoding runs on the metric's own executor thread via `ExecutorMetric.isInThread()`. Guarantees thread-safe metric collection for executor-bound metrics. Type parameter `T` must implement `ExecutorMetric`.
