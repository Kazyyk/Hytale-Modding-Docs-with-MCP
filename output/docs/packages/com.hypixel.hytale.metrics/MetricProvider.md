---
title: "MetricProvider"
kind: "interface"
package: "com.hypixel.hytale.metrics"
fqcn: "com.hypixel.hytale.metrics.MetricProvider"
api_surface: true
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "metrics"
  - "monitoring"
---

**Package:** `com.hypixel.hytale.metrics`

```java
public interface MetricProvider
```

Functional interface for metric value providers. Implementations encode their metric data to `BsonValue` via the `encode(ExtraInfo)` method.
