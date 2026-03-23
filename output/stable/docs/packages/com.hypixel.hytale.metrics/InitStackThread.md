---
title: "InitStackThread"
kind: "interface"
package: "com.hypixel.hytale.metrics"
fqcn: "com.hypixel.hytale.metrics.InitStackThread"
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

```java
public interface InitStackThread
```

Interface for threads that capture their initialization stack trace. Exposes `getInitStack()` returning the `StackTraceElement[]` from thread creation.
