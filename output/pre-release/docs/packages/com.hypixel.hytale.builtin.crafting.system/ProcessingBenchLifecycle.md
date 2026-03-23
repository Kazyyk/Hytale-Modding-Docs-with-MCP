---
title: "ProcessingBenchLifecycle"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.system"
fqcn: "com.hypixel.hytale.builtin.crafting.system.BenchSystems.ProcessingBenchLifecycle"
api_surface: false
extends: "RefSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T20:55:01Z"
tags:
  - "crafting"
  - "ecs-system"
---

**Package:** `com.hypixel.hytale.builtin.crafting.system`

```java
public static class ProcessingBenchLifecycle extends RefSystem
```

ECS system that handles processing bench block lifecycle. On add, initializes the bench configuration and sets up input/output/fuel slots. On remove (non-unload), drops all contained items as item entities.
