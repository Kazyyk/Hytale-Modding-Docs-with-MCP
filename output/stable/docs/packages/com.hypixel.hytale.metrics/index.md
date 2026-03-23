---
title: "com.hypixel.hytale.metrics"
kind: "package"
package: "com.hypixel.hytale.metrics"
fqcn: "com.hypixel.hytale.metrics"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "metrics"
  - "monitoring"
---

**Package:** `com.hypixel.hytale.metrics`

Server metrics and monitoring infrastructure. Provides a registry-based system for collecting, encoding, and reporting JVM and application-level metrics via BSON serialization.

## Types

| Type | Kind | Description |
|---|---|---|
| [ExecutorMetricsRegistry](ExecutorMetricsRegistry.md) | class | A metrics registry that ensures encoding runs on the metric's own executor thread via `ExecutorMetric. |
| [InitStackThread](InitStackThread.md) | interface | Interface for threads that capture their initialization stack trace. |
| [JVMMetrics](JVMMetrics.md) | class | Collects JVM-level metrics including memory usage (heap, non-heap, pools), garbage collection stats, thread states, class loading counts, and CPU load. |
| [MetricProvider](MetricProvider.md) | interface | Functional interface for metric value providers. |
| [MetricResults](MetricResults.md) | class | Collects and merges encoded metric results from multiple `MetricsRegistry` instances. |
| [MetricsRegistry](MetricsRegistry.md) | class | Generic registry that maps string identifiers to metric provider functions. |
