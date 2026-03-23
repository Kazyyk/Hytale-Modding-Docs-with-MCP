---
title: "OnAddOrRemoved"
kind: "class"
package: "com.hypixel.hytale.builtin.crafting.system"
fqcn: "com.hypixel.hytale.builtin.crafting.system.BenchSystems.OnAddOrRemoved"
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
public static class OnAddOrRemoved extends RefSystem
```

ECS system that handles bench block entity lifecycle. On add, checks if the block type has a valid bench configuration; on remove, closes all open windows and drops stored upgrade items as item entities.
