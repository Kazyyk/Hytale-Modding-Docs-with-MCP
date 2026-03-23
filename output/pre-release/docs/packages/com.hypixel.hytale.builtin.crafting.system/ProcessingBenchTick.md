---
title: "ProcessingBenchTick"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.system"
fqcn: "com.hypixel.hytale.builtin.crafting.system.BenchSystems.ProcessingBenchTick"
api_surface: false
extends: "EntityTickingSystem"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-22T20:55:01Z"
tags:
  - "crafting"
  - "ecs-system"
---

**Package:** `com.hypixel.hytale.builtin.crafting.system`

```java
public static class ProcessingBenchTick extends EntityTickingSystem
```

ECS ticking system that advances processing bench state each tick. Manages recipe validation, input progress, fuel consumption, output production, block interaction state transitions (default/Processing/ProcessCompleted), and sound event playback.
