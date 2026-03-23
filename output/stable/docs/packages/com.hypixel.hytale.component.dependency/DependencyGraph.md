---
title: "DependencyGraph"
kind: "class"
package: "com.hypixel.hytale.component.dependency"
fqcn: "com.hypixel.hytale.component.dependency.DependencyGraph"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "component"
  - "dependency"
  - "class"
---

**Package:** `com.hypixel.hytale.component.dependency`

```java
public class DependencyGraph
```

Directed graph of system dependencies used to determine a valid execution order for ECS systems. Performs topological sorting to resolve the final system schedule.
