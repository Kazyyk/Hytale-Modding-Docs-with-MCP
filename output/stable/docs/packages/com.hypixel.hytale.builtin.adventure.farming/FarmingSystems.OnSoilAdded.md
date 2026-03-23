---
title: "FarmingSystems.OnSoilAdded"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.farming"
fqcn: "com.hypixel.hytale.builtin.adventure.farming.FarmingSystems.OnSoilAdded"
api_surface: false
extends: "RefSystem<ChunkStore>"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "farming"
  - "ecs"
  - "system"
---

**Package:** `com.hypixel.hytale.builtin.adventure.farming`

```java
public static class FarmingSystems.OnSoilAdded extends RefSystem<ChunkStore>
```

Initializes newly added [TilledSoilBlock](TilledSoilBlock.md) components. If the soil is not planted and has no decay time set, computes a random decay duration from the soil config and schedules the tick.

Declared as a static inner class of [FarmingSystems](FarmingSystems.md). Registered by [FarmingPlugin](FarmingPlugin.md) during setup.

## Key Methods

| Return Type | Signature |
|---|---|
| `void` / `Query` | `onEntityAdded(...)` |
| `void` / `Query` | `onEntityRemove(...)` |
| `void` / `Query` | `getQuery(...)` |
