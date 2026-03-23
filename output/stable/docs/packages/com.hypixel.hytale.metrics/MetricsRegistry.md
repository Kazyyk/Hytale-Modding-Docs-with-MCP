---
title: "MetricsRegistry"
kind: "class"
package: "com.hypixel.hytale.metrics"
fqcn: "com.hypixel.hytale.metrics.MetricsRegistry"
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
public class MetricsRegistry
```

Generic registry that maps string identifiers to metric provider functions. Supports nested registries, codec-based value encoding, and BSON serialization. Type parameter `T` is the metric context type.
